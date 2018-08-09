package com.poscoict.second.domain.logic;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.poscoict.second.domain.entity.SecondEntity;
import com.poscoict.second.domain.spec.SecondService;

@Service
public class SecondLogic implements SecondService {
	private List<SecondEntity> list = new ArrayList<>();

	@Override
	public List<SecondEntity> findAll() {
		return list;
	}

	@Override
	public void registerData(String name, int age) {
		SecondEntity entity = new SecondEntity();
		entity.setName(name);
		entity.setAge(age);
		list.add(entity);
	}

	@Override
	public void modifyData(String name, int age) {
		for (SecondEntity entity : list) {
			if (name.equals(entity.getName())) {
				entity.setAge(age);
			}
		}

	}

	@Override
	public void removeData(String name) {
		for (SecondEntity entity : list) {
			if (name.equals(entity.getName())) {
				list.remove(entity);
			}
		}
	}

	@PostConstruct
	public void init() {
		SecondEntity entity = new SecondEntity();
		entity.setName("1st");
		entity.setAge(9);
		entity.setDesc("첫번째");
		list.add(entity);
		entity = new SecondEntity();
		entity.setName("2nd");
		entity.setAge(5);
		entity.setDesc("두번째");
		list.add(entity);
	}
}
