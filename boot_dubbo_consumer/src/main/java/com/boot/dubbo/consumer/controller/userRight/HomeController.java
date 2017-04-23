package com.boot.dubbo.consumer.controller.userRight;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.dubbo.common.util.SystemInfoUtil;
import com.boot.dubbo.consumer.util.UserContextUtil;
import com.boot.dubbo.entity.Role;
import com.boot.dubbo.entity.User;
import com.boot.dubbo.service.userRight.RoleService;
import com.boot.dubbo.service.userRight.UserService;

@Controller
public class HomeController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @GetMapping("home")
    public String home(ModelMap modelMap) {
        modelMap.put("systemInfo", SystemInfoUtil.getSystemInfo());
        User user = userService.getByUserId(UserContextUtil.getUserId());
        Role role = roleService.getByRoleId(UserContextUtil.getCurrentRoleId());
        modelMap.put("account",user.getAccount());
        modelMap.put("lastLoginIp",user.getLoginIp());
        modelMap.put("role",role.getName());
        return "home";
    }
}
