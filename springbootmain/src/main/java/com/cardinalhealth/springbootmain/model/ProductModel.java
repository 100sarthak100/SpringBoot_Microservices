package com.cardinalhealth.springbootmain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProductModel {
	@Id
	private int productId;
	private double productPrice;
	private String productName;
	private String productImgFile;
	private String productDescription;
	
	public ProductModel() {
		
	}
	
	public ProductModel(int productId, double productPrice, String productName, String productImgFile,
			String productDescription) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productImgFile = productImgFile;
		this.productDescription = productDescription;
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
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productPrice=" + productPrice + ", productName="
				+ productName + ", productImgFile=" + productImgFile + ", productDescription=" + productDescription
				+ "]";
	}
	
}
