package com.boot.dubbo.common.mybatis;


import java.io.Serializable;
import java.util.Map;

import com.boot.dubbo.common.page.Page;


public class ParamFilter implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Page page;

    private Map<String,Object> param;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }
}
