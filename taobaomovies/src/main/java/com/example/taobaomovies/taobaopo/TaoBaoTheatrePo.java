package com.example.taobaomovies.taobaopo;

import javax.swing.*;
import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼售票系统中的影院信息类，用于存储影院信息。
 * @author: gaoxiang
 * @create: 2018-06-01 19:45
 **/
public class TaoBaoTheatrePo {

    private String theare_Image;
    private String theatre_Name;
    private double user_score;
    private String theatre_Address;
    private String theatre_Phone;
    private HashMap<String,Vector<TaoBaoTicketPo>> tickets;

    public TaoBaoTheatrePo() {
    }

    /**
     * 未初始化场次信息的构造方法
     * @param theare_Image
     * @param theatre_Name
     * @param user_score
     * @param theatre_Address
     * @param theatre_Phone
     */
    public TaoBaoTheatrePo(String theare_Image, String theatre_Name, double user_score, String theatre_Address, String theatre_Phone) {
        this.theare_Image = theare_Image;
        this.theatre_Name = theatre_Name;
        this.user_score = user_score;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
    }

    public TaoBaoTheatrePo(String theatre_Name, double user_score, String theatre_Address, String theatre_Phone, HashMap<String, Vector<TaoBaoTicketPo>> tickets) {
        this.theatre_Name = theatre_Name;
        this.user_score = user_score;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.tickets = tickets;
    }

    /**
     *
     * @return 影院的图片
     */
    public String getTheare_Image() {
        return theare_Image;
    }

    public void setTheare_Image(String theare_Image) {
        this.theare_Image = theare_Image;
    }

    /**
     *
     * @return 影院的名称
     */
    public String getTheatre_Name() {
        return theatre_Name;
    }

    public void setTheatre_Name(String theatre_Name) {
        this.theatre_Name = theatre_Name;
    }

    /**
     *
     * @return 影院的用户评分
     */
    public double getUser_score() {
        return user_score;
    }

    public void setUser_score(double user_score) {
        this.user_score = user_score;
    }

    /**
     *
     * @return 影院的地址
     */
    public String getTheatre_Address() {
        return theatre_Address;
    }

    public void setTheatre_Address(String theatre_Address) {
        this.theatre_Address = theatre_Address;
    }

    /**
     *
     * @return 影院的地址
     */
    public String getTheatre_Phone() {
        return theatre_Phone;
    }

    public void setTheatre_Phone(String theatre_Phone) {
        this.theatre_Phone = theatre_Phone;
    }

    /**
     *
     * @return 该影院近期所有的场次信息
     */
    public HashMap<String, Vector<TaoBaoTicketPo>> getTickets() {
        return tickets;
    }

    public void setTickets(HashMap<String, Vector<TaoBaoTicketPo>> tickets) {
        this.tickets = tickets;
    }
}
