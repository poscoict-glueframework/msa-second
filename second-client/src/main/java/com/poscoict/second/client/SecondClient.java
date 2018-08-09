package com.poscoict.second.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poscoict.second.adapter.client.SecondAdapter;
import com.poscoict.second.adapter.sdo.SecondDTO;

@FeignClient(name = "second-api", path = "adapter/second")
public interface SecondClient extends SecondAdapter {
	@GetMapping(params = { "name" })
	public SecondDTO findSecond(@RequestParam String name);
}