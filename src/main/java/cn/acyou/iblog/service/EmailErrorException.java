package cn.acyou.iblog.service;

public class EmailErrorException extends RuntimeException {

	private static final long serialVersionUID = 4157241376043730783L;

	public EmailErrorException() {
	}

	public EmailErrorException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmailErrorException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public EmailErrorException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmailErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
