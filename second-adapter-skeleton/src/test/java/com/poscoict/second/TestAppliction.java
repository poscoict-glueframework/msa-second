package com.poscoict.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.poscoict.second" })
public class TestAppliction {
	public static void main(String args[]) {
		SpringApplication.run(TestAppliction.class, args);
	}
}