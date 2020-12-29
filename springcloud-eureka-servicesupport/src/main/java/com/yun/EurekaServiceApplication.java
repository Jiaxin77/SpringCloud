package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName EurekaServiceApplication
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/12/28 8:56 下午
 * @Version 1.0
 **/

@SpringBootApplication
@EnableDiscoveryClient//代表自己是一个服务提供方
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}