package cn.acyou.iblog.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acyou.iblog.dao.ActiveCodeDao;
import cn.acyou.iblog.service.ActiveCodeNotFoundException;
import cn.acyou.iblog.service.ActiveCodeService;
import cn.acyou.iblog.service.EmailErrorException;
import cn.acyou.iblog.util.MailUtil;

@Service("activeCodeService")
public class ActiveCodeServiceImpl implements ActiveCodeService {
	
	@Resource//依赖注入持久层
	private ActiveCodeDao dao;
	/**保存激活码*/
	public String saveActiveCode(String email) throws EmailErrorException{
		if(email==null||email.trim().isEmpty()){
			throw new EmailErrorException("邮箱地址不能为空！");
		}
		try{
			String code=MailUtil.send_mail(email);
			dao.addActiveCode(email, code);
			return "邮件发送成功";
		}catch(Exception e){
			e.printStackTrace();
			throw new EmailErrorException("邮件发送失败！");
		}
		
	}
	/**根据邮箱查找激活码*/
	public String findActiveCodeByEmail(String email,String email_code) throws ActiveCodeNotFoundException {
		if(email==null||email.trim().isEmpty()){
			//throw new ActiveCodeNotFoundException("邮箱地址不能为空！");
			return "false";
		}
		List<String> activeCodes=dao.findActiveCodeByEmail(email);
		if(activeCodes==null){
			//throw new ActiveCodeNotFoundException("请先发送验证码！");
			return "false";
		}
		//为了忽略大小写
		for(String activeCode:activeCodes ){
			if(activeCode.toUpperCase().equals(email_code.toUpperCase())){
				return "true";
			}
		}
		return "false";
		/*if(activeCodes.contains(email_code)){
			return "true";
		}else{
			//throw new ActiveCodeNotFoundException("验证码不匹配");
			return "false";
		}*/
	}
	

}
