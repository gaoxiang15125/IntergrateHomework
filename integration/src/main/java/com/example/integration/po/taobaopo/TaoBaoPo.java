package com.example.integration.po.taobaopo;

import java.util.Date;

public class TaoBaoPo {
    /**
     * 淘宝电影信息存储类
     * 属性意义依次是：
     * 电影图片
     * 电影名
     * 英文电影名
     * 电影导演
     * 电影主演
     * 电影类型
     * 电影拍摄地址
     * 电影语言
     * 电影持续时间
     * 电影上映时间
     * 用户评分
     * 电影简介
     */
    private String movie_Pic;
    private String movie_Name;
    private String movie_English_Name;
    private String director;
    private String staring;
    private String types;
    private String shoot_Place;
    private String language;
    private double lasting_Time;
    private Date show_Time;
    private double user_Score;
    private String introduction;

    public TaoBaoPo() {
    }

    /**
     * 包含全部属性的构造方法
     * @param movie_Pic
     * @param movie_Name
     * @param movie_English_Name
     * @param director
     * @param staring
     * @param types
     * @param shoot_Place
     * @param langage
     * @param lasting_Time
     * @param show_Time
     * @param user_Score
     * @param introduction
     */



    public TaoBaoPo(String movie_Pic, String movie_Name, String movie_English_Name, String director, String staring, String types, String shoot_Place, String langage, double lasting_Time, Date show_Time, double user_Score, String introduction) {
        this.movie_Pic = movie_Pic;
        this.movie_Name = movie_Name;
        this.movie_English_Name = movie_English_Name;
        this.director = director;
        this.staring = staring;
        this.types = types;
        this.shoot_Place = shoot_Place;
        this.language = langage;
        this.lasting_Time = lasting_Time;
        this.show_Time = show_Time;
        this.user_Score = user_Score;
        this.introduction = introduction;
    }

    /**
     *
     * @return 获取电影图片
     */
    public String getMovie_Pic() {
        return movie_Pic;
    }

    public void setMovie_Pic(String movie_Pic) {
        this.movie_Pic = movie_Pic;
    }

    /**
     *
     * @return 获取电影名称
     */
    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    /**
     *
     * @return 获取电影原名/英文名
     */
    public String getMovie_English_Name() {
        return movie_English_Name;
    }

    public void setMovie_English_Name(String movie_English_Name) {
        this.movie_English_Name = movie_English_Name;
    }

    /**
     *
     * @return 电影导演
      */
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    /**
     *
     * @return 电影主演姓名
     */
    public String getStaring() {
        return staring;
    }

    public void setStaring(String staring) {
        this.staring = staring;
    }

    /**
     *
     * @return 电影类型
     */
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    /**
     *
     * @return 电影制片地址
     */
    public String getShoot_Place() {
        return shoot_Place;
    }

    public void setShoot_Place(String shoot_Place) {
        this.shoot_Place = shoot_Place;
    }

    /**
     *
     * @return 电影语言
     */
    public String getLangage() {
        return language;
    }

    public void setLangage(String langage) {
        this.language = langage;
    }

    /**
     *
     * @return 电影时长（单位：分钟）
     */
    public double getLasting_Time() {
        return lasting_Time;
    }

    public void setLasting_Time(double lasting_Time) {
        this.lasting_Time = lasting_Time;
    }

    /**
     *
     * @return 上映时间
     */
    public Date getShow_Time() {
        return show_Time;
    }

    public void setShow_Time(Date show_Time) {
        this.show_Time = show_Time;
    }

    /**
     *
     * @return 用户评分
     */
    public double getUser_Score() {
        return user_Score;
    }

    public void setUser_Score(double user_Score) {
        this.user_Score = user_Score;
    }

    /**
     *
     * @return 电影简介信息
     */
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
