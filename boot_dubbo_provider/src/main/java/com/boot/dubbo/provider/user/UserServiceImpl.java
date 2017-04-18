package com.boot.dubbo.provider.user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dubbo.service.user.UserService;

@Service(protocol = { "rest", "dubbo" })
@Path("user")
public class UserServiceImpl implements UserService {
	
	@Transactional
	@GET
	@Path("sayHello")
	public String sayHello() {
		System.out.println("hello dubbo");
		return "6666";

	}

}
