package cn.acyou.iblog.othertest;

import org.junit.Test;

import cn.acyou.iblog.baseenum.BaseData;
import cn.acyou.iblog.entity.Comment;

public class TmpTest {

	@Test
	public void test1(){
		Comment c=new Comment();
		c.setBid(1);
		c.setCommentary("666");
		c.setHide(BaseData.n);
		System.out.println(c);
	}

}
