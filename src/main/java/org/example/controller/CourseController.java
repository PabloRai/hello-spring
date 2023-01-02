package org.example.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.example.model.Course;
import org.example.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;

import java.util.List;


@RestController
public class CourseController {

    private final Logger logger = LogManager.getLogger();
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses/{id}")
    public List<Course> getCourses(@PathVariable int id) {
        logger.log(Level.INFO, id);
        return courseService.list();
    }
}
