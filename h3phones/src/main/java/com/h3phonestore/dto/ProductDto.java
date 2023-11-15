package com.h3phonestore.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ProductDto {
	private long productId;

	private String productName;

	private int productType;

	private String createdBy;
	
	private String brandNameProduct;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;
	
	String brandNames;

	private BrandDto brandInfo;
	
	private int sales;
	
	private int revenue;


	private List<ProductDetailDto> productDetails;


	public ProductDto(long productId, String productName, int productType, String createdBy, String brandNameProduct,
			Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag, String brandNames,
			BrandDto brandInfo, int sales, int revenue, List<ProductDetailDto> productDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.createdBy = createdBy;
		this.brandNameProduct = brandNameProduct;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.brandNames = brandNames;
		this.brandInfo = brandInfo;
		this.sales = sales;
		this.revenue = revenue;
		this.productDetails = productDetails;
	}


	public ProductDto() {
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


	public String getBrandNameProduct() {
		return brandNameProduct;
	}


	public void setBrandNameProduct(String brandNameProduct) {
		this.brandNameProduct = brandNameProduct;
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


	public String getBrandNames() {
		return brandNames;
	}


	public void setBrandNames(String brandNames) {
		this.brandNames = brandNames;
	}


	public BrandDto getBrandInfo() {
		return brandInfo;
	}


	public void setBrandInfo(BrandDto brandInfo) {
		this.brandInfo = brandInfo;
	}


	public int getSales() {
		return sales;
	}


	public void setSales(int sales) {
		this.sales = sales;
	}


	public int getRevenue() {
		return revenue;
	}


	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}


	public List<ProductDetailDto> getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(List<ProductDetailDto> productDetails) {
		this.productDetails = productDetails;
	}
	
}
