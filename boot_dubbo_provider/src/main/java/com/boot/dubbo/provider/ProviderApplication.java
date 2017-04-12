package com.boot.dubbo.provider;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDubboAutoConfiguration
@ComponentScan("com.boot.dubbo")
public class ProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
  }
}
