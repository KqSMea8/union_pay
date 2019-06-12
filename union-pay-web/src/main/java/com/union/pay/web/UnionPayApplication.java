package com.union.pay.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: FlyPayApplication.java
 * @author: f.hu@i-vpoints.com
 * @date: 2018-09-13 15:32
 * @Description:
 */
@ServletComponentScan
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.union.pay"})
public class UnionPayApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {

        SpringApplication.run(UnionPayApplication.class, args);

    }
}
