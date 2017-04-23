package com.boot.dubbo.consumer.controller.userRight;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dubbo.common.core.Response;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.common.page.Page;
import com.boot.dubbo.entity.WebLog;
import com.boot.dubbo.service.userRight.WebLogService;


@Controller
@RequestMapping("webLog")
public class WebLogController {

    @Resource
    private WebLogService webLogService;

    @GetMapping("list")
    public String list(){
        return "webLogList";
    }

    @ResponseBody
    @PostMapping("list")
    public Response list(@RequestBody ParamFilter queryFilter){
        List<WebLog> webLogList = webLogService.getList(queryFilter);
        Page page = queryFilter.getPage();
        return new Response(webLogList,page);
    }
}
