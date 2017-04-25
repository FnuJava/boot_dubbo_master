package com.boot.dubbo.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysLoginLog;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysLoginLogService extends IService<SysLoginLog> {


   void add(SysLoginLog loginLog);

   void delete(String[] loginLogIds);

   List<SysLoginLog> getList(ParamFilter paramFilter);

}
