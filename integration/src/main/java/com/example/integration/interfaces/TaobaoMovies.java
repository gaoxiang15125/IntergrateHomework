package com.example.integration.interfaces;

import com.example.integration.po.taobaopo.TaoBaoPo;
import com.example.integration.po.taobaopo.TaoBaoTheatrePo;

import java.util.Vector;

public interface TaobaoMovies {

    //获取全部的电影信息 考虑到电影名称重复问题，此处不适用hashmap
    Vector<TaoBaoPo> getAllMovie();

    //获取全部影院，以及影院中的场次信息，因为网页中影院有区分，所一用了hashMap了，方便你检索
    Vector<TaoBaoTheatrePo> getAllTheatre();
}
