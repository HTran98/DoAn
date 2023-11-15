package com.h3phonestore.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExportProductDetail {
	
	private ArrayList<ProductDetailDto> listProductDetail;
	
	private ArrayList<HeadPhoneDetailDto> listHeadPhone;

	public ExportProductDetail() {
		super();
	}

	public ExportProductDetail(ArrayList<ProductDetailDto> listProductDetail,
			ArrayList<HeadPhoneDetailDto> listHeadPhone) {
		super();
		this.listProductDetail = listProductDetail;
		this.listHeadPhone = listHeadPhone;
	}

	public ArrayList<ProductDetailDto> getListProductDetail() {
		return listProductDetail;
	}

	public void setListProductDetail(ArrayList<ProductDetailDto> listProductDetail) {
		this.listProductDetail = listProductDetail;
	}

	public ArrayList<HeadPhoneDetailDto> getListHeadPhone() {
		return listHeadPhone;
	}

	public void setListHeadPhone(ArrayList<HeadPhoneDetailDto> listHeadPhone) {
		this.listHeadPhone = listHeadPhone;
	}
	

}
