package com.sunjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class SpringbootSessionApplication/* extends SpringBootServletInitializer*/ {

	//默认Springboot中内置的tomcat启动
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootSessionApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSessionApplication.class, args);
	}
}
