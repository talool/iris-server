package com.talool.location;

import java.io.IOException;

import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;

/**
 * MaxMind City DB Utility
 * 
 * @author clintz
 * 
 */
public class MaxMindCityDb
{
	private static final String DEFAULT_DB_FILE = "/usr/local/share/GeoIP/GeoIPCity.dat";

	private static MaxMindCityDb instance = null;
	private LookupService lookupService = null;

	private MaxMindCityDb()
	{};

	/**
	 * Creates the MaxMindCity DB with default DB file
	 * /usr/local/share/GeoIP/GeoIPCity.dat
	 * 
	 * @return
	 * @throws IOException
	 */
	public synchronized static MaxMindCityDb createInstance() throws IOException
	{
		if (instance == null)
		{
			instance = new MaxMindCityDb();
			instance.init(DEFAULT_DB_FILE);
		}

		return instance;
	}

	/**
	 * Creates the MaxMindCity DB with dbFile file
	 * 
	 * @return
	 * @throws IOException
	 */
	public synchronized static MaxMindCityDb createInstance(final String dbFile)
	{
		if (instance == null)
		{
			instance = new MaxMindCityDb();
		}

		return instance;
	}

	public static MaxMindCityDb get()
	{
		return instance;
	}

	public Location getLocation(final String ipAddress)
	{
		return lookupService.getLocation(ipAddress);
	}

	private void init(final String dbFile) throws IOException
	{
		lookupService = new LookupService(dbFile, LookupService.GEOIP_MEMORY_CACHE | LookupService.GEOIP_CHECK_CACHE);
	}

	public static void main(String args[])
	{
		try
		{
			MaxMindCityDb.createInstance();
			final Location loc = MaxMindCityDb.get().getLocation("76.25.26.108");
			System.out.println("region: " + loc.region); // state
			System.out.println("city:" + loc.city);
			System.out.println("countryCode: " + loc.countryCode);
			System.out.println("countryName:" + loc.countryName);
			System.out.println("areaCode: " + loc.area_code);
			System.out.println("lat: " + loc.latitude);
			System.out.println("long: " + loc.longitude);
			System.out.println("postalCode: " + loc.postalCode);
			System.out.println("dmaCode: " + loc.dma_code);
			System.out.println("metroCode: " + loc.metro_code);

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
