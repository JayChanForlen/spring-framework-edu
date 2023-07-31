package com.stu.context;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyClassPathApplicationContext
 * @Author: JayChan
 * @Date: 2023/7/29 11:46
 * @Description: No description
 */

public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext {

	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	protected void initPropertySources() {
		logger.info("自定义扩展initPropertySources");
		getEnvironment().setRequiredProperties("aaa");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
	}
}
