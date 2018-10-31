package org.superlamer.windowsupdate.model;

public enum UpdateStatusEnum {
	IN_PROGRESS ("IN_PROGRESS"),
	COMPLTED ("COMPLETED");
	
	private final String status;
	
	private UpdateStatusEnum(String status) {
		this.status = status;
	}

	public String toString() {
		return this.name();
	}
}
