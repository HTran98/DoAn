package com.h3phonestore.dto;

public class SearchDateDto {
	private String startDate;
	private String endDate;
	private int status;
	private String productType;
	public SearchDateDto(String startDate, String endDate, int status, String productType) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.productType = productType;
	}
	public SearchDateDto() {
		super();
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
}
