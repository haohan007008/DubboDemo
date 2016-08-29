package com.howbuy.fp;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

public class ConsumerMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo.xml"}); 
		context.start();
		
		DemoService demoService = (DemoService) context.getBean("demoService"); 
		
		String hello = demoService.sayHello("meng.lv"); 
		
		System.out.println(hello);
		
		hello = demoService.sayBye("meng.lv");
		
		System.out.println(hello);
		
		Future<String> barFuture = RpcContext.getContext().getFuture(); 
		hello = barFuture.get();
		
		System.out.println(hello);
		
	}

}
