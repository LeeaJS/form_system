package com.lol.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		//启动的同时，会自动创建Spring容器
		//因为我们不需要取创建Spring容器
		SpringApplication.run(CommunityApplication.class, args);


	}

}
