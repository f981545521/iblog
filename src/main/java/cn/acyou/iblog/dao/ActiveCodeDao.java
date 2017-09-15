package cn.acyou.iblog.dao;

import java.util.List;

/**
 * 用于注册时邮件激活 
 */
public interface ActiveCodeDao {
	/**
	 * 将发送给邮箱的信息保存到数据库中
	 * @param email 只需要传入邮箱地址即可
	 * @return 
	 */
	public int addActiveCode(String email,String activecode);
	/**按照邮箱查找激活码*/
	public List<String> findActiveCodeByEmail(String email);
}
