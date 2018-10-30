package org.superlamer.windowsupdate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.superlamer.windowsupdate.dtabase.DatabaseClass;
import org.superlamer.windowsupdate.model.Computer;

public class ComputerService {
	
	private Map<String, Computer> computers = DatabaseClass.getComputers();
	
	public ComputerService() {
		computers.put("PPHXAPP1CTXPM1", new Computer("PPHXAPP1CTXPM1", "2008 R2"));
		computers.put("PPHXAPP2CTXPM1", new Computer("PPHXAPP2CTXPM1", "2016"));
		computers.put("PPHXAPP3CTXPM1", new Computer("PPHXAPP3CTXPM1", "2012 R2"));
		computers.put("PPHXAPP4CTXPM1", new Computer("PPHXAPP4CTXPM1", "2012"));
	}
	
	public List<Computer> getAllComputers() {
		return new ArrayList<Computer>(computers.values());
	}
	
	public List<String> getOsVersions() {
		for (String s : Computer.getOsVersions()) {
			System.out.println("Os type: "+ s);
		}
		System.out.println(Computer.getOsVersions());
		return Computer.getOsVersions();
	}
		
	public List<Computer> getAllComputersWithOsVersion(String osVersion) {
		List<Computer> computerWithOsVersion = new ArrayList<>();
		
		for (Computer computer : computers.values()) {
			System.out.println(computer);
			if (computer.getOsVersion().toLowerCase().contains(osVersion.toLowerCase())) {
				System.out.println("Computer with os version: " +osVersion +" Found");
				computerWithOsVersion.add(computer);
			}
		}
		return computerWithOsVersion;
	}
	
	public List<Computer> getAllComputersPaginated(int start, int size) {
		ArrayList<Computer> list =  new ArrayList<Computer>(computers.values());
		if (start + size > list.size()) return new ArrayList<Computer>();
		return list.subList(start, start +  size); 
	}
	
	public Computer getComputer(String name) {
		return computers.get(name);
	}
	
	public Computer addComputer(Computer computer) {
		computers.put(computer.getComputerName(), computer);
		return computer;
	}
	
	public Computer updateComputer(Computer computer) {
		if (computer.getComputerName().isEmpty()) {
			return null;
		}
		
		computers.put(computer.getComputerName(), computer);
		return computer;
	}
	
	public Computer removeComputer(String computerName) {
		return computers.remove(computerName);
	}

}
