package com.talool.iris;

import java.net.UnknownHostException;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.maxmind.geoip.Location;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.talool.iris.thrift.CustomerMetadata_t;
import com.talool.location.MaxMindCityDb;

/**
 * 
 * @author clintz
 * 
 */
public class MongoDbUtil
{
	private static final Logger LOG = LoggerFactory.getLogger(MongoDbUtil.class);

	private static final MongoDbUtil INSTANCE = new MongoDbUtil();

	private MongoClient mongoClient = null;
	private DB db = null;

	private MongoDbUtil()
	{
		init();
	}

	public void init()
	{
		// To directly connect to a single MongoDB server (note that this will not
		// auto-discover the primary even
		// if it's a member of a replica set:

		try
		{
			mongoClient = new MongoClient("localhost");
			// or, to connect to a replica set, with auto-discovery of the primary,
			// supply a seed list of members
			// MongoClient mongoClient = new MongoClient(Arrays.asList(new
			// ServerAddress("localhost", 27017),
			// new ServerAddress("localhost", 27018),
			// new ServerAddress("localhost", 27019)));

			db = mongoClient.getDB("talool");
		}
		catch (UnknownHostException e)
		{
			LOG.error(e.getLocalizedMessage(), e);
		}

	}

	public DBObject get(String collectionName, String propertyName, String value)
	{
		DBObject dbObject = null;

		try
		{
			DBCollection coll = db.getCollection("talool");
			BasicDBObject query = new BasicDBObject(propertyName, value);
			dbObject = coll.findOne(query);

		}
		catch (Exception ex)
		{
			LOG.error("Problem getting DB object:" + ex.getLocalizedMessage(), ex);
		}
		return dbObject;

	}

	public void updateCustomerMetadata(final CustomerMetadata_t customerMetadata)
	{
		final DBObject dbObject = get("talool", "customer_id", customerMetadata.getCustomerId());

		if (dbObject == null)
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Customer not found, inserting ID " + customerMetadata.getCustomerId());

				final BasicDBObject doc = new BasicDBObject("customer_id", customerMetadata.getCustomerId()).
						append("email", customerMetadata.getEmail());
				DBCollection coll = db.getCollection("talool");

				final Location location = MaxMindCityDb.get().getLocation(customerMetadata.getIpAddress());

				final BasicDBList list = new BasicDBList();
				final BasicDBObject deviceObject = new BasicDBObject("user_agent", "fill_in_user_agent");
				deviceObject.append("last_update", Calendar.getInstance().getTime());

				final BasicDBObject locationObject = new BasicDBObject().append("location_service_on", false);
				if (location != null)
				{
					locationObject.append("ip", customerMetadata.getIpAddress());
					locationObject.append("city", location.city);
					locationObject.append("state", location.region);
					locationObject.append("zip", location.postalCode);
					locationObject.append("country_code", location.countryCode);
					locationObject.append("area_code", location.area_code);
					locationObject.append("ip_lat", location.latitude);
					locationObject.append("ip_lng", location.longitude);
				}

				deviceObject.append("location", locationObject);

				list.add(deviceObject);

				doc.append("devices", list);

				coll.insert(doc);

			}
			// "location_service_on": false,
			// "city": "Boulder",
			// "state": "CO",
			// "zip": "80202",
			// "lat": 77889172.12,
			// "lng": 798100138.34,
			// "ip": "192.71.12.12"

		}

	}

	public static MongoDbUtil get()
	{
		return INSTANCE;
	}

	public void close()
	{
		mongoClient.close();
	}

	public static void main(String args[])
	{
		DBObject dbObject = MongoDbUtil.get().get("talool", "device_id", "782898923");

		System.out.println(dbObject);
	}
}
