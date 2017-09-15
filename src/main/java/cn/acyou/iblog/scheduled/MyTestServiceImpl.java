package cn.acyou.iblog.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("myTestService")
public class MyTestServiceImpl implements IMyTestService{
	
	public MyTestServiceImpl(){
		System.out.println("MyTestServiceImpl初始化---->>>>");
	}

    @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次  
	public void myTest() {
    	System.out.println("进入测试");
	}

}
