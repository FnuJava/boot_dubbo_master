package com.boot.dubbo.consumer.controller.userRight;

import static com.google.common.base.Preconditions.checkArgument;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dubbo.common.core.Response;
import com.boot.dubbo.consumer.aop.annotaion.WebLogger;
import com.boot.dubbo.service.userRight.UserRoleService;
import com.google.common.base.Strings;

@Controller
@RequestMapping("userRole")
public class UserRoleController {

    @Resource
    private UserRoleService userRoleService;

    @ResponseBody
    @PostMapping("add")
    @WebLogger("添加用户-角色")
    public Response add(String userId,@RequestParam(name="roleIds[]",required=false)  String[] roleIds){
        checkArgument(!Strings.isNullOrEmpty(userId),"用户编号不能为空");
        userRoleService.add(roleIds,userId);
        return new Response("保存成功");
    }
}
