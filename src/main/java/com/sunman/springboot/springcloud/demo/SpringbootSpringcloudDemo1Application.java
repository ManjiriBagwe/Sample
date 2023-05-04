package com.sunman.springboot.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootSpringcloudDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpringcloudDemo1Application.class, args);
	}

}
