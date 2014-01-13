package com.talool.iris;

import java.io.IOException;

import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talool.location.MaxMindCityDb;

/**
 * Iris Server
 * 
 * @author clintz
 * 
 */
public class IrisMain
{
	private static final Logger LOG = LoggerFactory.getLogger(IrisMain.class);

	private IrisServer server;

	public static void main(String args[])
	{
		try
		{
			// create MaxMind with default DB file location
			MaxMindCityDb.createInstance();

			final IrisMain main = new IrisMain();
			main.server = new IrisServer();

			try
			{
				main.server.start();
			}
			catch (TTransportException e)
			{
				e.printStackTrace();
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}

	}

}
