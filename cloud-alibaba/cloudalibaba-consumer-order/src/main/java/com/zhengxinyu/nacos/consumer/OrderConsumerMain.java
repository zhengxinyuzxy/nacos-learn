package com.zhengxinyu.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhengxinyu
 * @date 2022/6/18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain.class, args);
    }
}
