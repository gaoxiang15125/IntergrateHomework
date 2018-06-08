package com.example.taobaomovies.controller;

import com.example.taobaomovies.dao.TaoBaoMovieGitter;
import com.example.taobaomovies.taobaopo.TaoBaoPo;
import com.example.taobaomovies.taobaopo.TaoBaoTheatrePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/taobao")
public class TaobaoController {

    @Autowired
    private TaoBaoMovieGitter getter;

    @GetMapping("/allMovies")
    public List<TaoBaoPo> getAllMovies() {
        return new ArrayList<>(getter.getAllMovie());
    }

    @GetMapping("/allTheatres")
    public List<TaoBaoTheatrePo> getAllTheatres(){
        return new ArrayList<>(getter.getAllTheatre());
    }
}
