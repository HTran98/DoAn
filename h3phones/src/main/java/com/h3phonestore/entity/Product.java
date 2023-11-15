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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	private String productName;

	private int productType;
	
	private String createdBy;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;

	@ManyToOne
	@JoinColumn(name = "brandId")
	private Brand brandInfo;

	@OneToMany(mappedBy = "productInfo")
	private List<ProductDetail> productDetails;
	
	@OneToMany(mappedBy = "product")
	private List<HeadPhoneDetail> headphoneList ;

	public Product(long productId, String productName, int productType, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate, boolean deleteFlag, Brand brandInfo, List<ProductDetail> productDetails,
			List<HeadPhoneDetail> headphoneList) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.brandInfo = brandInfo;
		this.productDetails = productDetails;
		this.headphoneList = headphoneList;
	}

	public Product() {
		super();
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
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

	public Brand getBrandInfo() {
		return brandInfo;
	}

	public void setBrandInfo(Brand brandInfo) {
		this.brandInfo = brandInfo;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public List<HeadPhoneDetail> getHeadphoneList() {
		return headphoneList;
	}

	public void setHeadphoneList(List<HeadPhoneDetail> headphoneList) {
		this.headphoneList = headphoneList;
	}
}
