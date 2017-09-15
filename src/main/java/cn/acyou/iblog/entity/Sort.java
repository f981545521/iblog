package cn.acyou.iblog.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Sort implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sid;//主键ID
	private String sortName;//分类名称
	private Integer uid;//所属用户ID
	private String description;//描述
	private Timestamp createTime;//创建时间
	public Sort() {
		super();
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
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Sort(Integer sid, String sortName, Integer uid, String description, Timestamp createTime) {
		super();
		this.sid = sid;
		this.sortName = sortName;
		this.uid = uid;
		this.description = description;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sortName=" + sortName + ", uid=" + uid + ", description=" + description
				+ ", createTime=" + createTime + "]";
	}
	
	

}
