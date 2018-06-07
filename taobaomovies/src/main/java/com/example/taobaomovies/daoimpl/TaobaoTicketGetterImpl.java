package com.example.taobaomovies.daoimpl;

import com.example.taobaomovies.taobaopo.TaoBaoTicketPo;
import com.example.taobaomovies.tools.TaobaoTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 获取电影场次信息类
 * @author: gaoxiang
 * @create: 2018-06-04 01:36
 **/
public class TaobaoTicketGetterImpl {

    public TaobaoTools taobaoTools;

    public TaobaoTicketGetterImpl(){
        taobaoTools =TaobaoTools.getInstance();
    }

    public int insert(TaoBaoTicketPo taoBaoTicketPo, String film, String theatre){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        int i = 0;
        String sql = "insert  into taobao.ticket(film, theatre, beginTime, endTime, languages, videoHall, nowMoney, origialMoney) values (?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1,film);
            pstmt.setString(2,theatre);
            pstmt.setString(3,taoBaoTicketPo.getBegin_Time());
            pstmt.setString(4,taoBaoTicketPo.getEnd_Time());
            pstmt.setString(5,taoBaoTicketPo.getMovie_Langage());
            pstmt.setString(6,taoBaoTicketPo.getVideo_Hall());
            pstmt.setDouble(7,taoBaoTicketPo.getNow_Money());
            pstmt.setDouble(8,taoBaoTicketPo.getOriginal_Money());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public HashMap<String,Vector<TaoBaoTicketPo>> getTicketByTheatre(String theatre){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        PreparedStatement pstmt = null;
        HashMap<String,Vector<TaoBaoTicketPo>> catTicketPos = new HashMap<String, Vector<TaoBaoTicketPo>>();
        String sql = "select * from  taobao.ticket where theatre = ?";
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
            Vector<TaoBaoTicketPo> catReviewPos = new Vector<TaoBaoTicketPo>();
            do {
                film = rs.getString("film");
                if(bufferFilm.equals(film)){

                }else{
                    catTicketPos.put(bufferFilm,catReviewPos);
                    //System.out.println(bufferFilm+"  "+catReviewPos.size());

                    bufferFilm=film;
                    catReviewPos = new Vector<TaoBaoTicketPo>();
                }
                TaoBaoTicketPo catTicketPo =new TaoBaoTicketPo();
                catTicketPo.setBegin_Time(rs.getString("beginTime"));
                catTicketPo.setEnd_Time(rs.getString("endTime"));
                catTicketPo.setMovie_Langage(rs.getString("languages"));
                catTicketPo.setVideo_Hall(rs.getString("videoHall"));
                catTicketPo.setNow_Money(rs.getDouble("nowMoney"));
                catTicketPo.setOriginal_Money(rs.getDouble("origialMoney"));
                catReviewPos.add(catTicketPo);
            }while (rs.next());
            catTicketPos.put(bufferFilm,catReviewPos);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            taobaoTools.closeStatement(pstmt);
        }
        //taobaoTools.closeConnection();
        return catTicketPos;
    }
}
