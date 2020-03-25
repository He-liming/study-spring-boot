package com.xiaoming.springboot.entities;

import lombok.Data;

@Data
public class Department {

	private Integer id;
	private String departmentName;

	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}
}
