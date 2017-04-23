package com.boot.dubbo.service.userRight;

import com.boot.dubbo.entity.User;


public interface LoginService {

	User doLogin(String account, String clientIp);
	
}
