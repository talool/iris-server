package com.talool.iris;

import java.net.InetSocketAddress;

import org.apache.thrift.TException;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talool.iris.thrift.CustomerMetadata_t;
import com.talool.iris.thrift.IrisException_t;
import com.talool.iris.thrift.Iris_t;

/**
 * Iris Thrift Server
 * 
 * @author clintz
 * 
 */
public class IrisServer
{
	private static final Logger LOG = LoggerFactory.getLogger(MongoDbUtil.class);
	private static final int port = 9999;
	private static final String host = "localhost";
	private static final int maxThreads = 10;

	public class IrisHandler implements Iris_t.Iface
	{

		@Override
		public void getNotificationMessages(final CustomerMetadata_t customerMetadata) throws IrisException_t, TException
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("getNotificationMessages: " + customerMetadata);
			}

			MongoDbUtil.get().updateCustomerMetadata(customerMetadata);

		}

	}

	public IrisServer()
	{}

	public void start() throws TTransportException
	{
		final IrisHandler irisHandler = new IrisHandler();
		final Iris_t.Processor<Iris_t.Iface> processor = new Iris_t.Processor<Iris_t.Iface>(irisHandler);

		LOG.info("Starting Iris on port " + port + " with " + maxThreads + " maxWorkerThreads");
		final InetSocketAddress socketAddr = new InetSocketAddress(host, port);
		final TServerTransport serverTransport = new TServerSocket(socketAddr);

		final TThreadPoolServer.Args args = new TThreadPoolServer.Args(serverTransport);
		args.maxWorkerThreads(10);
		args.processor(processor);

		final TServer server = new TThreadPoolServer(args);
		server.serve();

	}
}
