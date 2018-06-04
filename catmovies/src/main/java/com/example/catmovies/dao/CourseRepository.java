package com.example.catmovies.dao;

import com.example.catmovies.test.Course;
import com.example.catmovies.test.Teacher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class CourseRepository {

    private static final HashMap<String, Course> map = new HashMap<>();

    @PostConstruct
    public void initData(){
        Teacher teacher1 = new Teacher();
        teacher1.setAge(11);
        teacher1.setName("Xihao");

        Teacher teacher2 = new Teacher();
        teacher2.setName("Yuanzhi");
        teacher2.setAge(18);

        Course course1 = new Course();
        course1.setCourseName("Computer Science");
        course1.setStudentNum(10);
        course1.setTeacher(teacher1);

        Course course2 = new Course();
        course2.setStudentNum(20);
        course2.setCourseName("数据结构与基础");
        course2.setTeacher(teacher2);

        map.put(course1.getCourseName(), course1);
        map.put(course2.getCourseName(), course2);
    }

    public Course findCourse(String courseName) {
        System.out.println(courseName);
        Course course = map.get(courseName);
        System.out.println(course);
        return map.get(courseName);
    }
}
