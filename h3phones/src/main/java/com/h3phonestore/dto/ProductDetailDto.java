package com.h3phonestore.dto;

import java.beans.Transient;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;


public class ProductDetailDto {
	private long productDetailId;

	private String screen;
	private String resolution;
	private String operatingSystem;
	private String rearCamera;
	private String frontCamera;
	private String chips;
	private String ram;
	private String internalMemory;
	private String sim;
	private String rechargeableBatteries;
	private String connector;
	private String headphoneJack;
	private String mobileNetwork;
	private String bluetooth;
	private String wifi;
	private String gps;
	private int prices;
	private int pricesImport;
	private String color;
	private String imageOverview;
	private String imageUnder;
	private String imageSide;
	private String imageOther;
	private int quantityImport;
	private int quantityExport;
    private float discount;
	private float vote;
    private String productDetailName;
    private int available;
	private String createdBy;
    private int newQuantityImport;
	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;

	private ProductDto productInfo;

	private MultipartFile[] multipartFiles;
	
	public ProductDetailDto(long productDetailId, String screen, String resolution, String operatingSystem,
			String rearCamera, String frontCamera, String chips, String ram, String internalMemory, String sim,
			String rechargeableBatteries, String connector, String headphoneJack, String mobileNetwork,
			String bluetooth, String wifi, String gps, int prices, int pricesImport, String color, String imageOverview,
			String imageUnder, String imageSide, String imageOther, int quantityImport, int quantityExport,
			float discount, float vote, String productDetailName, int available, String createdBy,
			int newQuantityImport, Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag,
			ProductDto productInfo, MultipartFile[] multipartFiles) {
		super();
		this.productDetailId = productDetailId;
		this.screen = screen;
		this.resolution = resolution;
		this.operatingSystem = operatingSystem;
		this.rearCamera = rearCamera;
		this.frontCamera = frontCamera;
		this.chips = chips;
		this.ram = ram;
		this.internalMemory = internalMemory;
		this.sim = sim;
		this.rechargeableBatteries = rechargeableBatteries;
		this.connector = connector;
		this.headphoneJack = headphoneJack;
		this.mobileNetwork = mobileNetwork;
		this.bluetooth = bluetooth;
		this.wifi = wifi;
		this.gps = gps;
		this.prices = prices;
		this.pricesImport = pricesImport;
		this.color = color;
		this.imageOverview = imageOverview;
		this.imageUnder = imageUnder;
		this.imageSide = imageSide;
		this.imageOther = imageOther;
		this.quantityImport = quantityImport;
		this.quantityExport = quantityExport;
		this.discount = discount;
		this.vote = vote;
		this.productDetailName = productDetailName;
		this.available = available;
		this.createdBy = createdBy;
		this.newQuantityImport = newQuantityImport;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.productInfo = productInfo;
		this.multipartFiles = multipartFiles;
	}
	public ProductDetailDto() {
		super();
	}
	public long getProductDetailId() {
		return productDetailId;
	}
	public void setProductDetailId(long productDetailId) {
		this.productDetailId = productDetailId;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getRearCamera() {
		return rearCamera;
	}
	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}
	public String getFrontCamera() {
		return frontCamera;
	}
	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}
	public String getChips() {
		return chips;
	}
	public void setChips(String chips) {
		this.chips = chips;
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
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getRechargeableBatteries() {
		return rechargeableBatteries;
	}
	public void setRechargeableBatteries(String rechargeableBatteries) {
		this.rechargeableBatteries = rechargeableBatteries;
	}
	public String getConnector() {
		return connector;
	}
	public void setConnector(String connector) {
		this.connector = connector;
	}
	public String getHeadphoneJack() {
		return headphoneJack;
	}
	public void setHeadphoneJack(String headphoneJack) {
		this.headphoneJack = headphoneJack;
	}
	public String getMobileNetwork() {
		return mobileNetwork;
	}
	public void setMobileNetwork(String mobileNetwork) {
		this.mobileNetwork = mobileNetwork;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImageOverview() {
		return imageOverview;
	}
	public void setImageOverview(String imageOverview) {
		this.imageOverview = imageOverview;
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
	public String getProductDetailName() {
		return productDetailName;
	}
	public void setProductDetailName(String productDetailName) {
		this.productDetailName = productDetailName;
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
	public int getNewQuantityImport() {
		return newQuantityImport;
	}
	public void setNewQuantityImport(int newQuantityImport) {
		this.newQuantityImport = newQuantityImport;
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
	public ProductDto getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductDto productInfo) {
		this.productInfo = productInfo;
	}
	public MultipartFile[] getMultipartFiles() {
		return multipartFiles;
	}
	public void setMultipartFiles(MultipartFile[] multipartFiles) {
		this.multipartFiles = multipartFiles;
	}
	@Transient
	public String imageOverviewUrl() {
		return "/images/imagesProduct/" + productInfo.getProductName() + "/" + imageOverview;
	}
	@Transient
	public String imageUnderUrl() {
		return "/images/imagesProduct/" + productInfo.getProductName() + "/" + imageUnder;
	}
	@Transient
	public String imageSideUrl() {
		return "/images/imagesProduct/" + productInfo.getProductName() + "/" + imageSide;
	}
	@Transient
	public String imageOtherUrl() {
		return "/images/imagesProduct/" + productInfo.getProductName() + "/" + imageOther;
	}
}
