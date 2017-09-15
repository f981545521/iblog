package cn.acyou.iblog.service;

import cn.acyou.iblog.entity.User;

/**
 * User业务层接口
 * @author youfang
 *	登录功能；登录成功返回用户信息，
 *	登录失败；抛出异常；
 */
public interface UserService {
	/**
	 * 用户登录方法
	 * @param username	用户名
	 * @param password	密码
	 * @return	返回用户
	 * @throws UserNotFoundException
	 * @throws PasswordException
	 */
	public User login(String username,String password) 
		throws UserNotFoundException,PasswordException;
	
	/**检查邮箱是否已经注册*/
	public String checkEmail(String email);
	
	/**用户注册*/
	public User registUser(String email,String username,String password,String confirm_password,String email_code)throws UserNameException,PasswordException;
}
