package cn.acyou.iblog.entity;

import se.spagettikod.optimist.Identity;
import se.spagettikod.optimist.OptimisticLocking;
import se.spagettikod.optimist.Version;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@OptimisticLocking("ib_sort")
public class Sort implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Identity("id")
	private Integer id;//主键ID
	private String sortName;//分类名称
	private Integer uid;//所属用户ID
	private String description;//描述
	private Timestamp createTime;//创建时间
	private Date modifiedtime;

	@Version(value = "version")
	private Integer version;
	
	
	public Sort() {
		super();
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
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getModifiedtime() {
		return modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Sort(Integer sid, String sortName, Integer uid, String description, Timestamp createTime) {
		super();
		this.id = sid;
		this.sortName = sortName;
		this.uid = uid;
		this.description = description;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Sort [sid=" + id + ", sortName=" + sortName + ", uid=" + uid + ", description=" + description
				+ ", createTime=" + createTime + "]";
	}
	
	

}
