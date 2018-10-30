package org.superlamer.windowsupdate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.superlamer.windowsupdate.dtabase.DatabaseClass;
import org.superlamer.windowsupdate.model.Computer;
import org.superlamer.windowsupdate.model.Update;

public class UpdateService {
	
	private Map<String, Computer> computers = DatabaseClass.getComputers();
	
	public List<Update> getAllUpdtes(String computerName) {
		Map<Long, Update> updates = computers.get(computerName).getUpdates();
		return new ArrayList<Update>(updates.values());
	}
	
	public Update getUpdte(String computerName, Long kbNumber) {
		
		Response response = Response.status(Status.NOT_FOUND)
									.entity(getClass())
									.build();
		
		Computer computer = computers.get(computerName);
		if (computer == null) {
			throw new NotFoundException(response);
		}
		
		Map<Long, Update> updates = computers.get(computerName).getUpdates();
		Update update = updates.get(kbNumber);
		
		if (update == null) {
			throw new NotFoundException(response);
		}
		
		return update;
	}
	
	public Update addUpdate(String computerName, Update update) {
		Map<Long, Update> updates = computers.get(computerName).getUpdates();
		
		updates.put(update.getKbNumber(), update);
		
		return update;
	}
	
	public Update updateUpdate(String computerName, Update update) {
		Map<Long, Update> updates = computers.get(computerName).getUpdates();
		if (update.getKbNumber() <= 0) {
			return null;
		}
		
		updates.put(update.getKbNumber(), update);
		
		return update;
	}
	
	public Update removeUpdate(String computerName, Long kbNumber) {
		Map<Long, Update> updates = computers.get(computerName).getUpdates();
		if (updates.get(kbNumber) == null) {
			return null;
		}
		
		return updates.remove(kbNumber);
	}

}
