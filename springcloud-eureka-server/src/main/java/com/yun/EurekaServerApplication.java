package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/12/28 2:35 下午
 * @Version 1.0
 **/

@SpringBootApplication
@EnableEurekaServer // 当前使用eureka的server
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
