package com.honeywell.sendmsg.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {""})
@EnableTransactionManagement
public class FireSendmsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireSendmsgApplication.class, args);
    }
}
