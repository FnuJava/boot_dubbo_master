package com.boot.dubbo.consumer.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

public class MyShiroRealm extends AuthorizingRealm {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
	 * .shiro.subject.PrincipalCollection) 为当前登录的Subject授予角色和权限
	 * 
	 * @see 经测试:本例中该方法的调用时机为需授权资源被访问时
	 * 
	 * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		// 获取当前登录的用户名
		String username = (String) super.getAvailablePrincipal(principals);
		// 根据用户名从数据库中获取用户信息
		// User user =userService.queryUserByUserName(username);

		List<String> roleList = new ArrayList<String>();
		List<String> permList = new ArrayList<String>();
		System.out.println("对当前用户：[" + username + "]进行授权！");
		roleList.add("kefu");
		permList.add("user:delete");

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(roleList);
		info.addStringPermissions(permList);

		return info;
		// 若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址

		// return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org
	 * .apache.shiro.authc.AuthenticationToken) 验证当前登录的Subject
	 * 
	 * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authToken) throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authToken;

		System.out.println("验证当前Subject时获取到token为"+ ReflectionToStringBuilder.toString(token,ToStringStyle.MULTI_LINE_STYLE));

		if (token.getUsername().equals("sam")) {
			AuthenticationInfo info = new SimpleAuthenticationInfo(
					token.getUsername(), token.getPassword(), getName());
			return info;
		}

		return null;
	}

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object key, Object value) {
		Subject currSubject = SecurityUtils.getSubject();
		if (currSubject != null) {
			Session session = currSubject.getSession();
			System.out
					.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");

			if (session != null) {
				session.setAttribute(key, value);
			}
		}

	}
}
