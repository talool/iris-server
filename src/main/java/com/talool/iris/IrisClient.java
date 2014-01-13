package com.talool.iris;

import java.util.UUID;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.talool.iris.thrift.CustomerMetadata_t;
import com.talool.iris.thrift.IrisException_t;
import com.talool.iris.thrift.Iris_t;

/**
 * 
 * @author clintz
 * 
 */
public class IrisClient
{
	public void test()
	{
		TTransport transport = new TSocket("localhost", 9999);
		try
		{
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Iris_t.Client client = new Iris_t.Client(protocol);

			CustomerMetadata_t customerMetadata = new CustomerMetadata_t();
			customerMetadata.setEmail("chris" + System.currentTimeMillis() + "@talool.com");
			customerMetadata.setCustomerId(UUID.randomUUID().toString());
			customerMetadata.setIpAddress("76.25.26.108");
			customerMetadata.setDeviceId("deviceId189101");
			// customerMetadata.setLocation( new
			// Location_t().setLatitude(39.7392).setLongitude(-104.9847));

			try
			{
				client.getNotificationMessages(customerMetadata);
			}
			catch (IrisException_t e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (TException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		catch (TTransportException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String args[])
	{
		IrisClient client = new IrisClient();

		client.test();

	}
}
