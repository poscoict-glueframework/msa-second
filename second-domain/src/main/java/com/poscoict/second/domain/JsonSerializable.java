package com.poscoict.second.domain;


public interface JsonSerializable {
	default String toJson() {
		return JsonUtil.toJson(this);
	}
}
