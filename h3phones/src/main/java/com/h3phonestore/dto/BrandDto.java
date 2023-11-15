package com.h3phonestore.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class BrandDto {
private long brandId;
	
	private String brandName;
	

	private String createdBy;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;
	
	boolean checkBrand;
	

	public BrandDto() {
		super();
	}


	public BrandDto(long brandId, String brandName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate, boolean deleteFlag, boolean checkBrand, List<ProductDto> productInfos) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.checkBrand = checkBrand;
		this.productInfos = productInfos;
	}


	private List<ProductDto> productInfos;


	public long getBrandId() {
		return brandId;
	}


	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
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


	public boolean isCheckBrand() {
		return checkBrand;
	}


	public void setCheckBrand(boolean checkBrand) {
		this.checkBrand = checkBrand;
	}


	public List<ProductDto> getProductInfos() {
		return productInfos;
	}


	public void setProductInfos(List<ProductDto> productInfos) {
		this.productInfos = productInfos;
	}
}
