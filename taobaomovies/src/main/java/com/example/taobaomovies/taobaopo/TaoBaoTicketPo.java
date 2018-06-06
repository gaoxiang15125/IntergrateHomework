package com.example.taobaomovies.taobaopo;

/**
 * @program: IntegrateHomework
 * @description: 单个场次信息存储类 存储影院内的场次，价格信息等区别在于多个一个原价（其实就是一种销售策略）
 * @author: gaoxiang
 * @create: 2018-06-01 20:05
 **/
public class TaoBaoTicketPo {

    private String begin_Time;
    private String end_Time;
    private String movie_Langage;
    private String Video_Hall;
    private double now_Money;
    private double original_Money;

    public TaoBaoTicketPo(String begin_Time, String end_Time, String movie_Langage, String video_Hall, double now_Money, double original_Money) {
        this.begin_Time = begin_Time;
        this.end_Time = end_Time;
        this.movie_Langage = movie_Langage;
        Video_Hall = video_Hall;
        this.now_Money = now_Money;
        this.original_Money = original_Money;
    }

    /**
     *
     * @return 电影开始时间
     */
    public String getBegin_Time() {
        return begin_Time;
    }

    public void setBegin_Time(String begin_Time) {
        this.begin_Time = begin_Time;
    }

    /**
     *
     * @return 电影结束时间
     */
    public String getEnd_Time() {
        return end_Time;
    }

    public void setEnd_Time(String end_Time) {
        this.end_Time = end_Time;
    }

    /**
     *
     * @return 电影语言
     */
    public String getMovie_Langage() {
        return movie_Langage;
    }

    public void setMovie_Langage(String movie_Langage) {
        this.movie_Langage = movie_Langage;
    }

    /**
     *
     * @return 电影放映厅
     */
    public String getVideo_Hall() {
        return Video_Hall;
    }

    public void setVideo_Hall(String video_Hall) {
        Video_Hall = video_Hall;
    }

    /**
     *
     * @return 电影现价
     */
    public double getNow_Money() {
        return now_Money;
    }

    public void setNow_Money(double now_Money) {
        this.now_Money = now_Money;
    }

    /**
     *
     * @return 电影原价
     */
    public double getOriginal_Money() {
        return original_Money;
    }

    public void setOriginal_Money(double original_Money) {
        this.original_Money = original_Money;
    }
}
