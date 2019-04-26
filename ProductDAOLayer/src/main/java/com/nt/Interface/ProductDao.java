package com.nt.Interface;

import com.nt.model.ProdReq;
import com.nt.model.ProdRes;

public interface ProductDao {
	public ProdRes getProduct(ProdReq preq);

	public void getSome();
}
