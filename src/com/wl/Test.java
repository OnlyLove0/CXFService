package com.wl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Test {
	@WebMethod
	String say(@WebParam(name = "name") String name,
			@WebParam(name = "age") String age);
}
