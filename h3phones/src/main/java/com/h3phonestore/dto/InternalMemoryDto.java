package com.h3phonestore.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class InternalMemoryDto {
	private boolean check;
	private String internalMemory;
	public InternalMemoryDto(boolean check, String internalMemory) {
		super();
		this.check = check;
		this.internalMemory = internalMemory;
	}
	public InternalMemoryDto() {
		super();
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}
	
}
