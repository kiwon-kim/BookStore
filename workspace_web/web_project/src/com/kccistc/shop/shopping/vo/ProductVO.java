package com.kccistc.shop.shopping.vo;

public class ProductVO {
//	 productNum number,
//	    productName varchar2(20),
//	    productPrice number,
//	    ProductDescription varchar2(4000),
//	    ProductImgPath varchar2(1000),
	private int productNum;
	private String productName;
	private int productPrice;
	private String productDescription;
	private String productImgPath;
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImgPath() {
		return productImgPath;
	}
	public void setProductImgPath(String productImgPath) {
		this.productImgPath = productImgPath;
	}
	
}
