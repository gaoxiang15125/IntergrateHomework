package com.example.catmovies.dataBase;



import com.example.catmovies.catpo.CatEyePo;
import com.example.catmovies.catpo.CatTheatrePo;
import com.example.catmovies.dao.CatMovieGetter;
import com.example.catmovies.daoimpl.CatFilmGetterImpl;
import com.example.catmovies.daoimpl.CatTheatreGetterImpl;

import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 实现向逻辑层传递数据接口（CatMovieGetter)的类
 * @author: gaoxiang
 * @create: 2018-06-04 16:06
 **/
public class CatGetter implements CatMovieGetter {

    private CatFilmGetterImpl catFilmGetter ;
    private CatTheatreGetterImpl catTheatreGetter;

    public CatGetter() {
        init();
    }

    private void init(){
        catFilmGetter = new CatFilmGetterImpl();
        catTheatreGetter =new CatTheatreGetterImpl();
    }

    public Vector<CatEyePo> getAllMovie(){
        return catFilmGetter.getAllFilm();
    }

    public Vector<CatTheatrePo> getAllTheatre(){
        return catTheatreGetter.getTheatreAll();
    }
}
