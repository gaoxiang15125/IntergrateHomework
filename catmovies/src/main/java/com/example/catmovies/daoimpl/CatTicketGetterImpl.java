package com.example.catmovies.daoimpl;

import com.example.catmovies.catpo.CatTicketPo;
import com.example.catmovies.tools.CatTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 获取电影场次信息类
 * @author: Mr.Wang
 * @create: 2018-06-04 01:36
 **/
public class CatTicketGetterImpl {

    public CatTools catTools;

    public CatTicketGetterImpl(){
        catTools =CatTools.getInstance();
    }

    public int insert(CatTicketPo catReviewPo, String film, String theatre){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        int i = 0;
        String sql = "insert into ticket (film, theatre, beginTime, endTime, languages, videoHall, money) values (?,?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1,film);
            pstmt.setString(2,theatre);
            pstmt.setString(3,catReviewPo.getBegin_Time());
            pstmt.setString(4,catReviewPo.getEnd_Time());
            pstmt.setString(5,catReviewPo.getMovie_Langage());
            pstmt.setString(6,catReviewPo.getVideo_Hall());
            pstmt.setDouble(7,catReviewPo.getMoney());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public HashMap<String,Vector<CatTicketPo>> getTicketByTheatre(String theatre){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        String sql = "select * from ticket where theatre = ? order by film";
        PreparedStatement pstmt;
        HashMap<String,Vector<CatTicketPo>> catTicketPos = new HashMap<String, Vector<CatTicketPo>>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,theatre);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            if(rs.next()){

            }else{
                return null;
            }
            String bufferFilm = rs.getString("film");
            String film = bufferFilm;
            Vector<CatTicketPo> catReviewPos = new Vector<CatTicketPo>();
            do {
                film = rs.getString("film");
                if(bufferFilm.equals(film)){

                }else{
                    catTicketPos.put(bufferFilm,catReviewPos);
                    //System.out.println(bufferFilm+"  "+catReviewPos.size());

                    bufferFilm=film;
                    catReviewPos = new Vector<CatTicketPo>();
                }
                CatTicketPo catTicketPo =new CatTicketPo();
                catTicketPo.setBegin_Time(rs.getString("beginTime"));
                catTicketPo.setEnd_Time(rs.getString("endTime"));
                catTicketPo.setMovie_Langage(rs.getString("languages"));
                catTicketPo.setVideo_Hall(rs.getString("videoHall"));
                catTicketPo.setMoney(rs.getInt("money"));
                catReviewPos.add(catTicketPo);
            }while (rs.next());
            catTicketPos.put(bufferFilm,catReviewPos);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //catTools.closeConnection();
        return catTicketPos;
    }
}
