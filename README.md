# xBlog

xBlog 后台接口项目

# 环境

* IntelliJ IDEA 2017.2
* Java 1.8
* Maven 3.3.9
* Spring Boot 2.0.0.RELEASE

# Blogs

|请求方式|URL|说明
|---|---|---
|GET|/api/v1/blogs|获取文章列表
|GET|/api/v1/blogs/{id}|获取指定文章
|POST|/api/v1/blogs|新增文章
|PUT|/api/v1/blogs/{id}|修改文章
|DELETE|/api/v1/blogs/{id}|删除文章