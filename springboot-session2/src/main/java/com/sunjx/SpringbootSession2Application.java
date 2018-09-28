package com.sunjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1200,redisNamespace="session")
public class SpringbootSession2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSession2Application.class, args);
	}
}
