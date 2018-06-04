package com.example.catmovies.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "course", propOrder = {
        "courseName",
        "studentNum",
        "teacher"
})
public class Course {

    protected String courseName;
    protected int studentNum;
    protected Teacher teacher;

    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String value) {
        this.courseName = value;
    }


    public int getStudentNum() {
        return studentNum;
    }


    public void setStudentNum(int value) {
        this.studentNum = value;
    }


    public Teacher getTeacher() {
        return teacher;
    }


    public void setTeacher(Teacher value) {
        this.teacher = value;
    }

    @Override
    public String
    toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                '}';
    }
}
