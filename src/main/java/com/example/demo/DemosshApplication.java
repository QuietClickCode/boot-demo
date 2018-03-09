package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages="com.example.demo")
@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages="com.example.demo.domain")
@EnableJpaRepositories(basePackages="com.example.demo.dao")
@EnableCaching
@EnableAutoConfiguration
@ServletComponentScan
public class DemosshApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemosshApplication.class, args);
	}
}
