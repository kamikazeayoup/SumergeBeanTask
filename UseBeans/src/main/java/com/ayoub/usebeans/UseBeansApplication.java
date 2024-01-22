package com.ayoub.usebeans;

import com.ayoub.myproject.course.CourseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.ayoub.myproject.topic.Topic;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CourseConfiguration.class)
public class UseBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(UseBeansApplication.class, args);
		for(String s : ap.getBeanDefinitionNames())
		System.out.println(s);
	}

}
