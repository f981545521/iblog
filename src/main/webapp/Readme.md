## 项目结构
- Spring SpringMVC MyBatis 

> 感觉项目整体需要重做了

#### iBlog版本日志

- 2017.07.30

1. 优化：菜单显示

- 2017.09.25

1. 增加：修改与删除操作
2. 优化：html重构
3. 增加：`webservice`获取所在地天气
4. 增加：使用log4j记录日志

- 2017.11.25

1. ...

---

#### VPS配置：

-	修改**Server.xml**
```
<!-- [设置默认访问页]说明：path是说明虚拟目录的名字，如果你要只输入ip就显示主页，则该键值留为空；-->
<Context debug="0" docBase="/tomcat/apache-tomcat-7.0.78/webapps/iblog" path="acyou.cn" reloadable="true"/>
```
-	注意修改**Server.xml** 增加：`URIEncoding="utf-8"`
```
<Connector URIEncoding="utf-8" port="80" protocol="HTTP/1.1" connectionTimeout="20000" redirectPort="8443" />
```
-	修改**WEB-INF/web.xml**
```
<welcome-file>web/cover.html</welcome-file>
```





