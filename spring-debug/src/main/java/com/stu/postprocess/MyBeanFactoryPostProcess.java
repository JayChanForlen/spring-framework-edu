package com.stu.postprocess;

import com.stu.dto.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @ClassName: MyBeanPostProcess
 * @Author: JayChan
 * @Date: 2023/7/29 11:47
 * @Description: No description
 */

public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person1");
//		personBeanDefinition.setBeanClassName("Jay");
		Person personBean = (Person) beanFactory.getBean("person1");
		personBean.setDescription("ByBFPP");
	}
}
