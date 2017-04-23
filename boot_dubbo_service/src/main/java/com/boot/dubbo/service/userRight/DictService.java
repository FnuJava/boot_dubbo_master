package com.boot.dubbo.service.userRight;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Dict;
import com.boot.dubbo.entity.pojo.JSTree;



public interface DictService{

	void add(Dict dict);

	List<Dict> getList(ParamFilter queryFilter);

	void update(Dict dict);

	List<JSTree> getTree();

	List<Dict> getListByParentId(String parentId);

	List<Dict> getCatagory();

	void delete(List<String> id);

	Dict getById(String id);

}
