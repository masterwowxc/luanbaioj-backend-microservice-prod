package com.luanbai.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.luanbai")
public class LuanbaiojUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuanbaiojUserServiceApplication.class, args);
	}

}
