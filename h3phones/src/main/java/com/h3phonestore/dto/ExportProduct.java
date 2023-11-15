package com.h3phonestore.dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ExportProduct {
	ArrayList<ProductDto> listProduct;
	
	ArrayList<BrandDto> listBrand;

	public ExportProduct() {
		super();
	}

	public ExportProduct(ArrayList<ProductDto> listProduct, ArrayList<BrandDto> listBrand) {
		super();
		this.listProduct = listProduct;
		this.listBrand = listBrand;
	}

	public ArrayList<ProductDto> getListProduct() {
		return listProduct;
	}

	public void setListProduct(ArrayList<ProductDto> listProduct) {
		this.listProduct = listProduct;
	}

	public ArrayList<BrandDto> getListBrand() {
		return listBrand;
	}

	public void setListBrand(ArrayList<BrandDto> listBrand) {
		this.listBrand = listBrand;
	}
	
}
