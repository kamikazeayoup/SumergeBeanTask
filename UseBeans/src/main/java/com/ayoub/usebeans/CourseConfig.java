package com.ayoub.usebeans;

import com.ayoub.myproject.course.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {
    @Bean(name = "CreateCustomCourseAhmedOverride")
    Course CreateCustomCourseAhmed(){
        Course cour = new Course();
        cour.setId("4");
        cour.setName("Samir");
        cour.setDescription("Welcome");
        return cour;
    }
}
