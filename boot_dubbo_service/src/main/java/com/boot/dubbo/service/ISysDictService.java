package com.boot.dubbo.service;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Dict;
import com.boot.dubbo.entity.SysDict;
import com.boot.dubbo.entity.pojo.JSTree;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysDictService extends IService<SysDict> {
	
	void add(SysDict dict);

	List<SysDict> getList(ParamFilter queryFilter);

	void update(SysDict dict);

	List<JSTree> getTree();

	List<SysDict> getListByParentId(String parentId);

	List<SysDict> getCatagory();

	void delete(List<String> id);

	Dict getById(String id);
}
