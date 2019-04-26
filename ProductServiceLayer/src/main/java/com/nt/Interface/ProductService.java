package com.nt.Interface;

import com.nt.model.ServiceReq;
import com.nt.model.ServiceRes;

public interface ProductService {
	public ServiceRes get(ServiceReq req);
}
