package com.boot.dubbo.provider.service.impl;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysWebLog;
import com.boot.dubbo.entity.WebLog;
import com.boot.dubbo.provider.mapper.SysWebLogMapper;
import com.boot.dubbo.service.ISysWebLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysWebLogServiceImpl extends ServiceImpl<SysWebLogMapper, SysWebLog> implements ISysWebLogService {

	@Override
	public void add(WebLog webLog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String[] webLogIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(WebLog webLog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WebLog> getList(ParamFilter paramFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
