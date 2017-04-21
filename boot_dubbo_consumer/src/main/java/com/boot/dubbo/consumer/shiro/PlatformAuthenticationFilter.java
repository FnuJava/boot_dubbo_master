/*
 * 文 件 名:  PlatformAuthenticationFilter.java
 * 版    权:  © 2013 dimeng. All rights reserved.
 * 描    述:  <描述>
 * 修 改 人:  huanggang
 * 修改时间:  2014-2-17
 */
package com.boot.dubbo.consumer.shiro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;

/**
 * shiro 自定义过滤器
 * 
 * @author  huanggang
 * @version  [版本号, 2013-12-17]
 */
public class PlatformAuthenticationFilter extends AuthenticationFilter
{
    private static final Log log = LogFactory.getLog(PlatformAuthenticationFilter.class);
    
/*    @Resource(name = "redisManager")
    private RedisManager loginCache;*/
    /*
    @Autowired
    private CacheManager cacheManager;*/
    
    
    
    /** 
     * 把错误信息写到response
     * @param response
     * @param baseResp
     * @throws IOException
     * @see [类、类#方法、类#成员]
     */
    private void whriteJsonToResponse(ServletResponse response, Object baseResp)
        throws IOException
    {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(baseResp.toString());
        log.info("PlatformAuthenticationFilter whriteJsonToResponse BaseResp =" + baseResp);
        response.flushBuffer();
        
    }
    
    /**
     * 访问被拒绝
     *   
     **/
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
        throws Exception
    {
        //        Subject subject = getSubject(request, response);
        //        if (null == subject.getPrincipal() || null == subject.getSession())
        //        {//表示没有登录，重定向到登录页面  
        //            saveRequest(request);
        //            BaseResp baseResp = new BaseResp();
        //            baseResp.setCode(IResultsCode.UserManager.ERROR_DIS_ACCREDIT);
        //            baseResp.setDescription("not login");
        //            
        //            whriteJsonToResponse(response, baseResp);
        //            return false;
        //            
        //        }
        
        //        UserInfo userInfo = Transaction.getProfile().getUserInfo();
        //        BaseResp baseResp = new BaseResp();
        //        if (userInfo != null)
        //        {
        //            baseResp.setCode(IResultsCode.Commons.DIS_POPEDOM);
        //            baseResp.setDescription("你无权访问该接口");
        //        }
        //        else
        //        {
        //            baseResp.setCode(IResultsCode.Commons.DIS_ACCREDIT);
        //            baseResp.setDescription("未登录，用户需要登录");
        //        }
        //        whriteJsonToResponse(response, baseResp);
        return true;
    }
    
    /**
     * shiro过滤器
     */
    @Override
    public void doFilterInternal(ServletRequest request, ServletResponse response, FilterChain filterChain)
        throws ServletException, IOException
    {
    	
        String authentication = ((HttpServletRequest)request).getHeader("Authorization");
        // 令牌为空
   /*     if (StringUtils.isBlank(authentication))
        {
            log.info("PlatformAuthenticationFilter.doFilterInternal 【请求头token为空】 resp="+baseResp);
            whriteJsonToResponse(response, baseResp);
            return;
        }*/
        try
        {
        	 //注释cache 不影响登录逻辑 authentication 超出  redis key的长度限制 
        	//byte[] userbyte = loginCache.get(authentication.getBytes());
        /*	if(authentication== null||!authentication.equals("123")){
        		System.out.println("不通过");
        		whriteJsonToResponse(response,"没登录");
        		return;
        	}*/
           /* if(userbyte==null){
                BaseResp baseResp = new BaseResp();
                baseResp.setCode(IResultsCode.USER_ERROR_DIS_ACCREDIT);
                log.info("PlatformAuthenticationFilter.doFilterInternal 【请求传递的token值无效】 resp="+baseResp);
                whriteJsonToResponse(response, baseResp);
                return;
            }*/
            /*String body = new String(RSAEncryptor.decryptByPrivateKey(Base64.decodeBase64(authentication), privateKey));
            String[] body3 = body.split("&");
            long time = Long.parseLong(body3[DigitalAndStringConstant.DigitalConstant.TWO]);
            //判断token时间是否在有效期内
            if (System.currentTimeMillis() > time)
            {
                BaseResp baseResp = new BaseResp();
                baseResp.setCode(IResultsCode.USER_ERROR_DIS_ACCREDIT);
                log.info("PlatformAuthenticationFilter.doFilterInternal 【token已经过期】 resp="+baseResp);
                whriteJsonToResponse(response, baseResp);
                return;
            }*/
            //判断用户是否被锁定
            
            Subject currentUser = SecurityUtils.getSubject();
            //调用业务层处理 resp = xxxx.xxxx();
            UsernamePasswordToken token =new UsernamePasswordToken("sam","123456");
            currentUser.login(token);
        }
        catch (Exception e)
        {
           // whriteJsonToResponse(response, baseResp);
            return;
        }
        super.doFilterInternal(request, response, filterChain);
    }
}