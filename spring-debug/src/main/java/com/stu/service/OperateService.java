package com.stu.service;

import com.stu.dto.Person;
import lombok.Data;

/**
 * @ClassName: DoSomeThing
 * @Author: JayChan
 * @Date: 2023/8/2 21:00
 * @Description: No description
 */
@Data
public class OperateService {

	private Person person;

	private String operation;

	public void operate() {
		System.out.println(person.getName() + "正在" + operation);
	}

}
