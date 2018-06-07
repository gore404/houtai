package com.jiros.jirosfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class JirosFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(JirosFeignApplication.class, args);
        System.out.print("++++++++++++++++++++++++服务消费者启动成功！！++++++++++++++++++++++++");
    }
}
