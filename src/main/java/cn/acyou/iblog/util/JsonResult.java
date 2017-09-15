package cn.acyou.iblog.util;

import java.io.Serializable;

import cn.acyou.iblog.service.EmailErrorException;
import cn.acyou.iblog.service.PasswordException;
import cn.acyou.iblog.service.UserNotFoundException;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 1924314756177998342L;
	private static final int SUCCESS=0;
	private static final int ERROR=1;
	private int state;//状态标识
	private String message;//错误信息
	private Object data;//具体数据
	
	/**
	 * 为了增加灵活性：传入什么值记录为；String 为信息
	 * @param e
	 */
	/**
	 * 
	 * @param state 状态码
	 * @param message 输出信息
	 */
	public JsonResult(int state, String message){
		this.state = state;
		this.message = message;
	}
	
	
	//错误情况
	public JsonResult(Throwable e){
		state=ERROR;
		message=e.getMessage();
	}
	//正确情况
	public JsonResult(Object data){
		state=SUCCESS;
		this.data=data;
	}
	/**单独返回字符串*/
	public JsonResult(String message){
		state=SUCCESS;
		this.message=message;
	}
	
	/**处理登录时的用户名错误；返回状态码 2*/
	public JsonResult(int state, UserNotFoundException e) {
		this.state=state;
		this.message=e.getMessage();
	}
	/**处理登录时的密码错误；返回状态码  3*/
	public JsonResult(int state, PasswordException e) {
		this.state=state;
		this.message=e.getMessage();
	}
	/**处理注册时，邮件发送异常 ；返回状态码  4*/
	public JsonResult(int state, EmailErrorException e) {
		this.state=state;
		this.message=e.getMessage();
	}
	
	
	
	
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
	

}
