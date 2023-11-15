package com.h3phonestore.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productOrder")

public class ProductOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;

	private int quantity;

	private int totalPrices;

	private String createdBy;
	
	private int orderType;

	Date createdDate;

	private String updatedBy;

	private Date updatedDate;
	
	private int customerVote;
	
	private int status;
	
	private String customerReview;
	
	private boolean voteFlag;

	private boolean deleteFlag;

	@ManyToOne
	@JoinColumn(name = "productDetailId")
	private ProductDetail productDetail;
	
	@ManyToOne
	@JoinColumn(name = "headPhoneId")
	private HeadPhoneDetail headPhone;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User userOrder;
	
	@ManyToOne
	@JoinColumn(name = "invoiceId")
	private Invoice invoiceInfo;

	public ProductOrder(long orderId, int quantity, int totalPrices, String createdBy, int orderType, Date createdDate,
			String updatedBy, Date updatedDate, int customerVote, int status, String customerReview, boolean voteFlag,
			boolean deleteFlag, ProductDetail productDetail, HeadPhoneDetail headPhone, User userOrder,
			Invoice invoiceInfo) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalPrices = totalPrices;
		this.createdBy = createdBy;
		this.orderType = orderType;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.customerVote = customerVote;
		this.status = status;
		this.customerReview = customerReview;
		this.voteFlag = voteFlag;
		this.deleteFlag = deleteFlag;
		this.productDetail = productDetail;
		this.headPhone = headPhone;
		this.userOrder = userOrder;
		this.invoiceInfo = invoiceInfo;
	}

	public ProductOrder() {
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
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

	public int getCustomerVote() {
		return customerVote;
	}

	public void setCustomerVote(int customerVote) {
		this.customerVote = customerVote;
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

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	public HeadPhoneDetail getHeadPhone() {
		return headPhone;
	}

	public void setHeadPhone(HeadPhoneDetail headPhone) {
		this.headPhone = headPhone;
	}

	public User getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(User userOrder) {
		this.userOrder = userOrder;
	}

	public Invoice getInvoiceInfo() {
		return invoiceInfo;
	}

	public void setInvoiceInfo(Invoice invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

}
