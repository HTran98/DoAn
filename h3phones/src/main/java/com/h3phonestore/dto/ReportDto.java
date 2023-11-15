package com.h3phonestore.dto;

import java.util.Map;


public class ReportDto {
	private Map<String, Integer> sales;
	private Map<String, Integer> revenue;
	public ReportDto(Map<String, Integer> sales, Map<String, Integer> revenue) {
		super();
		this.sales = sales;
		this.revenue = revenue;
	}
	public ReportDto() {
		super();
	}
	public Map<String, Integer> getSales() {
		return sales;
	}
	public void setSales(Map<String, Integer> sales) {
		this.sales = sales;
	}
	public Map<String, Integer> getRevenue() {
		return revenue;
	}
	public void setRevenue(Map<String, Integer> revenue) {
		this.revenue = revenue;
	}
	
}
