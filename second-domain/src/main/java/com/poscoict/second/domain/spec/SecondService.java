package com.poscoict.second.domain.spec;

import java.util.List;

import com.poscoict.second.domain.entity.SecondEntity;

public interface SecondService {
	List<SecondEntity> findAll();

	void registerData(String name, int age);

	void modifyData(String name, int age);

	void removeData(String name);
}
