package com.boot.dubbo.service.userRight;


import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.WebLog;

public interface WebLogService {

     void add(WebLog webLog);

    void delete(String[] webLogIds);

    void update(WebLog webLog);

    List<WebLog> getList(ParamFilter paramFilter);
}
