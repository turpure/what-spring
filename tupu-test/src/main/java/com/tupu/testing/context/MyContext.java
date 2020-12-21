package com.tupu.testing.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoupengxu
 * @description
 * @date 2020/12/21
 **/
public class MyContext extends ClassPathXmlApplicationContext {
	public MyContext(String configLocation) {
		super(configLocation);
		System.out.println("config location is " + configLocation);

	}
}
