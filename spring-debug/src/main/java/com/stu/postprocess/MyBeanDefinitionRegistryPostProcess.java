package com.stu.postprocess;

import com.stu.common.CommonConfig;
import com.stu.dto.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @ClassName: MyBeanDefinitionRegistryPostProcess
 * @Author: JayChan
 * @Date: 2023/8/1 18:39
 * @Description: 该类下存在3个方法，但是需要注意的是，这三个方法均来自于不用的地方
 * postProcessBeanFactory来自于BeanFactoryPostProcessor，主要用于实现对BeanFactory的修改
 * postProcessBeanDefinitionRegistry来自于BeanDefinitionRegistryPostProcessor，主要用于实现对BeanFactory中BeanDefinition的操作（增删改查）
 * getOrder来源于PriorityOrdered中的Ordered，用于标识执行顺序
 *
 * 虽然我们在单体IOC的使用中往往是使用DefaultListableBeanFactory容器的
 * 其对ConfigurableListableBeanFactory与BeanDefinitionRegistry均有实现，但是从各个方法中的参数我们就可以看出，他们所实现的侧重点是不一致的
 *
 * @see org.springframework.beans.factory.support.DefaultListableBeanFactory
 */

public class MyBeanDefinitionRegistryPostProcess implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(CommonConfig.Shared.BEAN_FACTORY_POST_PROCESS_ORDER++
				+ "、 MyBeanDefinitionRegistryPostProcess.postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class).getBeanDefinition();
		registry.registerBeanDefinition("PostProcessBeanDefinitionRegistryPerson", beanDefinition);
		System.out.println(CommonConfig.Shared.BEAN_FACTORY_POST_PROCESS_ORDER++
				+ "、 MyBeanDefinitionRegistryPostProcess.postProcessBeanDefinitionRegistry");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
