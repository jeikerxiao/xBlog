package com.jeiker.xblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan    //扫描 DruidStatViewServlet
@MapperScan("com.jeiker.xblog.dao")
public class XblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(XblogApplication.class, args);
	}
}
