package com.boot.dubbo.provider.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysLoginLog;
import com.boot.dubbo.provider.mapper.SysLoginLogMapper;
import com.boot.dubbo.service.ISysLoginLogService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLog> implements ISysLoginLogService {

	@Override
	public void add(SysLoginLog loginLog) {
		loginLog.insert();
	}

	@Override
	public void delete(String[] loginLogIds) {
		
	}

	@Override
	public List<SysLoginLog> getList(ParamFilter paramFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
