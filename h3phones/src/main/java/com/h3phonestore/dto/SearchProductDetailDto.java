package com.h3phonestore.dto;

import java.util.ArrayList;


public class SearchProductDetailDto {
	private long brandId;
	private String brandName;
	private long productDetailId;
	private String productId;
	private String color;
	private String ram;
	private String internalMemory;
	private ArrayList<BrandDto> listBrand;
	private ArrayList<InternalMemoryDto> listInternalMemory;
	public SearchProductDetailDto(long brandId, String brandName, long productDetailId, String productId, String color,
			String ram, String internalMemory, ArrayList<BrandDto> listBrand,
			ArrayList<InternalMemoryDto> listInternalMemory) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.productDetailId = productDetailId;
		this.productId = productId;
		this.color = color;
		this.ram = ram;
		this.internalMemory = internalMemory;
		this.listBrand = listBrand;
		this.listInternalMemory = listInternalMemory;
	}
	public SearchProductDetailDto() {
		super();
	}
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
	public long getProductDetailId() {
		return productDetailId;
	}
	public void setProductDetailId(long productDetailId) {
		this.productDetailId = productDetailId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}
	public ArrayList<BrandDto> getListBrand() {
		return listBrand;
	}
	public void setListBrand(ArrayList<BrandDto> listBrand) {
		this.listBrand = listBrand;
	}
	public ArrayList<InternalMemoryDto> getListInternalMemory() {
		return listInternalMemory;
	}
	public void setListInternalMemory(ArrayList<InternalMemoryDto> listInternalMemory) {
		this.listInternalMemory = listInternalMemory;
	}

}
