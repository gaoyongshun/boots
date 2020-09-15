package com.gys;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@NacosPropertySource(dataId = "bamboo.test", autoRefreshed = true)
public class BootesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootesApplication.class,args);
    }

    @NacosValue(value = "${service.name:1}", autoRefreshed = true)
    private String serverName;

    @GetMapping(value = "/test")
    @ResponseBody
    public String get() {
        return serverName;
    }

}
