# SSM
其中包含的内容如下：

1.SpringMVC4.3.16,Mybatis3.2.2,Spring4.3.16三大框架的整合；

2.前端框架集成了Bootstrap3.3.5，Jquery1.12.3,集成了Bootstrap插件Bootgrid数据表格实现分页，使用Bootstrap的datetimepicker插件实现日期时间选择，后台的分页使用Mybatis的插件pagehelper实现；

3.数据库使用Mysql中自带的sakila数据库，使用前，请将SSM\src\main\resources\conf中的spring-mybatis.xml中的数据库密码设置为自己的；

4.实现了sakila中的单表的增删改查和跨表查询，跨表查询包括了Mybatis的1-N和N-1双向映射；

5.集成了作业自动调度框架Quartz 2.2.2实现作业调度；

6.json插件使用阿里的开源fastjson工具,注意低版本的fastjson与swagger不兼容，这里有坑；

7.包含了一个文件上传的功能；

8.包含了数据表导出为Excel下载的功能，包含了解析Excel内容的API，使用POI实现；

9.包含了带验证码的登录功能以及登录权限验证的拦截器；

10.要使用Struts2+hibernate+spring的整合，[点击这里进入](https://github.com/shenzhanwang/SSH_maven)  

11.去掉所有JSP，使用HTML代替，有利于前后端分离;

12.整合日志工具log4j2，较log4j1.x有较大性能提升，支持日志文件输出和控制台输出；

13. 整合接口文档swagger2.4，入口http://localhost:8080/SSM/swagger-ui.html

14. 将后台接口REST化，详情参考https://gitee.com/shenzhanwang/Spring-REST

访问入口：http://localhost:8080/SSM/login

