package com.nt.serviceimpl;

import com.nt.Interface.ProductDao;
import com.nt.Interface.ProductService;
import com.nt.dao.ProductDaoImpl;
import com.nt.model.ProdReq;
import com.nt.model.ProdRes;
import com.nt.model.ServiceReq;
import com.nt.model.ServiceRes;

public class ProductServiceImpl implements ProductService {

	
	private ProductDao productDao;
	public ServiceRes get(ServiceReq req) {
		System.out.println("enters into service layer");
		productDao = new ProductDaoImpl();
		ProdReq preq= new ProdReq();
		preq.setProdID(req.getProdID());
		preq.setProdName(req.getProdName());
		preq.setProdSize(req.getProdSize());
		ProdRes res=productDao.getProduct(preq);
		
		ServiceRes serRes= new ServiceRes();
		serRes.setDescription(res.getDescription());
		serRes.setProdID(res.getProdID());
		serRes.setStatus(res.getStatus());
		productDao.getSome();
		return serRes;
		
	}
	
	





	
	
	
	
		
	}


