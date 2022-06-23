package com.kirillsoklakov.spring.rest.cofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.kirillsoklakov.spring.rest")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
