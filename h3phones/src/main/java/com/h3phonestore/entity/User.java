
package com.h3phonestore.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role roleInfo;

	@OneToMany(mappedBy = "userOrder")
	private List<ProductOrder> orderInfos;

	@OneToOne(mappedBy = "userContact")
	private CustomerContact userContacts;

	public User(long userId, String userName, String passWords, String fullName, String email, String phoneNumbers,
			String address, String createdBy, Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag,
			Role roleInfo, List<ProductOrder> orderInfos, CustomerContact userContacts) {
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

	public User() {
		super();
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

	public Role getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(Role roleInfo) {
		this.roleInfo = roleInfo;
	}

	public List<ProductOrder> getOrderInfos() {
		return orderInfos;
	}

	public void setOrderInfos(List<ProductOrder> orderInfos) {
		this.orderInfos = orderInfos;
	}

	public CustomerContact getUserContacts() {
		return userContacts;
	}

	public void setUserContacts(CustomerContact userContacts) {
		this.userContacts = userContacts;
	}



}
