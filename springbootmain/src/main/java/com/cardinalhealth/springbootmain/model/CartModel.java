package com.cardinalhealth.springbootmain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CartModel {
	@Id
	private int productId;
	private double productPrice;
	private String productName;
	private String productImgFile;
	
	public CartModel() {
		
	}
	
	public CartModel(int productId, double productPrice, String productName, String productImgFile) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productImgFile = productImgFile;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductImgFile() {
		return productImgFile;
	}
	public void setProductImgFile(String productImgFile) {
		this.productImgFile = productImgFile;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productPrice=" + productPrice + ", productName="
				+ productName + ", productImgFile=" + productImgFile + "]";
	}
}
