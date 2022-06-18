package com.zhengxinyu.nacos.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhengxinyu
 * @date 2022/6/18
 */
@RestController
@Slf4j
public class OrderConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-service}")
    private String serverUrl;


    @GetMapping("/order/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        String url = serverUrl + "/payment/getPayment/" + id;
        return restTemplate.getForObject(url, String.class);
    }
}
