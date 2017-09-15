package cn.acyou.iblog.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable{

	private static final long serialVersionUID = -1419441444834797949L;
	private Integer uid;
	private String username;
	private String password;
	private String nickname;
	private String role;
	private String enable;
	private String photo;
	private String email;
	private String description;
	private Timestamp createtime;
	public User() {
		super();
	}
	public User(Integer uid, String username, String password, String nickname, String role, String enable,
			String photo, String email, String description, Timestamp createtime) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.role = role;
		this.enable = enable;
		this.photo = photo;
		this.email = email;
		this.description = description;
		this.createtime = createtime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", role=" + role + ", enable=" + enable + ", photo=" + photo + ", email=" + email + ", description="
				+ description + ", createtime=" + createtime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}
	
	

}
