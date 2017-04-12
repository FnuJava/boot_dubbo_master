package com.boot.dubbo.provider.user;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dubbo.service.user.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
	
	@Transactional
	public void sayHello() {
		System.out.println("hello dubbo");

	}

}
