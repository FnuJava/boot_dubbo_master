package com.boot.dubbo.service.userRight;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.LoginLog;

public interface LoginLogService{

     void add(LoginLog loginLog);

    void delete(String[] loginLogIds);

    List<LoginLog> getList(ParamFilter paramFilter);
}
