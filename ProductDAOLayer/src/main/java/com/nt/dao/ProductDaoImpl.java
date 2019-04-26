package com.nt.dao;

import com.nt.Interface.ProductDao;
import com.nt.model.ProdReq;
import com.nt.model.ProdRes;

public class ProductDaoImpl implements ProductDao {
	
	public ProdRes getProduct(ProdReq preq) {
		System.out.println("ENters into dao layer");
		
		ProdRes pres= new ProdRes();
		pres.setDescription("good");
		pres.setProdID(123456);
		pres.setStatus("delivered");
		return pres;
		
		
	}

	public void getSome() {
		System.out.println("hello siddartha dao");
		
	}

}
