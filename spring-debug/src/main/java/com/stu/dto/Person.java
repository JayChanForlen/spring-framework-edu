package com.stu.dto;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * @ClassName: Person
 * @Author: JayChan
 * @Date: 2023/7/29 11:46
 * @Description: No description
 */

@Data
@Log
public class Person {

	private Integer id;

	private String name;

	private String description;

	public void a() {
		log.info("");
	}

}
