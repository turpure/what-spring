package com.tupu.testing.dao;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author zhoupengxu
 * @description
 * @date 2020/12/16
 **/
public class FirstBean implements BeanNameAware {
	private String name;
	private String beanName;
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


}
