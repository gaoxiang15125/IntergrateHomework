package com.example.catmovies.daoimpl;

import com.example.catmovies.catpo.CatReviewPo;
import com.example.catmovies.tools.CatTools;

import java.sql.*;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼电影评论信息操作类
 * @author: Mr.Wang
 * @create: 2018-06-03 23:30
 **/


public class CatreviewGetterImpl {

    public CatTools catTools;

    public CatreviewGetterImpl(){
        catTools =new CatTools();
    }

    public int insert(CatReviewPo catReviewPo, String film){
        catTools.reGetConnection();
        Connection conn = catTools.connection;
        int i = 0;
        String sql = "insert into review (image, name, time, score, reviews, thumb_up,film) values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, catReviewPo.getUser_Image());
            pstmt.setString(2, catReviewPo.getUser_Name());
            pstmt.setString(3, catReviewPo.getReview_Time());
            pstmt.setDouble(4, catReviewPo.getReview_score());
            pstmt.setString(5, catReviewPo.getReviews());
            pstmt.setInt(6, catReviewPo.getThumb_UP());
            pstmt.setString(7, film);

            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public Vector<CatReviewPo> getReviewByFilm(String film){
        catTools.reGetConnection();
        Connection conn = catTools.connection;
        String sql = "select * from review where film = ?";
        PreparedStatement pstmt;
        Vector<CatReviewPo> catReviewPos = new Vector<CatReviewPo>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,film);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                CatReviewPo catReviewPo =new CatReviewPo();
                catReviewPo.setReview_score(rs.getDouble("score"));
                catReviewPo.setReview_Time(rs.getString("time"));
                catReviewPo.setReviews(rs.getString("reviews"));
                catReviewPo.setUser_Image(rs.getString("image"));
                catReviewPo.setThumb_UP(rs.getInt("thumb_up"));
                catReviewPo.setUser_Name(rs.getString("name"));
                catReviewPos.add(catReviewPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catTools.closeConnection();
        return catReviewPos;
    }

}