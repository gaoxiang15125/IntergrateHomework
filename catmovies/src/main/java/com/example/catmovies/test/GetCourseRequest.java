package com.example.catmovies.test;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourseRequest", propOrder = {
        "courseName"
})
@XmlRootElement(name = "getCourseRequest", namespace = "http://example.com/webservices/service")
public class GetCourseRequest {

    @XmlElement(required = true, namespace = "http://example.com/webservices/service")
    protected String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String value) {
        this.courseName = value;
    }

}
