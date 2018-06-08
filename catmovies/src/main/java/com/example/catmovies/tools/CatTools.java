package com.example.catmovies.tools;

import java.sql.*;

/**
 * @program: IntegrateHomework
 * @description: 数据库初始化类
 * @author: Mr.Wang
 * @create: 2018-06-03 23:54
 **/
public class CatTools {

    //mysql驱动包名
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://106.14.170.25:3306/film?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\n";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "mysql";
    private static CatTools catTools;

    public Connection connection = null;

    public static CatTools getInstance(){
        if(catTools!=null){

        }
        else{
            catTools = new CatTools();
        }
        return catTools;
    }

    private CatTools(){
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
}
