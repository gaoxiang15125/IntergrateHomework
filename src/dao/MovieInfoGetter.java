package dao;

import po.CatEyePo;

import java.util.HashMap;
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
public interface MovieInfoGetter {

    //根据电影名称获取对应的电影信息
    public CatEyePo getMovieInfoByName(String movieName);

    //获取全部的电影信息，但是经过思考感觉服务器不需要获得map的电影信息，
    //所以删去
    //public HashMap<String,CatEyePo> getAllMovieInMap();

    //获取全部的电影信息
    public Vector<CatEyePo> getAllMovie();

    //根据电影类型获取电影信息
    public Vector<CatEyePo> getMovieByType(String type);

    //根据电影评分获取电影信息评分范围：1~10分
    public Vector<CatEyePo> getMovieByScore(double score);

    //根据电影票房获取电光影信息：票房有上亿的也有几千万的你看着半拉
    public Vector<CatEyePo> getMovieByBookingOffice(double bookingOffice);

}
