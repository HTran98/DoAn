package com.h3phonestore.dto;

import java.util.Date;
import java.util.List;


public class UserDto {

	private long userId;

	private String userName;

	private String passWords;
	
	private String fullName;

	private String email;

	private String phoneNumbers;

	private String address;

	private String createdBy;

	Date createdDate;

	String updatedBy;

	Date updatedDate;

	boolean deleteFlag;

	
	private RoleDto roleInfo;

	
	private List<ProductOrderDto> orderInfos;
	
	private List<CustomerContactDto> userContacts;

	public UserDto() {
		super();
	}

	public UserDto(long userId, String userName, String passWords, String fullName, String email, String phoneNumbers,
			String address, String createdBy, Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag,
			RoleDto roleInfo, List<ProductOrderDto> orderInfos, List<CustomerContactDto> userContacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWords = passWords;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.address = address;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.roleInfo = roleInfo;
		this.orderInfos = orderInfos;
		this.userContacts = userContacts;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWords() {
		return passWords;
	}

	public void setPassWords(String passWords) {
		this.passWords = passWords;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public RoleDto getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleDto roleInfo) {
		this.roleInfo = roleInfo;
	}

	public List<ProductOrderDto> getOrderInfos() {
		return orderInfos;
	}

	public void setOrderInfos(List<ProductOrderDto> orderInfos) {
		this.orderInfos = orderInfos;
	}

	public List<CustomerContactDto> getUserContacts() {
		return userContacts;
	}

	public void setUserContacts(List<CustomerContactDto> userContacts) {
		this.userContacts = userContacts;
	}
	
}
