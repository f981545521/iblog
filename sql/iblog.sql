--初始化iblog	MySQL
--version:ib 2.0.0
--date:2017-06-12


DROP DATABASE IF EXISTS 'ib';
create DATABASE ib;
use ib;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 用户表
-- ----------------------------
--用户id--用户名--密码--昵称--状态是否可用--邮箱验证状态:审核中/审核通过/审核失败.--头像--邮箱--签名--创建时间
DROP TABLE IF EXISTS ib_user;
CREATE TABLE ib_user (
  uid int(10) unsigned NOT NULL AUTO_INCREMENT,			
  username varchar(20) NOT NULL DEFAULT '',		
  password varchar(32) NOT NULL DEFAULT '',		
  nickname varchar(20) DEFAULT '',		
  role varchar(10) DEFAULT '',				
  enable enum('n','y') DEFAULT 'y',	
  photo varchar(255) DEFAULT '',		
  email varchar(60) NOT NULL DEFAULT '',		
  description varchar(255) DEFAULT '', 
  createtime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (uid)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';
INSERT INTO ib_user VALUES(default,'admin','admin123','youfang','管理员','y','../content/uploadfile/phpto/1.jpg','youfang@acyou.cn','这个家伙很懒',default);
INSERT INTO ib_user VALUES(default,'caocao','caocao123','caocao','用户','y','../content/uploadfile/phpto/2.jpg','caocao@acyou.cn','这个家伙很懒',default);
INSERT INTO ib_user(uid,username,password,nickname,role,enable,photo,email,description,createtime)
VALUE(default,'demo','demo123','demo','用户','y','','demo@acyou.cn','',default);




-- ----------------------------
-- 文章分组(分类)
-- ----------------------------
-- 分组id--组名--描述--
DROP TABLE IF EXISTS ib_sort;
CREATE TABLE ib_sort (
  sid int(10) unsigned NOT NULL AUTO_INCREMENT,
  sortname varchar(255) NOT NULL DEFAULT '',
  uid int(10) unsigned NOT NULL DEFAULT '0',
  description varchar(100),
  createtime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (sid)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='文章分组(分类)';
INSERT INTO ib_sort VALUES(default,'唐宋文学',default,'宋代诗词收藏',default);

-- ----------------------------
-- 邮箱激活码：
-- ----------------------------
DROP TABLE IF EXISTS ib_activecode;
CREATE TABLE ib_activecode (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL DEFAULT '',
  activecode varchar(10) DEFAULT '',
  used enum('n','y') DEFAULT 'n',
  createtime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='邮箱激活码';
INSERT INTO ib_activecode VALUES(default,'youfang@acyou.cn','asdfg','y',default);





-- ----------------------------
-- 文章
-- ----------------------------
--文章id--标题--创建时间--最后一次修改时间--内容--摘要--类型:blog/随笔/说说--作者,对应ib_user_id--分类,对应ib_sort_id--附件,对应ib_attachment_id--置顶--是否隐藏
DROP TABLE ib_blog;
CREATE TABLE ib_blog (
  bid		 int(10) unsigned NOT NULL AUTO_INCREMENT,	
  title		 varchar(255)  NOT NULL DEFAULT '',			
  createtime  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  modifytime  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  content	 varchar(4000) DEFAULT '',		
  excerpt	 varchar(1000) DEFAULT '',	
  type 		 varchar(20) DEFAULT 'blog',	
  uid	 	 int(10) DEFAULT '0',
  sid		 int(10) DEFAULT '0',
  aid 		 int(10) DEFAULT '0',
  top		 char(1) DEFAULT 'n',
  hide 		 char(1) DEFAULT 'n',
  views		 int(10),
  comnum     int(10),
  allow_remark  enum('n','y') DEFAULT 'y',
  PRIMARY KEY (bid)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='文章';

INSERT INTO ib_blog VALUES('1','兰亭集序',default,default,'夫人之相与，俯仰一世，或取诸怀抱，悟言一室之内；或因寄所托，放浪形骸之外。虽趣舍万殊，静躁不同，当其欣于所遇，暂得于己，快然自足，曾不知老之将至。及其所之既倦，情随事迁，感慨系之矣。向之所欣，俯仰之间，已为陈迹，犹不能不以之兴怀。况修短随化，终期于尽。古人云：“死生亦大矣。”岂不痛哉！','王羲之的作品','blog','1','1','1','n','n');



-- ----------------------------
-- 评论
-- ----------------------------
create sequence seq_comment_id start with 1 increment by 1;
-- --评论ID--所属博客,对应ib_blog_id	--创建时间	--评论人	--评论内容	--QQ	--评论人IP --隐藏评论
DROP TABLE ib_comment;
CREATE TABLE ib_comment (
  id number(10) PRIMARY KEY,	
  bid number(10),		
  createtime date DEFAULT sysdate,
  poster varchar(20),
  commentary varchar(4000),
  qq number(10),
  ip varchar(400),
  hide char(1) DEFAULT 'n'
);

INSERT INTO ib_comment VALUES(seq_comment_id.nextval,'1',sysdate,'youfang','写的很好,很不错',10000,'117.136.45.149','n');

commit;




-- ----------------------------
-- 附件
-- ----------------------------
-- --附件id--所属博客id--文件名--文件大小--文件路径	--添加时间
create sequence seq_attachment_id start with 1 increment by 1;
DROP TABLE IF EXISTS ib_attachment;
CREATE TABLE ib_attachment (
  id number(10) PRIMARY KEY,			
  bid number(10) DEFAULT '1',		
  filename varchar(255),	
  filesize number(10),		
  filepath varchar(255),	
  addtime date DEFAULT sysdate
);

INSERT INTO ib_attachment VALUES(seq_attachment_id.nextval,'1','setup.rar','418313','../content/uploadfile/201702/b47e1486545896.rar',sysdate);

commit;



-- ----------------------------
-- TODO : 留言
-- ----------------------------
-- 






-- ----------------------------
-- TODO : 评论回复
-- ----------------------------
-- 
DROP TABLE ib_reply;
CREATE TABLE ib_reply (
  id number(10) PRIMARY KEY,
  tid number(10),
  createtime date DEFAULT sysdate,
  name varchar(20),
  content varchar(4000),
  ip varchar(128),
);











