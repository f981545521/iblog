# iblog

-------

##  1. 演示地址

请移步：[acyou.cn](http://acyou.cn)

## 2. 导入与配置

###  eclipse

 1. 右键import -> Project from Git -> Clone URI
 2. URI：https://github.com/f981545521/iblog.git
 3. 以普通工程导入
 4. 最后，在工程右键Configure转换成maven工程
 5. 配置Tomcat
 
注意修改Server.xml 增加：**URIEncoding="utf-8"**

``` 
<Connector URIEncoding="utf-8" port="80" protocol="HTTP/1.1" connectionTimeout="20000" redirectPort="8443" />
```

## 3. 提交

一些工程中的配置：

> .settings	-- 不需要提交

> .project	-- 不需要提交

> .classpath	-- 不需要提交
