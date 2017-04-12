package com.boot.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.dubbo.service.user.UserService;

@RestController
public class UserController {
	
	@Reference(version = "1.0.0")
	private UserService userService;
	
	@RequestMapping("hello")
	public String sayHllo(){
		userService.sayHello();
		return "消费成功";
	}

}
