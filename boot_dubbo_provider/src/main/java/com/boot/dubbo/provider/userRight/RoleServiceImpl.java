package com.boot.dubbo.provider.userRight;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dubbo.common.core.IdGenerator;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Role;
import com.boot.dubbo.provider.userRight.dao.RoleDao;
import com.boot.dubbo.provider.userRight.dao.RoleMenuDao;
import com.boot.dubbo.service.userRight.RoleService;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

@Service(protocol = {"dubbo"})
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Resource
    private RoleMenuDao roleMenuDao;

    @Override
    public void add(Role role) {
        checkNotNull(role,"角色信息不能为空");
        checkArgument(!Strings.isNullOrEmpty(role.getName()),"角色名称不能为空");
        checkArgument(!Strings.isNullOrEmpty(role.getSign()),"角色标识不能为空");
        String sign = role.getSign();
        Role model = roleDao.findUnique("getRoleBySign", sign);
        checkArgument(model==null,"角色编号已经存在");
        String roleId = IdGenerator.getInstance().nextId();
        role.setRoleId(roleId);
        roleDao.save("addRole", role);
    }

    @Override
    public void delete(List<String> roleIds) {
        for (String roleId : roleIds) {
            Role model = roleDao.findUnique("getRoleByRoleId", roleId);
            checkNotNull(model,"角色对象不存在");
        }
        for (String roleId : roleIds) {
            roleDao.update("deleteByRoleId", roleId);
            roleMenuDao.update("deleteByRoleId", roleId);
        }
    }

    @Override
    public void update(Role role) {
        checkNotNull(role,"角色信息不能为空");
        checkArgument(!Strings.isNullOrEmpty(role.getName()),"角色名称不能为空");
        checkArgument(!Strings.isNullOrEmpty(role.getSign()),"角色标识不能为空");

        Role model = roleDao.findUnique("getRoleByRoleId", role.getRoleId());
        checkNotNull(model,"角色对象不存在");

        Map<String, Object> param = Maps.newHashMap();
        param.put("sign", role.getSign());
        param.put("roleId", role.getRoleId());
        model = roleDao.findUnique("getRoleBySignAndNoRoleId", param);
        checkArgument(model==null,"角色标识已存在");

        param = Maps.newHashMap();
        param.put("sign", role.getSign());
        param.put("name", role.getName());
        param.put("remark", role.getRemark());
        param.put("updateTime", new Date());
        param.put("roleId", role.getRoleId());
        roleDao.update("updateRole", param);
    }

    @Override
    public List<Role> getList(ParamFilter paramFilter) {
        return roleDao.find("getRoleList", paramFilter.getParam(), paramFilter.getPage());
    }

    @Override
    public Role getByRoleId(String roleId) {
        checkArgument(!Strings.isNullOrEmpty(roleId),"角色编号不能为空");
        Role role = roleDao.findUnique("getRoleByRoleId", roleId);
        checkNotNull(role,"角色对象不存在");
        return role;
    }

    @Override
    public List getRoleMap() {
        return roleDao.findMap( "getRoleIdAndName" );
    }
}
