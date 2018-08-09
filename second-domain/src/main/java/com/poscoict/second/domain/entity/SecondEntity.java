package com.poscoict.second.domain.entity;

import java.io.Serializable;

import com.poscoict.second.domain.JsonSerializable;
import com.poscoict.second.domain.JsonUtil;

public class SecondEntity implements Serializable, JsonSerializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String desc;

	public SecondEntity() {
	}

	public static SecondEntity fromJson(String json) {
		return JsonUtil.fromJson(json, SecondEntity.class);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
