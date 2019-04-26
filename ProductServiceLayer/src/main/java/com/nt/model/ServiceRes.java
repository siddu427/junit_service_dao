package com.nt.model;

public class ServiceRes {
	private int prodID;
	private String status;
	private String description;
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProdRes [prodID=" + prodID + ", status=" + status + ", description=" + description + "]";
	}
	
	

}
