package com.boot.dubbo.consumer.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dubbo.service.userRight.UserService;



@RestController
@RequestMapping("user")
public class UserController1 {
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	public String sayHllo(){
		System.out.print(userService.getByUserId("1").getAccount()+"66");
		return "消费成功";
	}
	
	
	@RequestMapping("delete")
	public String delete(){
		return "删除成功";
	}
	
	
	@RequestMapping(value="login/{userName}",method = RequestMethod.GET)
	public String login(@PathVariable String userName,@RequestParam String pwd){
		 logger.info("ddd"+userName);
		 Subject subject = SecurityUtils.getSubject();
		 UsernamePasswordToken token  = new UsernamePasswordToken(userName,pwd);
		 subject.login(token); 
         //验证是否登录成功  
         if(subject.isAuthenticated())  
         {  
          System.out.println("用户：["+userName+"]进行登录验证通过");  
         }else  
         {  
          token.clear();  
         }  
		return "登录成功";
	}
	
	
	

}
