package com.h3phonestore.dto;

import java.util.Date;

import com.h3phonestore.entity.Invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductOrderDto {
	private long orderId;

	private int quantity;

	private int totalPrices;

	private int orderType;

	private String createdBy;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;

	boolean checkOrder;

	private ProductDetailDto productDetail;

	private HeadPhoneDetailDto headPhone;

	private UserDto userOrder;

	private int status;

	private String customerReview;

	boolean voteFlag;
	
	private int customerVote;

	private Invoice invoiceInfo;

	public ProductOrderDto(long orderId, int quantity, int totalPrices, int orderType, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag, boolean checkOrder,
			ProductDetailDto productDetail, HeadPhoneDetailDto headPhone, UserDto userOrder, int status,
			String customerReview, boolean voteFlag, int customerVote, Invoice invoiceInfo) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalPrices = totalPrices;
		this.orderType = orderType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.checkOrder = checkOrder;
		this.productDetail = productDetail;
		this.headPhone = headPhone;
		this.userOrder = userOrder;
		this.status = status;
		this.customerReview = customerReview;
		this.voteFlag = voteFlag;
		this.customerVote = customerVote;
		this.invoiceInfo = invoiceInfo;
	}

	public ProductOrderDto() {
		super();
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(int totalPrices) {
		this.totalPrices = totalPrices;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
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

	public boolean isCheckOrder() {
		return checkOrder;
	}

	public void setCheckOrder(boolean checkOrder) {
		this.checkOrder = checkOrder;
	}

	public ProductDetailDto getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetailDto productDetail) {
		this.productDetail = productDetail;
	}

	public HeadPhoneDetailDto getHeadPhone() {
		return headPhone;
	}

	public void setHeadPhone(HeadPhoneDetailDto headPhone) {
		this.headPhone = headPhone;
	}

	public UserDto getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserDto userOrder) {
		this.userOrder = userOrder;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCustomerReview() {
		return customerReview;
	}

	public void setCustomerReview(String customerReview) {
		this.customerReview = customerReview;
	}

	public boolean isVoteFlag() {
		return voteFlag;
	}

	public void setVoteFlag(boolean voteFlag) {
		this.voteFlag = voteFlag;
	}

	public int getCustomerVote() {
		return customerVote;
	}

	public void setCustomerVote(int customerVote) {
		this.customerVote = customerVote;
	}

	public Invoice getInvoiceInfo() {
		return invoiceInfo;
	}

	public void setInvoiceInfo(Invoice invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}
	
}
