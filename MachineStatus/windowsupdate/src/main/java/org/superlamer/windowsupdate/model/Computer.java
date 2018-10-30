package org.superlamer.windowsupdate.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlTransient;

public class Computer {
	
	private String computerName;
	private String osVersion;
	private List<Link> links = new ArrayList<>();
	private static List<String> osVersions = new ArrayList<>();
	private Map<Long, Update> updates = new HashMap<>();
	
	public Computer() {}
	
	
	public Computer(String computerName, String osVersion) {
		super();
		this.computerName = computerName;
		this.osVersion = osVersion;
		addOsVersions(osVersion);
	}

	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getOsVersion() {
		return osVersion;
	}
	
	public void setOsVersion(String oSType) {
		osVersion = oSType;
	}
	
	@XmlTransient
	public Map<Long, Update> getUpdates() {
		return updates;
	}
	
	public void setUpdates(Map<Long, Update> updates) {
		this.updates = updates;
	}
	
	@XmlTransient
	public static List<String> getOsVersions() {
		return osVersions;
	}

	public static void setOsVersionsList(List<String> osVersions) {
		Computer.osVersions = osVersions;
	}
	
	public static void addOsVersions(String osVersion) {
		if (!Computer.osVersions.contains(osVersion)) {
			Computer.osVersions.add(osVersion);
		}
	}
	
	public List<Link> getLinks() {
		return links;
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLinks(String url, String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}
	
	@Override
	public String toString() { 
		return String.format("Computer: %s is running: %s", computerName, osVersion); 
	}
	
	

}
