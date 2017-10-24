package com.marxcosh.learn.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marxcosh.learn.batch.SpringBatchDemoTests;

@SpringBootApplication
public class SpringBatchDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchDemoTests.class, args);
	}
}
