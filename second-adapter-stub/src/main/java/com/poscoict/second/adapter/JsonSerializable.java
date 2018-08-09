package com.poscoict.second.adapter;

public interface JsonSerializable {
	default String toJson() {
		return JsonUtil.toJson(this);
	}
}
