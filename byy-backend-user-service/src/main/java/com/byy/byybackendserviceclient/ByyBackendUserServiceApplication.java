package com.byy.byybackendserviceclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.byy.byybackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.byy")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.byy.byybackendserviceclient.service"})
public class ByyBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ByyBackendUserServiceApplication.class, args);
    }

}
