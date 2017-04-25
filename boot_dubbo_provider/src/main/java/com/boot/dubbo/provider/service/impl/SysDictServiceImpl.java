package com.boot.dubbo.provider.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Dict;
import com.boot.dubbo.entity.SysDict;
import com.boot.dubbo.entity.pojo.JSTree;
import com.boot.dubbo.provider.mapper.SysDictMapper;
import com.boot.dubbo.service.ISysDictService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service(protocol = {"dubbo"})
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements ISysDictService {

	@Override
	public void add(SysDict dict) {
		dict.insert();
	}

	@Override
	public List<SysDict> getList(ParamFilter queryFilter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SysDict dict) {
		dict.updateById();
	}

	@Override
	public List<JSTree> getTree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDict> getListByParentId(String parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDict> getCatagory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(List<String> id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dict getById(String id) {
		// TODO Auto-generated method stub
		return getById(id);
	}
	
}
