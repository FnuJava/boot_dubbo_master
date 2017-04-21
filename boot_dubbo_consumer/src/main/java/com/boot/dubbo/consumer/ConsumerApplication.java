package com.boot.dubbo.consumer;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableDubboAutoConfiguration
@ComponentScan("com.boot.dubbo")
@ImportResource(locations={"classpath:dubbo_consumer.xml","classpath:spring-shiro.xml"})
@PropertySource("classpath:dubbo.properties")
public class ConsumerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }
}
