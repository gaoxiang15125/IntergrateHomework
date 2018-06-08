package com.example.integration.webservices;

import com.example.integration.po.catpo.GetAllMoviesRequest;
import com.example.integration.po.catpo.GetAllMoviesResponse;
import com.example.integration.po.catpo.GetAllTheatresRequest;
import com.example.integration.po.catpo.GetAllTheatresResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;

public class CatMoviesWsClient extends WebServiceGatewaySupport {

    private String catMoviesWsdl = "http://localhost:8078/ws/catmovies.wsdl";

    public GetAllMoviesResponse getMovies(){
        GetAllMoviesRequest request = new GetAllMoviesRequest();
        return (GetAllMoviesResponse) getWebServiceTemplate().marshalSendAndReceive(catMoviesWsdl, request);
    }

    public GetAllTheatresResponse getTheatres(){
        GetAllTheatresRequest request = new GetAllTheatresRequest();
        return (GetAllTheatresResponse) getWebServiceTemplate().marshalSendAndReceive(catMoviesWsdl, request);
    }
}
