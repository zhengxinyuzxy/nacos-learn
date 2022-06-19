package com.zhengxinyu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengxinyu
 * @date 2022/6/18
 */
@RestController
@RefreshScope
public class ConfigClientController {
    // dev01添加
    // test01添加
    // test02添加

    //  获取配置中心的配置数据
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
