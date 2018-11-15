package com.example.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.usermanage.mapper")
public class GmallUsermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUsermanageApplication.class, args);
	}
}
