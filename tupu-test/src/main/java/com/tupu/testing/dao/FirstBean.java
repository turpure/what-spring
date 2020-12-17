package com.tupu.testing.dao;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author zhoupengxu
 * @description
 * @date 2020/12/16
 **/
public class FirstBean implements BeanNameAware, EnvironmentAware {
	private String name;
	private String beanName;
	private Environment env;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void initIt() {
		System.out.println("in initialization");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return this.beanName;
	}


	@Override
	public void setEnvironment(Environment environment) {
		this.env = environment;
	}

	public Environment getEnvironment() {
		return this.env;
	}
}
