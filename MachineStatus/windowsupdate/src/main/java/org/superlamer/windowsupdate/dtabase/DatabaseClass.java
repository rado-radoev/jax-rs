package org.superlamer.windowsupdate.dtabase;

import java.util.HashMap;
import java.util.Map;

import org.superlamer.windowsupdate.model.Computer;
import org.superlamer.windowsupdate.model.Update;

public class DatabaseClass {
	
	private static Map<String, Computer> computers = new HashMap<>();
	private static Map<Long, Update> updates = new HashMap<>();
	
	public static Map<String, Computer> getComputers() {
		return computers;
	}
	public static Map<Long, Update> getUpdates() {
		return updates;
	}
}
