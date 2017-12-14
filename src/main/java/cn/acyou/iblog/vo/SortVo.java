package cn.acyou.iblog.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author youfang
 * @create 2017-12-14 20:33
 */
public class SortVo implements Serializable {

    private Integer sid;//主键ID
    private String sortName;//分类名称
    private Integer uid;//所属用户ID
    private String description;//描述

    @Override
    public String toString() {
        return "SortVo{" +
                "sid=" + sid +
                ", sortName='" + sortName + '\'' +
                ", uid=" + uid +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
