package com.boot.dubbo.provider.userRight;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dubbo.entity.User;
import com.boot.dubbo.provider.userRight.dao.UserDao;
import com.boot.dubbo.service.userRight.LoginService;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

@Service(protocol = {"dubbo"})
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserDao userDao;

    @Override
    public User doLogin(String account, String clientIp) {
        checkArgument(!Strings.isNullOrEmpty(account),"帐号不能为空");
        String accountToUse = account.toUpperCase();
        User user = userDao.findUnique("getByAccount", accountToUse);
        if(user==null){
            //帐号不存在
            throw new UnknownAccountException();
        }
        if(user.getIsLock()){
            //帐号被锁定
            throw new LockedAccountException();
        }
        String userId = user.getUserId();
        Map<String,Object> updateParam =Maps.newHashMap();
        updateParam.put("loginTime", new Date());
        updateParam.put("loginIp", clientIp);
        updateParam.put("errorCount", 0);
        updateParam.put("userId", userId);
        userDao.update("updateLoginInfo", updateParam);
        return user;
    }
}
