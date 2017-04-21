package com.boot.dubbo.consumer.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dubbo.service.user.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	public String sayHllo(){
		userService.sayHello();
		return "消费成功";
	}
	
	
	@RequestMapping("delete")
	public String delete(){
		return "删除成功";
	}
	
	
	@RequestMapping("login")
	public String login(){
		 Subject subject = SecurityUtils.getSubject();
		 UsernamePasswordToken token  = new UsernamePasswordToken("sam","123456");
		 subject.login(token); 
         //验证是否登录成功  
         if(subject.isAuthenticated())  
         {  
          System.out.println("用户：[sam]进行登录验证通过");  
         }else  
         {  
          token.clear();  
         }  
		return "登录成功";
	}
	
	
	

}
