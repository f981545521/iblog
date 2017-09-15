package cn.acyou.iblog.service;

/**
 * 邮箱注册码服务层处理方法
 */
public interface ActiveCodeService {
	/**
	 * 保存验证码到数据库
	 * @param email	页面传入的email地址
	 */
	public String saveActiveCode(String email) throws EmailErrorException;
	/**按照邮箱查找注册码*/
	public String findActiveCodeByEmail(String email,String email_code) throws ActiveCodeNotFoundException;
	
}
