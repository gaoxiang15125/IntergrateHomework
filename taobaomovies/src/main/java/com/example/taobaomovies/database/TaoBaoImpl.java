package com.example.taobaomovies.database;

import com.example.taobaomovies.dao.TaoBaoMovieGitter;
import com.example.taobaomovies.daoimpl.TaobaoFilmGetterImpl;
import com.example.taobaomovies.daoimpl.TaobaoTicketGetterImpl;
import com.example.taobaomovies.daoimpl.TaobaoiTheatreGetterImpl;
import com.example.taobaomovies.taobaopo.TaoBaoPo;
import com.example.taobaomovies.taobaopo.TaoBaoTheatrePo;

import java.util.Vector;

/**
 * @program: IntergrateHomework
 * @description: 淘宝电影接口实现类
 * @author: gaoxiang
 * @create: 2018-06-06 21:45
 **/
public class TaoBaoImpl implements TaoBaoMovieGitter {

    //操作具体实现类
    public TaobaoFilmGetterImpl taobaoFilmGetter;
    public TaobaoiTheatreGetterImpl taobaoiTheatreGetter;
    public TaobaoTicketGetterImpl taobaoTicketGetter;

    public TaoBaoImpl(){
        init();
    }

    public void init(){
        taobaoFilmGetter = new TaobaoFilmGetterImpl();
        taobaoiTheatreGetter = new TaobaoiTheatreGetterImpl();
        taobaoTicketGetter = new TaobaoTicketGetterImpl();
    }
    @Override
    public Vector<TaoBaoPo> getAllMovie() {
        return taobaoFilmGetter.getAllFilm();
    }

    @Override
    public Vector<TaoBaoTheatrePo> getAllTheatre() {
        return taobaoiTheatreGetter.getTheatreAll();
    }
}
