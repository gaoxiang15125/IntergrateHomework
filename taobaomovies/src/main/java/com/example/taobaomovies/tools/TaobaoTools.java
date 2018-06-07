package com.example.taobaomovies.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: IntegrateHomework
 * @description: 淘宝网站信息数据库初始化类
 * @author: gaoxiang
 * @create: 2018-06-03 23:54
 **/
public class TaobaoTools {

    //mysql驱动包名
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/taobao?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\n";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "18805156570";
    private static TaobaoTools catTools;

    public Connection connection = null;

    public static TaobaoTools getInstance(){
        if(catTools!=null){

        }
        else{
            catTools = new TaobaoTools();
        }
        return catTools;
    }

    private TaobaoTools(){
        init();
    }
    public void init(){
        try {
            //加载mysql的驱动类
            Class.forName(DRIVER_NAME);
            //获取数据库连接
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reGetConnection(){
        if (connection == null) {
            try {
                connection = connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void closeConnection(){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeStatement( PreparedStatement pstmt){
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("数据库预存器关闭失败");
            }
        }
    }

    public static void main(String[]args){
        new TaobaoTools();
    }
}
