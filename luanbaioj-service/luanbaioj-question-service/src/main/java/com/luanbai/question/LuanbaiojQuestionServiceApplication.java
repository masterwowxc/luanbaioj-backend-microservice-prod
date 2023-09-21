package com.luanbai.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.luanbai")
@EnableFeignClients(basePackages = "com.luanbai.client.feign")
public class LuanbaiojQuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuanbaiojQuestionServiceApplication.class, args);
	}

}
