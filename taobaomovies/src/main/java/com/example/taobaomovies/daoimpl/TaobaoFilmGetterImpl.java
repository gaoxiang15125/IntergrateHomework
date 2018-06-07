package com.example.taobaomovies.daoimpl;

import com.example.taobaomovies.taobaopo.TaoBaoPo;
import com.example.taobaomovies.tools.TaobaoTools;

import java.sql.*;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼电影电影信息操作类
 * @author: gaoxiang
 * @create: 2018-06-04 00:28
 **/
public class TaobaoFilmGetterImpl {

    public TaobaoTools taobaoTools;
    //淘宝网不存在用户评论信息
    //public daoimpl.CatreviewGetterImpl catreviewGetter;

    public TaobaoFilmGetterImpl(){
        taobaoTools =TaobaoTools.getInstance();
        //catreviewGetter = new daoimpl.CatreviewGetterImpl();
    }

    public int insert(TaoBaoPo taoBaoPo){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        int i = 0;
        String sql = "insert into taobaofilm (name, image, englishName, types, shoot_place, lastingTime, showTime, score, introduce, director, staring,languages) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, taoBaoPo.getMovie_Name());
            pstmt.setString(2, taoBaoPo.getMovie_Pic());
            pstmt.setString(3, taoBaoPo.getMovie_English_Name());
            pstmt.setString(4, taoBaoPo.getTypes());
            pstmt.setString(5, taoBaoPo.getShoot_Place());
            pstmt.setDouble(6, taoBaoPo.getLasting_Time());
            pstmt.setDate(7, new Date(taoBaoPo.getShow_Time().getTime()));
            pstmt.setDouble(8, taoBaoPo.getUser_Score());
            pstmt.setString(9, taoBaoPo.getIntroduction());
            pstmt.setString(10,taoBaoPo.getDirector());
            pstmt.setString(11,taoBaoPo.getStaring());
            pstmt.setString(12, taoBaoPo.getLangage());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("该电影信息已经爬去，不需要重新爬取");
        }finally {
            taobaoTools.closeStatement(pstmt);

        }
        return i;
    }

    public Vector<TaoBaoPo> getAllFilm(){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        String sql = "select * from taobaofilm ";
        PreparedStatement pstmt = null;
        Vector<TaoBaoPo> taoBaoPos = new Vector<>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                TaoBaoPo taobaopo =new TaoBaoPo();
                //因为没有评论信息，所以不需要根据名称获取对应的评论信息
                //String name = rs.getString("name");
                taobaopo.setMovie_Name(rs.getString("name"));
                taobaopo.setMovie_Pic(rs.getString("image"));
                taobaopo.setMovie_English_Name(rs.getString("englishName"));
                taobaopo.setTypes(rs.getString("types"));
                taobaopo.setShoot_Place(rs.getString("shoot_place"));
                taobaopo.setLasting_Time(rs.getDouble("lastingTime"));
                taobaopo.setShow_Time(new java.util.Date(rs.getDate("showTime").getTime()));
                taobaopo.setUser_Score(rs.getDouble("score"));
                taobaopo.setIntroduction(rs.getString("Introduce"));
                taobaopo.setDirector(rs.getString("director"));
                taobaopo.setStaring(rs.getString("staring"));
                taobaopo.setLangage(rs.getString("language"));

                //taobaopo.setCatReviewPoVector(catreviewGetter.getReviewByFilm(name));
                taoBaoPos.add(taobaopo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            taobaoTools.closeStatement(pstmt);
        }
        //taobaoTools.closeConnection();
        return taoBaoPos;
    }


}
