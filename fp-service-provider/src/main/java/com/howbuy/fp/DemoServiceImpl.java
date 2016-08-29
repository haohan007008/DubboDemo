package com.howbuy.fp;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello Dubbo,Hello " + name;  
	}

	public String sayBye(String name) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Byebye " + name;  
	}
	
	
}
