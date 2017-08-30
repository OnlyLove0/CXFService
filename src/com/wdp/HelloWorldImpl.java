package com.wdp;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public List<String> sayHello(String name) {
		String str1 = "Hello" + name;
		String str2 = "World" + name;
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		return list;
	}

}
