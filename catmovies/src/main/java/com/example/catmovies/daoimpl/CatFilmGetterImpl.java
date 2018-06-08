package com.example.catmovies.daoimpl;


import com.example.catmovies.catpo.CatEyePo;
import com.example.catmovies.tools.CatTools;

import java.sql.*;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼电影电影信息操作类
 * @author: Mr.Wang
 * @create: 2018-06-04 00:28
 **/
public class CatFilmGetterImpl {

    public CatTools catTools;
    //评论获取类实例化对象
    public CatreviewGetterImpl catreviewGetter;

    public CatFilmGetterImpl(){
        catTools =CatTools.getInstance();
        catreviewGetter = new CatreviewGetterImpl();
    }

    public int insert(CatEyePo catEyePo){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        int i = 0;
        String sql = "insert into catfilm(name, image, englishName, types, shoot_place, lastingTime, showTime, showPlace, score, userNum, bookingOffice, introduce) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, catEyePo.getMovie_Name());
            pstmt.setString(2, catEyePo.getMovie_Pic());
            pstmt.setString(3, catEyePo.getMovie_English_Name());
            pstmt.setString(4, catEyePo.getTypes());
            pstmt.setString(5, catEyePo.getShoot_Place());
            pstmt.setDouble(6, catEyePo.getLasting_Time());
            pstmt.setDate(7, new Date(catEyePo.getShow_Time().getTime()));
            pstmt.setString(8, catEyePo.getShoot_Place());
            pstmt.setDouble(9, catEyePo.getUser_Score());
            pstmt.setDouble(10, catEyePo.getUser_NUM());
            pstmt.setDouble(11, catEyePo.getBooking_Office());
            pstmt.setString(12, catEyePo.getIntroduction());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("该值已经存在");
        }
        return i;
    }

    public Vector<CatEyePo> getAllFilm(){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        String sql = "select * from catfilm ";
        PreparedStatement pstmt;
        Vector<CatEyePo> catReviewPos = new Vector<CatEyePo>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                CatEyePo catReviewPo =new CatEyePo();
                String name = rs.getString("name");
                catReviewPo.setMovie_Name(name);
                catReviewPo.setMovie_Pic(rs.getString("image"));
                catReviewPo.setMovie_English_Name(rs.getString("englishName"));
                catReviewPo.setTypes(rs.getString("types"));
                catReviewPo.setShoot_Place(rs.getString("shoot_place"));
                catReviewPo.setShow_Place(rs.getString("showPlace"));
                catReviewPo.setUser_Score(rs.getDouble("score"));
                catReviewPo.setLasting_Time(rs.getDouble("lastingTime"));
                catReviewPo.setUser_NUM(rs.getDouble("userNum"));
                catReviewPo.setBooking_Office(rs.getDouble("bookingOffice"));
                catReviewPo.setIntroduction(rs.getString("Introduce"));
                catReviewPo.setShow_Time(new java.util.Date(rs.getDate("showTime").getTime()));
                catReviewPo.setCatReviewPoVector(catreviewGetter.getReviewByFilm(name));
                catReviewPos.add(catReviewPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //catTools.closeConnection();
        return catReviewPos;
    }

    public static void main(String[] args) {
        System.out.println(new CatFilmGetterImpl().getAllFilm());
        // ??????????? null?
    }
}
