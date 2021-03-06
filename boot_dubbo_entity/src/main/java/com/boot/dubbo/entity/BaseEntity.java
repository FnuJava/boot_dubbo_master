package com.boot.dubbo.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable{

    // 是否删除标识
    private Integer isDelete;

    // 创建人
    private String createBy;

    // 创建时间
    private Date createTime;

    // 更新人
    private String updateBy;

    // 更新时间
    private Date updateTime;

    // 备注
    private String remark;

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
