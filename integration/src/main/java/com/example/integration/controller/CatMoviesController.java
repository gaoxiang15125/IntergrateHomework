package com.example.integration.controller;

import com.example.integration.po.catpo.CatEyePo;
import com.example.integration.po.catpo.CatTheatrePo;
import com.example.integration.webservices.CatMoviesWsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catmovies")
public class CatMoviesController {

    @Autowired
    private CatMoviesWsClient catMoviesWsClient;

    @GetMapping("/allMovies")
    public List<CatEyePo> getAllMovies() {
        return catMoviesWsClient.getMovies().getPos();
    }

    @GetMapping("/allTheatres")
    public List<CatTheatrePo> getAllTheatres(){
        return catMoviesWsClient.getTheatres().getPos();
    }
}
