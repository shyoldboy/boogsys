package com.zyt.heima.blogsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zyt.heima.*")
@MapperScan("com.zyt.heima.mapper.*")
public class BlogsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogsysApplication.class, args);
	}

}
