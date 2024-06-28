package com.example.autoconfig;

import com.example.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@Configuration
@ConditionalOnClass(MyService.class)
public class MyServiceAutoConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}