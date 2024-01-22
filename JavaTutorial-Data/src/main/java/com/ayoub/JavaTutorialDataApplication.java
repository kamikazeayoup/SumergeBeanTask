package com.ayoub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaTutorialDataApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(JavaTutorialDataApplication.class, args);
		for(String s: ac.getBeanDefinitionNames())
			System.out.println(s);

	}

}
