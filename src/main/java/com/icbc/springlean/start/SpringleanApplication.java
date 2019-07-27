package com.icbc.springlean.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.icbc.springlean"})
@MapperScan(basePackages = {"com.icbc.springlean"})
public class SpringleanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringleanApplication.class, args);
	}

}
