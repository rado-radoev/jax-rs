package org.superlamer.windowsupdate.model;

public class Update {
	
	private long kbNumber;
	private String description;
	private String Name;
	private double size;
	
	public Update() {}
	
	public Update(long kbNumber, String description, String name, double size) {
		super();
		this.kbNumber = kbNumber;
		this.description = description;
		Name = name;
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}

}
