package com.example.catmovies.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teacher", propOrder = {
        "age",
        "name"
})
public class Teacher {

    protected int age;
    protected String name;

    public int getAge() {
        return age;
    }


    public void setAge(int value) {
        this.age = value;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }

}
