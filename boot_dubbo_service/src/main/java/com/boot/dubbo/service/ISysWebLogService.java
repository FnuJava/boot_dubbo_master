package com.boot.dubbo.service;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysWebLog;
import com.boot.dubbo.entity.WebLog;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysWebLogService extends IService<SysWebLog> {
	void add(WebLog webLog);

	void delete(String[] webLogIds);
	
	void update(WebLog webLog);
	
	List<WebLog> getList(ParamFilter paramFilter);
}
