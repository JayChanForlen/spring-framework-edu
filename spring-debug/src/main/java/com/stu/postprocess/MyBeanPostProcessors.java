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

	/**
	 * 在 Bean 的初始化之前调用。你可以在这里对 Bean 进行自定义处理，比如修改 Bean 的属性值、验证 Bean 的状态等。
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "：BeanDefinition的前置处理~");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/**
	 * 在 Bean 的初始化之后调用。你可以在这里对 Bean 进行额外的处理，比如执行一些初始化操作、代理 Bean 等。
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "：BeanDefinition的后置处理~");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
