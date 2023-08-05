package com.stu;

import com.stu.event.CustomEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JayChan
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.getBean("person1");
		applicationContext.publishEvent(new CustomEvent(applicationContext, "msggggggg"));
	}
}