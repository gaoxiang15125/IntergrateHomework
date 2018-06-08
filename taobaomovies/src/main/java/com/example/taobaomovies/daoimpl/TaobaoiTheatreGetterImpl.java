package com.example.taobaomovies.daoimpl;


import com.example.taobaomovies.taobaopo.TaoBaoTheatrePo;
import com.example.taobaomovies.tools.TaobaoTools;

import java.sql.*;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 影院信息获取类
 * @author: gaoxiang
 * @create: 2018-06-04 02:04
 **/
public class TaobaoiTheatreGetterImpl {

    public TaobaoTools taobaoTools;
    //评论获取类实例化对象
    public TaobaoTicketGetterImpl taobaoTicketGetter;

    public TaobaoiTheatreGetterImpl(){
        taobaoTools =TaobaoTools.getInstance();
        taobaoTicketGetter = new TaobaoTicketGetterImpl();
    }

    public int insert(TaoBaoTheatrePo taoBaoTheatrePo){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        int i = 0;
        String sql = "insert into taobao.theatre(image, name, address, phone, score) values (?,?,?,?,?)" ;
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,taoBaoTheatrePo.getTheare_Image());
            pstmt.setString(2,taoBaoTheatrePo.getTheatre_Name());
            pstmt.setString(3,taoBaoTheatrePo.getTheatre_Address());
            pstmt.setString(4,taoBaoTheatrePo.getTheatre_Phone());
            pstmt.setDouble(5,taoBaoTheatrePo.getUser_score());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public Vector<TaoBaoTheatrePo> getTheatreAll(){
        //taobaoTools.reGetConnection();
        Connection conn = taobaoTools.connection;
        String sql = "select * from taobao.theatre";
        PreparedStatement pstmt;
        Vector<TaoBaoTheatrePo> catReviewPos = new Vector<TaoBaoTheatrePo>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                TaoBaoTheatrePo taoBaoTheatrePo =new TaoBaoTheatrePo();
                String name = rs.getString("name");
                taoBaoTheatrePo.setTheatre_Name(name);
                taoBaoTheatrePo.setTheare_Image(rs.getString("image"));
                taoBaoTheatrePo.setTheatre_Address(rs.getString("address"));
                taoBaoTheatrePo.setTheatre_Phone(rs.getString("phone"));
                taoBaoTheatrePo.setUser_score(rs.getDouble("score"));
                System.out.println(name);
                taoBaoTheatrePo.setTickets(taobaoTicketGetter.getTicketByTheatre(name));
                catReviewPos.add(taoBaoTheatrePo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //taobaoTools.closeConnection();
        return catReviewPos;
    }
}
