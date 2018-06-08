package com.example.integration.controller;

import com.example.integration.po.taobaopo.TaoBaoPo;
import com.example.integration.po.taobaopo.TaoBaoTheatrePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/taobao")
public class TaobaoMoviesController {

    private RestTemplate template = new RestTemplate();

    @GetMapping("/allMovies")
    public List<TaoBaoPo> getAllMovies(){
        //"http://localhost:8079/taobao/allMovies"
        return template.exchange("http://localhost:8079/taobao/allMovies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TaoBaoPo>>() {}).getBody();
    }

    @GetMapping("/allTheatres")
    public List<TaoBaoTheatrePo> getAllTheatres(){
        return template.exchange("http://localhost:8079/taobao/allTheatres",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TaoBaoTheatrePo>>() {}).getBody();
    }
}
