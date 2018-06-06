package com.example.catmovies.daoimpl;

import com.example.catmovies.catpo.CatTheatrePo;
import com.example.catmovies.tools.CatTools;

import java.sql.*;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 影院信息获取类
 * @author: Mr.Wang
 * @create: 2018-06-04 02:04
 **/
public class
CatTheatreGetterImpl {

    public CatTools catTools;
    //评论获取类实例化对象
    public CatTicketGetterImpl catTicketGetter;

    public CatTheatreGetterImpl(){
        catTools =CatTools.getInstance();
        catTicketGetter = new CatTicketGetterImpl();
    }

    public int insert(CatTheatrePo catTheatrePo){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        int i = 0;
        String sql = "insert into theatre(image, name, address, phone, seaverUsable) values (?,?,?,?,?)" ;
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,catTheatrePo.getTheatre());
            pstmt.setString(2,catTheatrePo.getTheatre_Name());
            pstmt.setString(3,catTheatrePo.getTheatre_Address());
            pstmt.setString(4,catTheatrePo.getTheatre_Phone());
            pstmt.setString(5,catTheatrePo.getSeaverUsable());
            i = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public Vector<CatTheatrePo> getTheatreAll(){
        //catTools.reGetConnection();
        Connection conn = catTools.connection;
        String sql = "select * from theatre ";
        PreparedStatement pstmt;
        Vector<CatTheatrePo> catReviewPos = new Vector<CatTheatrePo>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            //int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                CatTheatrePo catReviewPo =new CatTheatrePo();
                String name = rs.getString("name");
                catReviewPo.setTheatre_Name(name);
                catReviewPo.setTheatre(rs.getString("image"));
                catReviewPo.setTheatre_Address(rs.getString("address"));
                catReviewPo.setTheatre_Phone(rs.getString("phone"));
                catReviewPo.setSeaverUsable(rs.getString("seaverUsable"));
                catReviewPo.setTickets(catTicketGetter.getTicketByTheatre(name));
                catReviewPos.add(catReviewPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //catTools.closeConnection();
        return catReviewPos;
    }
}
