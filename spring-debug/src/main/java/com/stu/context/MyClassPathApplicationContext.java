package com.stu.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.NonNull;

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
	protected void customizeBeanFactory(@NonNull DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("当前注册bean为" + Arrays.toString(beanDefinitionNames));
		super.postProcessBeanFactory(beanFactory);
	}

	@Override
	protected void onRefresh() throws BeansException {
		System.out.println("初始化特定上下文子类中的其他特殊bean。");
		super.onRefresh();
	}

	@Override
	protected void prepareRefresh() {
		//TODO 这里实现相关的早期时间和方法
		System.out.println("这里可以对早期的监听器和事件进行赋值，一旦多播器可用就可以直接发布前期的事件触发监听");
		super.prepareRefresh();
	}
}
