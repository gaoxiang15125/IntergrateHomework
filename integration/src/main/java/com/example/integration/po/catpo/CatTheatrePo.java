package com.example.integration.po.catpo;

import java.util.HashMap;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼售票系统中的影院信息类，用于存储影院信息。
 * @author: Mr.Wang
 * @create: 2018-06-01 19:45
 **/
public class CatTheatrePo {

    private String theatre;
    private String theatre_Name;
    private String theatre_Address;
    private String theatre_Phone;
    private String seaverUsable;
    private HashMap<String,Vector<CatTicketPo>> tickets;


    public CatTheatrePo() {
    }

    /**
     * 未初始化电影场次信息的构造方法
     * @param theatre
     * @param theatre_Name
     * @param theatre_Address
     * @param theatre_Phone
     * @param seaverUsable
     */
    public CatTheatrePo(String theatre, String theatre_Name, String theatre_Address, String theatre_Phone, String seaverUsable) {
        this.theatre = theatre;
        this.theatre_Name = theatre_Name;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.seaverUsable = seaverUsable;
    }

    public CatTheatrePo(String theatre, String theatre_Name, String theatre_Address, String theatre_Phone, String seaver, HashMap<String, Vector<CatTicketPo>> tickets) {
        this.theatre = theatre;

        this.theatre_Name = theatre_Name;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.seaverUsable = seaver;
        this.tickets = tickets;
    }

    /**
     *
     * @return 获取本电影院的所有场次信息 key是电影名称，值是该电影在该影院所有场次信息
     */
    public HashMap<String, Vector<CatTicketPo>> getTickets() {
        return tickets;
    }

    public void setTickets(HashMap<String, Vector<CatTicketPo>> tickets) {
        this.tickets = tickets;
    }

    public CatTheatrePo(String theatre_Name, String theatre_Address, String theatre_Phone, String seaver) {
        this.theatre_Name = theatre_Name;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.seaverUsable = seaver;
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
     * @return 影院的联系电话
     */
    public String getTheatre_Phone() {
        return theatre_Phone;
    }

    public void setTheatre_Phone(String theatre_Phone) {
        this.theatre_Phone = theatre_Phone;
    }

    /**
     *
     * @return 影院可以提供的服务（大概是是否提供眼镜，停车、儿童免票等等）
     */
    public String getSeaverUsable() {
        return seaverUsable;
    }

    public void setSeaverUsable(String seaverUsable) {
        this.seaverUsable = seaverUsable;
    }

    /**
     *
     * @return 获取影院图片
     */
    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }
}
