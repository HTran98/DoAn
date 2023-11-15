package com.h3phonestore.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class RoleDto {
	private long roleId;

	private String roleName;
	
	private String decscription;
	
	private String createdBy;
	
	Date createdDate;
	
	private String updatedBy;
	
	Date updatedDate;
	
	boolean deleteFlag;


	private List<UserDto> userInfo;


	public RoleDto(long roleId, String roleName, String decscription, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate, boolean deleteFlag, List<UserDto> userInfo) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.decscription = decscription;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.userInfo = userInfo;
	}


	public RoleDto() {
		super();
	}


	public long getRoleId() {
		return roleId;
	}


	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getDecscription() {
		return decscription;
	}


	public void setDecscription(String decscription) {
		this.decscription = decscription;
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


	public List<UserDto> getUserInfo() {
		return userInfo;
	}


	public void setUserInfo(List<UserDto> userInfo) {
		this.userInfo = userInfo;
	}
	
}
