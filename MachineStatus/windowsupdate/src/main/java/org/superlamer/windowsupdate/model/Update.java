package org.superlamer.windowsupdate.model;

import java.util.ArrayList;
import java.util.List;

public class Update {
	
	private long kbNumber;
	private String description;
	private String name;
	private double size;
	private List<Link> links = new ArrayList<>();
	
	public Update() {}
	
	public Update(long kbNumber, String description, String name, double size) {
		super();
		this.kbNumber = kbNumber;
		this.description = description;
		this.name = name;
		this.size = size;
	}
	
	public long getKbNumber() {
		return kbNumber;
	}
	
	public void setKbNumber(long kbNumber) {
		this.kbNumber = kbNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
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
		return String.format("KB%d %s %s %.2fKB", kbNumber, name, description, size);
	}
}





