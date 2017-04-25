package com.boot.dubbo.service;

import java.util.List;
import java.util.Map;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysUser;
import com.boot.dubbo.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysUserService extends IService<SysUser> {
    List getList(ParamFilter param);

    void updateDefaultPwd(List<String> userIds);

    void update(User user);

    void add(User user);

    void updatePwd(String originPwd,String confirmPwd,String newPwd);

    void delete(List<String> userIds);

    Map getDetail(String userId);

    User getByUserId(String userId);

    List<String> getPermission(String account);
}
