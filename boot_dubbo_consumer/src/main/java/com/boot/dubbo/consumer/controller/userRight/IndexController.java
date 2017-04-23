package com.boot.dubbo.consumer.controller.userRight;

import com.boot.dubbo.common.core.Response;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.common.page.Page;
import com.boot.dubbo.consumer.aop.annotaion.WebLogger;
import com.boot.dubbo.consumer.util.UserContextUtil;
import com.boot.dubbo.entity.Dict;
import com.boot.dubbo.entity.pojo.MenuTitle;
import com.boot.dubbo.service.userRight.DictService;
import com.boot.dubbo.service.userRight.MenuService;
import com.google.common.base.Preconditions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import javax.annotation.Resource;

@Controller
public class IndexController {

    @Resource
    private MenuService menuService;

    @GetMapping(value ={"/","/index"} )
    public String index(ModelMap modelMap){
        String roleId = (String) UserContextUtil.getAttribute("roleId");
        List<MenuTitle> menuTitleList = menuService.getListByRoleId(roleId);
        modelMap.put("menuList",menuTitleList);
        modelMap.put("roleMap",UserContextUtil.getAttribute("roleMap"));
        return "index";
    }
}
