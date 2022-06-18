package com.zhengxinyu.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengxinyu
 * @date 2022/6/18
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPost;

    @GetMapping("getPayment/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "server-post:" + serverPost + " id:" + id;
    }
}
