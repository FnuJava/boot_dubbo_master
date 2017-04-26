package com.boot.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;


@SpringBootApplication
@EnableDubboAutoConfiguration
@ComponentScan("com.boot.dubbo")
@ImportResource("classpath:dubbo_provider.xml")
@PropertySource(value={"dubbo.properties"})
public class ProviderApplication {
	  public static void main(String[] args) {
		  ConfigurableApplicationContext contentApplicationContext = SpringApplication.run(ProviderApplication.class, args);
	  
	  }
}
