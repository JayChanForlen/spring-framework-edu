package com.stu.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName: MyBeanPostProcessors
 * @Author: JayChan
 * @Date: 2023/7/31 18:16
 * @Description: Bean的后置处理器，用于在初始化的前后去对该bean进行处理，对于每一个bean都会执行，可以判断选择需要使用的bean进行处理
 */

public class MyBeanPostProcessors implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "：BeanDefinition的前置处理~");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "：BeanDefinition的后置处理~");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
