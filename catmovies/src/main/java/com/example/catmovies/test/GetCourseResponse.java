package com.example.catmovies.test;

import com.example.catmovies.test.Course;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourseResponse", propOrder = {
        "course"
})
@XmlRootElement(name = "getCourseResponse")
public class GetCourseResponse {

    @XmlElement(required = true)
    protected Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course value) {
        this.course = value;
    }

}
