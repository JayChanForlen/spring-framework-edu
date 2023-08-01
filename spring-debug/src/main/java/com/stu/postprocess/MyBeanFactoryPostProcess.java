package com.stu.postprocess;

import com.stu.common.CommonConfig;
import com.stu.dto.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	/**
	 * 更多的适用于BeanFactory的配置和修改
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.setCacheBeanMetadata(false);
		BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person1");
		personBeanDefinition.setLazyInit(false);

		System.out.println(CommonConfig.Shared.BEAN_FACTORY_POST_PROCESS_ORDER++
				+ "、 MyBeanFactoryPostProcess.postProcessBeanFactory");


		//这个地方不会生效，这个是一个很需要注意的事情，很有意思哦
//		Person personBean = (Person) beanFactory.getBean("person1");
//		personBean.setDescription("ByBFPP");
		//答案：这个方法之前是没有进行Bean的初始化的，只进行了实例化，beanFactory.getBean是通过BeanDefinition进行了初始化，但是并不会对BeanDefinition进行修改
	}
}
