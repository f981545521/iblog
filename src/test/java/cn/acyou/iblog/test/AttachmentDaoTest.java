package cn.acyou.iblog.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.dao.AttachmentDao;
import cn.acyou.iblog.entity.Attachment;

public class AttachmentDaoTest extends BaseTest {
	private AttachmentDao dao;
	@Before
	public void initthis(){
		dao=ctx.getBean("attachmentDao",AttachmentDao.class);
	}
	@Test
	public void test1(){
		List<Map<String,Object>>list=dao.findAttachementsByUid("1", 0,2);
		for(Map<String,Object> map:list){
			System.out.println(map);
		}
	}
	
	@Test
	public void test2(){
		Attachment att=new Attachment();
		att.setUid(1);
		att.setFileName("asdfg.avi");
		int a=dao.saveAttachment(att);
		System.out.println(a);
	}
	
	@Test
	public void test3(){
		int n=dao.countAttachmentByUid(45);
		System.out.println(n);
	}

}
