package com.stu.event;

import org.springframework.context.ApplicationListener;

/**
 * @ClassName: CustomEventListener
 * @Author: JayChan
 * @Date: 2023/8/5 16:10
 * @Description: No description
 */

public class CustomEventListener implements ApplicationListener<CustomEvent> {

	public CustomEventListener() {
	}

	@Override
	public void onApplicationEvent(CustomEvent event) {
		String message = event.getMessage();
		System.out.println("Received custom event with message: " + message);
	}
}
