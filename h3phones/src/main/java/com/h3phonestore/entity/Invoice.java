package com.h3phonestore.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long invoiceId;

	private String customer;

	private String address;

	private String phoneNumber;

	private int customerVote;

	private String invoiceCode;

	private String deliveryTime;

	private int status;

	private String payment;

	private String customerReview;

	private String comment;

	private String createdBy;

	Date createdDate;

	private String updatedBy;

	Date updatedDate;

	boolean deleteFlag;
	
	boolean voteFlag;
	
	private int totalInvoice;
	
	@OneToMany(mappedBy = "invoiceInfo")
	private List<ProductOrder> orderInfo;

	public Invoice() {
		super();
	}

	public Invoice(long invoiceId, String customer, String address, String phoneNumber, int customerVote,
			String invoiceCode, String deliveryTime, int status, String payment, String customerReview, String comment,
			String createdBy, Date createdDate, String updatedBy, Date updatedDate, boolean deleteFlag,
			boolean voteFlag, int totalInvoice, List<ProductOrder> orderInfo) {
		super();
		this.invoiceId = invoiceId;
		this.customer = customer;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.customerVote = customerVote;
		this.invoiceCode = invoiceCode;
		this.deliveryTime = deliveryTime;
		this.status = status;
		this.payment = payment;
		this.customerReview = customerReview;
		this.comment = comment;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleteFlag = deleteFlag;
		this.voteFlag = voteFlag;
		this.totalInvoice = totalInvoice;
		this.orderInfo = orderInfo;
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerVote() {
		return customerVote;
	}

	public void setCustomerVote(int customerVote) {
		this.customerVote = customerVote;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getCustomerReview() {
		return customerReview;
	}

	public void setCustomerReview(String customerReview) {
		this.customerReview = customerReview;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public boolean isVoteFlag() {
		return voteFlag;
	}

	public void setVoteFlag(boolean voteFlag) {
		this.voteFlag = voteFlag;
	}

	public int getTotalInvoice() {
		return totalInvoice;
	}

	public void setTotalInvoice(int totalInvoice) {
		this.totalInvoice = totalInvoice;
	}

	public List<ProductOrder> getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(List<ProductOrder> orderInfo) {
		this.orderInfo = orderInfo;
	}
}
