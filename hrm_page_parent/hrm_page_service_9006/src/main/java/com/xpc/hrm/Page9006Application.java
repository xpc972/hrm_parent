package com.xpc.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xpc.hrm.mapper")
@EnableFeignClients
public class Page9006Application {
    public static void main(String[] args) {
        SpringApplication.run(Page9006Application.class,args);
    }
}
