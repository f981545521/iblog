package cn.acyou.iblog.dao;

import cn.acyou.iblog.entity.User;
/**
 * 用户持久层
 */
public interface UserDao {
	/**按照用户名查找用户*/
	public User findUserByUserName(String username);
	/**增加用户*/
	public int addUser(User user);
	/**注册时判断邮箱是否存在*/
	public String findUserByEmail(String email);
	
	/**按照uid查找用户*/
	public User findUserBuUid(String uid);
}
