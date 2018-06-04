package com.example.catmovies.webservices;

import com.example.catmovies.dao.CourseRepository;
import com.example.catmovies.test.GetCourseRequest;
import com.example.catmovies.test.GetCourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseEndPoint {

    private static final String NAMESPACE_URL = "http://example.com/webservices/service";

    @Autowired
    private CourseRepository repository;

    // configure output end point
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCourseRequest")
    @ResponsePayload
    public GetCourseResponse getCourse(@RequestPayload GetCourseRequest request) {
        GetCourseResponse response = new GetCourseResponse();
        response.setCourse(repository.findCourse(request.getCourseName()));
        return response;
    }
}
