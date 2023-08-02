package com.stu.aware;

import com.stu.service.OperateService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName: MyAware
 * @Author: JayChan
 * @Date: 2023/8/2 21:08
 * @Description: 允许 Bean 获取对 Spring 应用程序上下文的引用。通过实现 ApplicationContextAware 接口，
 * Bean 可以在初始化时获得对 Spring 应用程序上下文（ApplicationContext）的引用，从而可以访问容器中的其他 Bean 或执行一些与容器相关的操作。
 */

public class MyAware implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		OperateService operateService = applicationContext.getBean(OperateService.class);
		operateService.operate();
	}
}
