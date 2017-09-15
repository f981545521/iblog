package cn.acyou.iblog.service;

public class WeatherException extends RuntimeException {

	/**
	 * 天气转换异常
	 */
	private static final long serialVersionUID = 1L;

	public WeatherException() {
		// TODO Auto-generated constructor stub
	}

	public WeatherException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WeatherException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public WeatherException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WeatherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
