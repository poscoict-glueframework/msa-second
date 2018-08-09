package com.poscoict.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.poscoict.second" })
public class SecondAppliction {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppliction.class, args);
	}
}
