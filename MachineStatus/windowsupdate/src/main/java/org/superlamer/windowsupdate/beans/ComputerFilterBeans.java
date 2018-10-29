package org.superlamer.windowsupdate.beans;

import javax.ws.rs.QueryParam;

public class ComputerFilterBeans {
	
	private @QueryParam(value = "osversion") String osVersion;
	private @QueryParam(value = "start") int start;
	private @QueryParam(value = "size") int size;
	
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
