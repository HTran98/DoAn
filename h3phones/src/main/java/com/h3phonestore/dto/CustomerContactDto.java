package com.h3phonestore.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class CustomerContactDto {
	
	private long contactId;

	private String customerName;

	private String email;

	private String phoneNumbers;

	private String createdBy;
	
	private String contactContent;

	Date createdDate;

	String updatedBy;

	Date updatedDate;

	boolean deleteFlag;
	
	private UserDto userContact;
	

	public CustomerContactDto() {
		super();
	}

	public CustomerContactDto(long contactId, String customerName, String email, String phoneNumbers, String createdBy,
			String contactContent, Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag,
			UserDto userContact) {
		super();
		this.contactId = contactId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.createdBy = createdBy;
		this.contactContent = contactContent;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.userContact = userContact;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getContactContent() {
		return contactContent;
	}

	public void setContactContent(String contactContent) {
		this.contactContent = contactContent;
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

	public UserDto getUserContact() {
		return userContact;
	}

	public void setUserContact(UserDto userContact) {
		this.userContact = userContact;
	}
	
}
