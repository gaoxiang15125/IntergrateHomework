package com.example.integration.interfaces;

import com.example.integration.po.catpo.CatEyePo;
import com.example.integration.po.catpo.CatTheatrePo;

import java.util.Vector;

public interface CatMovies {

    //获取全部的电影信息 考虑到电影名称重复问题，此处不适用hashmap
    Vector<CatEyePo> getAllMovie();

    //获取全部影院，以及影院中的场次信息
    Vector<CatTheatrePo> getAllTheatre();
}
