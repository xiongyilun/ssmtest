package com.example.ssmtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ssmtest.mapper")
public class SsmtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmtestApplication.class, args);
	}

}
