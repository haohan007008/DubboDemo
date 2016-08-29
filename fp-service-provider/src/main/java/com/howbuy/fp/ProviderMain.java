package com.howbuy.fp;

import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo.xml"}); 
		context.start();
		
		CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
	}

}
