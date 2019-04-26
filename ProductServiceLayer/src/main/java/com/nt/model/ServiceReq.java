package com.nt.model;

public class ServiceReq {
	private int prodID;
	private String prodName;
	private String prodSize;
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdSize() {
		return prodSize;
	}
	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}
	@Override
	public String toString() {
		return "ProdReq [prodID=" + prodID + ", prodName=" + prodName + ", prodSize=" + prodSize + "]";
	}
	
	

}
