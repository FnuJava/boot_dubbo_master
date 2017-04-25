package com.boot.dubbo.provider;

import java.util.Date;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import com.boot.dubbo.entity.SysLoginLog;
import com.boot.dubbo.service.ISysLoginLogService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@EnableDubboAutoConfiguration
@ComponentScan("com.boot.dubbo")
@ImportResource("classpath:dubbo_provider.xml")
@MapperScan("com.boot.dubbo.provider.mapper*")
public class ProviderApplication {
	  public static void main(String[] args) {
		  ConfigurableApplicationContext contentApplicationContext = SpringApplication.run(ProviderApplication.class, args);
		  ISysLoginLogService iSysLoginLogService = contentApplicationContext.getBean(ISysLoginLogService.class);
		  SysLoginLog sysLoginLog = new SysLoginLog();
		  sysLoginLog.setId(10000);
		  sysLoginLog.setLoginLogId("1");
		  sysLoginLog.setLoginAccount("120");
		  sysLoginLog.setLoginTime(new Date());
		  sysLoginLog.setLoginIp("124");
		  sysLoginLog.setStatus("0");
		  sysLoginLog.setIsDelete(0);
		  sysLoginLog.setCreateTime(new Date());
		  sysLoginLog.setUpdateTime(new Date());
		  System.out.println(iSysLoginLogService.insert(sysLoginLog));
	  
	  }
}
