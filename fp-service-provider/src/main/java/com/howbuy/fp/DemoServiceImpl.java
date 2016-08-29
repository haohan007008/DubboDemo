package com.howbuy.fp;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello Dubbo,Hello " + name;  
	}
}
