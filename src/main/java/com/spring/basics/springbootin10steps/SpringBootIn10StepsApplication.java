package com.spring.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(SpringBootIn10StepsApplication.class, args);
		for(String str: ctx.getBeanDefinitionNames()) {
			System.out.println(str);
		}
	}
}
