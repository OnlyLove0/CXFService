package com.wdp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	List<String> sayHello(@WebParam(name ="name") String name);
}
