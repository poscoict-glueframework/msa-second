package com.poscoict.second.adapter.sdo;

import com.poscoict.second.adapter.JsonSerializable;
import com.poscoict.second.adapter.JsonUtil;

public class SecondDTO implements JsonSerializable {
	public static SecondDTO fromJson(String json) {
		return JsonUtil.fromJson(json, SecondDTO.class);
	}

	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}