package com.howbuy.fp;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo.xml"}); 
		context.start();
		
		DemoService demoService = (DemoService) context.getBean("demoService"); 
		
		String hello = demoService.sayHello("meng.lv"); 
		
		System.out.println(hello);
	}

}
