package com.spring.demo.dispatcher;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.demo")
public class DispatcherConfig {
    public DispatcherConfig()
    {
        System.out.println("in DispatcherConfig -------------------------------");
    }
}
