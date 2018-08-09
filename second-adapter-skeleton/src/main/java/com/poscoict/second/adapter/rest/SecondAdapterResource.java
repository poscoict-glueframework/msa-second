package com.poscoict.second.adapter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.second.adapter.logic.SecondAdapterLogic;
import com.poscoict.second.adapter.sdo.SecondDTO;
import com.poscoict.second.adapter.spec.SecondAdapter;

@RestController
@RequestMapping("adapter/second")
public class SecondAdapterResource implements SecondAdapter {
	@Autowired
	private SecondAdapterLogic logic;

	@Override
	@GetMapping(params = { "name" })
	public SecondDTO findSecond(@RequestParam String name) {
		return logic.findSecond(name);
	}
}
