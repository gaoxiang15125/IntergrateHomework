package catpo;

import javax.swing.*;

public class CatReviewPo {

    /**
     * 本类是电影短评的存储类
     * 属性意义：
     * 用户名称
     * 评论时间
     * 用户评分
     * 评论详细内容
     * 点赞数
     */
    private String user_Image;
    private String user_Name;
    private String review_Time;
    private double review_score;
    private String reviews;
    private int thumb_UP;

    public CatReviewPo() {

    }

    public CatReviewPo(String user_Image, String user_Name, String review_Time, double review_score, String reviews, int thumb_UP) {
        this.user_Image = user_Image;
        this.user_Name = user_Name;
        this.review_Time = review_Time;
        this.review_score = review_score;
        this.reviews = reviews;
        this.thumb_UP =thumb_UP;
    }

    public String getUser_Image() {
        return user_Image;
    }

    /**
     * 用户照片
     * @param user_Image
     */
    public void setUser_Image(String user_Image) {
        this.user_Image = user_Image;
    }

    /**
     *
     * @return 用户照片
     */
    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    /**
     *
     * @return 评论时间
     */
    public String getReview_Time() {
        return review_Time;
    }

    public void setReview_Time(String review_Time) {
        this.review_Time = review_Time;
    }

    /**
     *
     * @return 用户评分
     */
    public double getReview_score() {
        return review_score;
    }

    public void setReview_score(double review_score) {
        this.review_score = review_score;
    }

    /**
     *
     * @return 用户详细评论信息
     */
    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    /**
     *
     * @return 该条评论点赞数
     */
    public int getThumb_UP() {
        return thumb_UP;
    }

    public void setThumb_UP(int thumb_UP) {
        this.thumb_UP = thumb_UP;
    }


}
