package org.example.repository;

import org.example.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepository implements CrudRepository<Course> {

    private List<Course> courses;

    public CourseRepository() {
        courses = new ArrayList<>();
        Course course = new Course(1, "Spring boot", "please work", 10);
        courses.add(course);
    }

    @Override
    public List<Course> findAll() {
        return courses;
    }
}
