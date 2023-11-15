package com.h3phonestore.dto;

import java.beans.Transient;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class HeadPhoneDetailDto {
	private long headPhoneId;

	private String headphoneUsageTime;
	
	private String chargingBoxUsageTime;
	
	private String chargingPort;
	
	private String audioTechnology;
	
	private String compatible;
	
	private String connectApplication;
	
	private String utilities;
	
	private String connectSameTime;
	
	private String connectTechnology;
	
	private String control;
	
	private String color;
	
	private String imageOverView;
	
	private String imageUnder;
	
	private String imageSide;
	
	private String imageOther;
	
	private int prices;
	
	private int pricesImport;
	
	private int quantityImport;
	
	private int quantityExport;
	
	private float discount;
	
	private float vote;
	
	private String headPhoneName;
	
	private int available;

	private String createdBy;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;
	
	private ProductDto product;
	
	private int newQuantityImport;
	
	private MultipartFile[] multipartFiles;
	
	public HeadPhoneDetailDto() {
		super();
	}
	public HeadPhoneDetailDto(long headPhoneId, String headphoneUsageTime, String chargingBoxUsageTime,
			String chargingPort, String audioTechnology, String compatible, String connectApplication, String utilities,
			String connectSameTime, String connectTechnology, String control, String color, String imageOverView,
			String imageUnder, String imageSide, String imageOther, int prices, int pricesImport, int quantityImport,
			int quantityExport, float discount, float vote, String headPhoneName, int available, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag, ProductDto product,
			int newQuantityImport, MultipartFile[] multipartFiles) {
		super();
		this.headPhoneId = headPhoneId;
		this.headphoneUsageTime = headphoneUsageTime;
		this.chargingBoxUsageTime = chargingBoxUsageTime;
		this.chargingPort = chargingPort;
		this.audioTechnology = audioTechnology;
		this.compatible = compatible;
		this.connectApplication = connectApplication;
		this.utilities = utilities;
		this.connectSameTime = connectSameTime;
		this.connectTechnology = connectTechnology;
		this.control = control;
		this.color = color;
		this.imageOverView = imageOverView;
		this.imageUnder = imageUnder;
		this.imageSide = imageSide;
		this.imageOther = imageOther;
		this.prices = prices;
		this.pricesImport = pricesImport;
		this.quantityImport = quantityImport;
		this.quantityExport = quantityExport;
		this.discount = discount;
		this.vote = vote;
		this.headPhoneName = headPhoneName;
		this.available = available;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.product = product;
		this.newQuantityImport = newQuantityImport;
		this.multipartFiles = multipartFiles;
	}
	public long getHeadPhoneId() {
		return headPhoneId;
	}
	public void setHeadPhoneId(long headPhoneId) {
		this.headPhoneId = headPhoneId;
	}
	public String getHeadphoneUsageTime() {
		return headphoneUsageTime;
	}
	public void setHeadphoneUsageTime(String headphoneUsageTime) {
		this.headphoneUsageTime = headphoneUsageTime;
	}
	public String getChargingBoxUsageTime() {
		return chargingBoxUsageTime;
	}
	public void setChargingBoxUsageTime(String chargingBoxUsageTime) {
		this.chargingBoxUsageTime = chargingBoxUsageTime;
	}
	public String getChargingPort() {
		return chargingPort;
	}
	public void setChargingPort(String chargingPort) {
		this.chargingPort = chargingPort;
	}
	public String getAudioTechnology() {
		return audioTechnology;
	}
	public void setAudioTechnology(String audioTechnology) {
		this.audioTechnology = audioTechnology;
	}
	public String getCompatible() {
		return compatible;
	}
	public void setCompatible(String compatible) {
		this.compatible = compatible;
	}
	public String getConnectApplication() {
		return connectApplication;
	}
	public void setConnectApplication(String connectApplication) {
		this.connectApplication = connectApplication;
	}
	public String getUtilities() {
		return utilities;
	}
	public void setUtilities(String utilities) {
		this.utilities = utilities;
	}
	public String getConnectSameTime() {
		return connectSameTime;
	}
	public void setConnectSameTime(String connectSameTime) {
		this.connectSameTime = connectSameTime;
	}
	public String getConnectTechnology() {
		return connectTechnology;
	}
	public void setConnectTechnology(String connectTechnology) {
		this.connectTechnology = connectTechnology;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImageOverView() {
		return imageOverView;
	}
	public void setImageOverView(String imageOverView) {
		this.imageOverView = imageOverView;
	}
	public String getImageUnder() {
		return imageUnder;
	}
	public void setImageUnder(String imageUnder) {
		this.imageUnder = imageUnder;
	}
	public String getImageSide() {
		return imageSide;
	}
	public void setImageSide(String imageSide) {
		this.imageSide = imageSide;
	}
	public String getImageOther() {
		return imageOther;
	}
	public void setImageOther(String imageOther) {
		this.imageOther = imageOther;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public int getPricesImport() {
		return pricesImport;
	}
	public void setPricesImport(int pricesImport) {
		this.pricesImport = pricesImport;
	}
	public int getQuantityImport() {
		return quantityImport;
	}
	public void setQuantityImport(int quantityImport) {
		this.quantityImport = quantityImport;
	}
	public int getQuantityExport() {
		return quantityExport;
	}
	public void setQuantityExport(int quantityExport) {
		this.quantityExport = quantityExport;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getVote() {
		return vote;
	}
	public void setVote(float vote) {
		this.vote = vote;
	}
	public String getHeadPhoneName() {
		return headPhoneName;
	}
	public void setHeadPhoneName(String headPhoneName) {
		this.headPhoneName = headPhoneName;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
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
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public int getNewQuantityImport() {
		return newQuantityImport;
	}
	public void setNewQuantityImport(int newQuantityImport) {
		this.newQuantityImport = newQuantityImport;
	}
	public MultipartFile[] getMultipartFiles() {
		return multipartFiles;
	}
	public void setMultipartFiles(MultipartFile[] multipartFiles) {
		this.multipartFiles = multipartFiles;
	}
	@Transient
	public String imageOverviewUrl() {
		return "/src/main/resources/static/images/imagesProduct/" + product.getProductName() + "/" + imageOverView;
	}
	@Transient
	public String imageUnderUrl() {
		return "/src/main/resources/static/images/imagesProduct/" + product.getProductName() + "/" + imageUnder;
	}
	@Transient
	public String imageSideUrl() {
		return "/src/main/resources/static/images/imagesProduct/" + product.getProductName() + "/" + imageSide;
	}
	@Transient
	public String imageOtherUrl() {
		return "/src/main/resources/static/images/imagesProduct/" + product.getProductName() + "/" + imageOther;
	}
}
