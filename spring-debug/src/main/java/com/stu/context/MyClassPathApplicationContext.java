package com.stu.context;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @ClassName: MyClassPathApplicationContext
 * @Author: JayChan
 * @Date: 2023/7/29 11:46
 * @Description: No description
 */

public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext {

	@Override
	protected void initPropertySources() {
		System.out.println("自定义扩展initPropertySources");
		getEnvironment().setRequiredProperties("aaa");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("当前注册bean为" + Arrays.toString(beanDefinitionNames));
		super.postProcessBeanFactory(beanFactory);
	}
}
