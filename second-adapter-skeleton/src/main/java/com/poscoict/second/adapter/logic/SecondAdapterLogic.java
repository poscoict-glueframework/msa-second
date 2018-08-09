package com.poscoict.second.adapter.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.second.adapter.sdo.SecondDTO;
import com.poscoict.second.adapter.spec.SecondAdapter;
import com.poscoict.second.domain.entity.SecondEntity;
import com.poscoict.second.domain.logic.SecondLogic;

@Service
public class SecondAdapterLogic implements SecondAdapter {
	@Autowired
	private SecondLogic logic;
	@Override
	public SecondDTO findSecond(String name) {
		List<SecondEntity> entities = logic.findAll();
		for( SecondEntity entity : entities ){
			if( entity.getName().equals(name) ){
				SecondDTO dto = SecondDTO.fromJson(entity.toJson());
				dto.setValue(entity.getAge()+" years old.");
				return dto;
			}
		}
		return null;
	}
}
