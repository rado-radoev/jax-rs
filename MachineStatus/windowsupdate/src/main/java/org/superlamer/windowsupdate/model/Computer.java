package org.superlamer.windowsupdate.model;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	
	private String computerName;
	private String OSType;
	private List<Link> links = new ArrayList<>();
	
	public Computer() {}
	
	
	public Computer(String computerName, String oSType) {
		super();
		this.computerName = computerName;
		OSType = oSType;
	}

	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getOSType() {
		return OSType;
	}
	
	public void setOSType(String oSType) {
		OSType = oSType;
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
		return String.format("Computer: %s is running: %s", computerName, OSType); 
	}
	
	

}
