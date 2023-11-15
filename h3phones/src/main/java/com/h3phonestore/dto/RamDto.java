package com.h3phonestore.dto;

public class RamDto {
	private boolean checkRam;
	private String Ram;
	public RamDto(boolean checkRam, String ram) {
		super();
		this.checkRam = checkRam;
		Ram = ram;
	}
	public RamDto() {
		super();
	}
	public boolean isCheckRam() {
		return checkRam;
	}
	public void setCheckRam(boolean checkRam) {
		this.checkRam = checkRam;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	
}
