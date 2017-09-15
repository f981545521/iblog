package cn.acyou.iblog.service.Impl;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import cn.acyou.iblog.dao.UserDao;
import cn.acyou.iblog.entity.User;
import cn.acyou.iblog.service.PasswordException;
import cn.acyou.iblog.service.UserNameException;
import cn.acyou.iblog.service.UserNotFoundException;
import cn.acyou.iblog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	/**用户登录*/
	public User login(String username, String password) throws UserNotFoundException, PasswordException {
		User user=userDao.findUserByUserName(username);
		//查找不到用户的时候说明用户不存在
		if(user==null){
			throw new UserNotFoundException("用户名错误");
		}
		//只要有引用类型变量；考虑是否有null的情况；
		//当一个引用类型变量其值为空的时候，访问它的属性或者方法会出现空指针异常；
		//确保它一定引用对象
		if(username==null||username.trim().isEmpty()){
			throw new UserNotFoundException("用户名不能为空");
		}
		if(password==null||password.trim().isEmpty()){
			throw new PasswordException("密码不能为空");
		}
		String salt="小星星";
		String md5Password=DigestUtils.md5Hex(salt+password);
		if(!(user.getPassword().equals(md5Password))){
			throw new PasswordException("密码错误");
		}
		return user;
	}
	/**
	 * 检测邮箱是否已经注册；
	 * 返回字符串：true/false
	 * */
	public String checkEmail(String email) {
		String result=userDao.findUserByEmail(email);
		if(result==null){
			return "true";
		}else{
			return "false";
		}
	}
	
	/**用户注册*/
	public User registUser(String email, String username, String password, String confirm_password, String email_code)throws UserNameException {
		if(email==null||email.trim().isEmpty()||username==null||username.trim().isEmpty()){
			throw new UserNameException("邮箱/用户名不能为空");
		}
		String message=userDao.findUserByEmail(email);
		if("true".equals(message)){
			throw new UserNameException("该用户已经存在");
		}
		if(!confirm_password.equals(password)){
			throw new PasswordException("密码不一致");
		}
		User user=new User();
		user.setEmail(email);
		user.setUsername(username);
		String salt="小星星";
		String md5Password=DigestUtils.md5Hex(salt+password);
		user.setPassword(md5Password);
		int a=userDao.addUser(user);
		System.out.println(a);
		return user;
	}
	
}
