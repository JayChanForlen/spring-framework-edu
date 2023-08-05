package com.stu.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: CustomEvent
 * @Author: JayChan
 * @Date: 2023/8/5 16:41
 * @Description: No description
 */

public class CustomEvent extends ApplicationEvent {

	private String msg;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public CustomEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
