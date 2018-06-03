package catpo;

import javax.swing.*;
import java.util.Date;
import java.util.Vector;

public class CatEyePo {
    /**
     * 猫眼电影信息存储类
     * 属性意义依次是：
     * 电影图片
     * 电影名
     * 英文电影名
     * 电影类型：推荐使用string的match方法进行检索区分
     * 电影拍摄地区（他写个中国大陆我也不知道是什么意思）
     * 电影时长
     * 电影上映时间
     * 电影上映地址
     * 电影用户评分
     * 评价用户数量
     * 电影票房
     * 电影简介
     * 观众评价（额，卖票的不会上差评，对吧）,观众评价用向量存储的（预防线程错误）
     */
    private String movie_Pic;
    private String movie_Name;
    private String movie_English_Name;
    private String types;
    private String shoot_Place;
    private double lasting_Time;
    private Date show_Time;
    private String show_Place;
    private double user_Score;
    private double user_NUM;
    private double booking_Office;
    private String introduction;
    private Vector<CatReviewPo> catReviewPoVector;

    public CatEyePo() {
    }

    /**
     *不实例化用户评论的构造方法
     */
    public CatEyePo(String movie_Pic, String movie_Name, String movie_English_Name, String types, String shoot_Place, double lasting_Time, Date show_Time, String show_Place, double user_Score, double user_NUM, double booking_Office, String introduction) {
        this.movie_Pic = movie_Pic;
        this.movie_Name = movie_Name;
        this.movie_English_Name = movie_English_Name;
        this.types = types;
        this.shoot_Place = shoot_Place;
        this.lasting_Time = lasting_Time;
        this.show_Time = show_Time;
        this.show_Place = show_Place;
        this.user_Score = user_Score;
        this.user_NUM = user_NUM;
        this.booking_Office = booking_Office;
        this.introduction = introduction;
    }

    /**
     *实例化用户评价信息的构造方法
     */
    public CatEyePo(String movie_Pic, String movie_Name, String movie_English_Name, String types, String shoot_Place, double lasting_Time, Date show_Time, String show_Place, double user_Score, double user_NUM, double booking_Office, String introduction, Vector<CatReviewPo> catReviewPoVector) {
        this.movie_Pic = movie_Pic;
        this.movie_Name = movie_Name;
        this.movie_English_Name = movie_English_Name;
        this.types = types;
        this.shoot_Place = shoot_Place;
        this.lasting_Time = lasting_Time;
        this.show_Time = show_Time;
        this.show_Place = show_Place;
        this.user_Score = user_Score;
        this.user_NUM = user_NUM;
        this.booking_Office = booking_Office;
        this.introduction = introduction;
        this.catReviewPoVector = catReviewPoVector;
    }

    /**
     *
     * @return 电影海报
     */
    public String getMovie_Pic() {
        return movie_Pic;
    }

    public void setMovie_Pic(String movie_Pic) {
        this.movie_Pic = movie_Pic;
    }

    /**
     *
     * @return 电影名称
     */
    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    /**
     *
     * @return 电影英文名
     */
    public String getMovie_English_Name() {
        return movie_English_Name;
    }

    public void setMovie_English_Name(String movie_English_Name) {
        this.movie_English_Name = movie_English_Name;
    }

    /**
     *
     * @return 电影类型，推荐用string的match方法进行匹配
     */
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    /**
     *
     * @return 电影拍摄地址
     */
    public String getShoot_Place() {
        return shoot_Place;
    }

    public void setShoot_Place(String shoot_Place) {
        this.shoot_Place = shoot_Place;
    }

    /**
     *
     * @return 电影持续时长
     */
    public double getLasting_Time() {
        return lasting_Time;
    }

    public void setLasting_Time(double lasting_Time) {
        this.lasting_Time = lasting_Time;
    }

    /**
     *
     * @return 电影上映时间
     */
    public Date getShow_Time() {
        return show_Time;
    }

    public void setShow_Time(Date show_Time) {
        this.show_Time = show_Time;
    }

    /**
     *
     * @return 电影上映地址
     */
    public String getShow_Place() {
        return show_Place;
    }

    public void setShow_Place(String show_Place) {
        this.show_Place = show_Place;
    }

    /**
     * 用户评分
     * @return
     */
    public double getUser_Score() {
        return user_Score;
    }

    public void setUser_Score(double user_Score) {
        this.user_Score = user_Score;
    }

    /**
     * 评价用户数量
     * @return
     */
    public double getUser_NUM() {
        return user_NUM;
    }

    public void setUser_NUM(double user_NUM) {
        this.user_NUM = user_NUM;
    }

    /**
     * 电影票房
     * @return
     */
    public double getBooking_Office() {
        return booking_Office;
    }

    public void setBooking_Office(double booking_Office) {
        this.booking_Office = booking_Office;
    }

    /**
     * 电影简介
     * @return
     */
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 观众对该用户的评价信息
     * @return
     */
    public Vector<CatReviewPo> getCatReviewPoVector() {
        return catReviewPoVector;
    }

    public void setCatReviewPoVector(Vector<CatReviewPo> catReviewPoVector) {
        this.catReviewPoVector = catReviewPoVector;
    }
}
