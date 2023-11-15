package com.h3phonestore.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class DataFilteDto {
	private List<String> listColor;
	private List<String> listRam;
	private List<String> listInternalMemory;
	public DataFilteDto() {
		super();
	}
	public DataFilteDto(List<String> listColor, List<String> listRam, List<String> listInternalMemory) {
		super();
		this.listColor = listColor;
		this.listRam = listRam;
		this.listInternalMemory = listInternalMemory;
	}
	public List<String> getListColor() {
		return listColor;
	}
	public void setListColor(List<String> listColor) {
		this.listColor = listColor;
	}
	public List<String> getListRam() {
		return listRam;
	}
	public void setListRam(List<String> listRam) {
		this.listRam = listRam;
	}
	public List<String> getListInternalMemory() {
		return listInternalMemory;
	}
	public void setListInternalMemory(List<String> listInternalMemory) {
		this.listInternalMemory = listInternalMemory;
	}
	
}
