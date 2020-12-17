package com.tupu.testing;

import com.tupu.testing.dao.FirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author zhoupengxu
 * @description
 * @date 2020/12/16
 **/

public class TestingApplication {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml");
		FirstBean firstBean = (FirstBean) context.getBean("firstBean");
		String name = firstBean.getBeanName();
		Environment env = firstBean.getEnvironment();
		System.out.println("the name of bean is " + name);
		System.out.println(env);
	}
}
