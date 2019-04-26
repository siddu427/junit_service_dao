package com.nt.serviceimpl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.nt.Interface.ProductService;
import com.nt.model.ServiceReq;
import com.nt.model.ServiceRes;

public class ProductServiceImplTest {
	ProductService prod;

	@Test
	public void testGet() {
		prod = new ProductServiceImpl();
		ServiceReq req= new ServiceReq();
		req.setProdID(123456);
		req.setProdName("mobile");
		req.setProdSize("3");
		prod.get(req);
		ServiceRes res =prod.get(req);
		
		
		assertNotNull(res);
	}

}
