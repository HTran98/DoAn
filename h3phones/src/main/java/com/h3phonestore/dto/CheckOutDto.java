package com.h3phonestore.dto;

import java.util.ArrayList;


public class CheckOutDto {
	private ArrayList<ProductOrderDto> listProductOrder;
	private ArrayList<HeadPhoneDetailDto> listHeadPhoneOrder;
	private String customer;
	private String phoneNumber;
	private String address;
	private String comment;
	
	public CheckOutDto() {
		super();
	}
	public CheckOutDto(ArrayList<ProductOrderDto> listProductOrder, ArrayList<HeadPhoneDetailDto> listHeadPhoneOrder,
			String customer, String phoneNumber, String address, String comment) {
		super();
		this.listProductOrder = listProductOrder;
		this.listHeadPhoneOrder = listHeadPhoneOrder;
		this.customer = customer;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.comment = comment;
	}
	public ArrayList<ProductOrderDto> getListProductOrder() {
		return listProductOrder;
	}
	public void setListProductOrder(ArrayList<ProductOrderDto> listProductOrder) {
		this.listProductOrder = listProductOrder;
	}
	public ArrayList<HeadPhoneDetailDto> getListHeadPhoneOrder() {
		return listHeadPhoneOrder;
	}
	public void setListHeadPhoneOrder(ArrayList<HeadPhoneDetailDto> listHeadPhoneOrder) {
		this.listHeadPhoneOrder = listHeadPhoneOrder;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
