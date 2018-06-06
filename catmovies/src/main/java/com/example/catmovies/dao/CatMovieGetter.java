package com.example.catmovies.dao;



import com.example.catmovies.catpo.CatEyePo;
import com.example.catmovies.catpo.CatTheatrePo;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 *
 * @description: 获取电影售票信息的接口类
 *
 * @author: gaoxiang
 *
 * @create: 2018-06-01 01:03
 **/
public interface CatMovieGetter {

    //获取全部的电影信息 考虑到电影名称重复问题，此处不适用hashmap
    public Vector<CatEyePo> getAllMovie();

    //获取全部影院，以及影院中的场次信息，因为网页中影院有区分，所一用了hashMap了，方便你检索
    public Vector<CatTheatrePo> getAllTheatre();

}
