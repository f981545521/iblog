package cn.acyou.iblog.test;

import java.io.UnsupportedEncodingException;

import cn.acyou.iblog.util.MailUtil;

public class MailUtilTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String code=MailUtil.send_mail("981545521@qq.com");
		System.out.println("发送成功！"+code);
	}

}
