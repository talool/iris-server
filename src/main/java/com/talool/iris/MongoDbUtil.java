package com.talool.iris;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

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
