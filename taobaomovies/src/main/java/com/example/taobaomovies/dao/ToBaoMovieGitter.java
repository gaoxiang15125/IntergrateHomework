package com.example.taobaomovies.dao;

import com.example.taobaomovies.taobaopo.TaoBaoTheatrePo;
import taobaopo.TaoBaoPo;
import taobaopo.TaoBaoTheatrePo;

import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 *
 * @description: 获取淘宝电影售票信息的接口类
 *
 * @author: gaoxiang
 *
 * @create: 2018-06-01 01:03
 **/
public interface ToBaoMovieGitter {


    //获取全部的电影信息 考虑到电影名称重复问题，此处不适用hashmap
    Vector<TaoBaoPo> getAllMovie();

    //获取全部影院，以及影院中的场次信息，因为网页中影院有区分，所一用了hashMap了，方便你检索
    Vector<TaoBaoTheatrePo> getAllTheatre();

}
