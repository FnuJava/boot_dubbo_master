package com.boot.dubbo.consumer.controller.userRight;

import com.boot.dubbo.common.core.Response;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.common.page.Page;
import com.boot.dubbo.consumer.aop.annotaion.WebLogger;
import com.boot.dubbo.entity.Dict;
import com.boot.dubbo.entity.LoginLog;
import com.boot.dubbo.service.userRight.DictService;
import com.boot.dubbo.service.userRight.LoginLogService;
import com.google.common.base.Preconditions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.annotation.Resource;


@Controller
@RequestMapping("loginLog")
public class LoginLogController {

    @Resource
    private LoginLogService loginLogService;

    @GetMapping("listPage")
    public String list(){
        return "loginLogList";
    }

    @ResponseBody
    @PostMapping("list")
    @WebLogger("查询登录日志列表")
    public Response list(@RequestBody ParamFilter queryFilter){
        List<LoginLog> loginLogList = loginLogService.getList(queryFilter);
        Page page = queryFilter.getPage();
        return new Response(loginLogList,page);
    }
}
