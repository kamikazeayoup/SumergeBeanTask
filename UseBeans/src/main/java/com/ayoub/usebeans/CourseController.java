package com.ayoub.usebeans;

import com.ayoub.myproject.course.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CourseController {
    @Autowired
    @Qualifier("CreateCustomCourseAhmedOverride")
    Course CreateCustomCourseAhmed;

@RequestMapping(value = "/courses")
public String getCourse(){
    return CreateCustomCourseAhmed.getName();
    }

}
