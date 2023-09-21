package com.luanbai.judge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.luanbai")
@EnableFeignClients(basePackages = "com.luanbai.client.feign")
public class LuanbaiojJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuanbaiojJudgeServiceApplication.class, args);
    }

}
