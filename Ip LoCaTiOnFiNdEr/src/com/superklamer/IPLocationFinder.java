
package com.superklamer;

import com.cdyne.ws.IP2Geo;
import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IPInformation;

public class IPLocationFinder {
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass an IP address");
		} else {
			
			String ipAddress = args[0];
			IP2Geo ipService = new IP2Geo();
			IP2GeoSoap geoIPServiceSoap = ipService.getIP2GeoSoap();
			IPInformation geoIP = geoIPServiceSoap.resolveIP(ipAddress, "");
			System.out.println(geoIP.getCountry());
		}
	}
	

}
