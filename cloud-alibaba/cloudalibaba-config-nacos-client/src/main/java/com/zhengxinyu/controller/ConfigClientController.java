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

    // 远程master添加

    //  获取配置中心的配置数据
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        String originDev =  "远程dev分支添加";
        String localDev =  "本地dev分支添加";
        localDev =  "本地dev分支第二次添加";
        String localMaster =  "本地master分支添加";
        localDev =  "本地dev分支第三次添加";
        localMaster =  "本地master分支第二次添加";
        localMaster =  "本地master分支第三次添加";
        localDev =  "本地dev分支第四次次添加";
        return configInfo;
    }
}
