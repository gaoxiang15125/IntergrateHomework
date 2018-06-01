package catpo;

/**
 * @program: IntegrateHomework
 * @description: 单个场次信息存储类 存储影院内的场次，价格信息等
 * @author: Mr.Wang
 * @create: 2018-06-01 20:05
 **/
public class CatTicketPo {

    private String begin_Time;
    private String end_Time;
    private String movie_Langage;
    private String Video_Hall;
    private double money;

    public CatTicketPo(String begin_Time, String end_Time, String movie_Langage, String video_Hall, double money) {
        this.begin_Time = begin_Time;
        this.end_Time = end_Time;
        this.movie_Langage = movie_Langage;
        Video_Hall = video_Hall;
        this.money = money;
    }

    /**
     *
     * @return 本场次电影的开场时间
     */
    public String getBegin_Time() {
        return begin_Time;
    }

    public void setBegin_Time(String begin_Time) {
        this.begin_Time = begin_Time;
    }

    /**
     *
     * @return 本场次电影的结束时间
     */
    public String getEnd_Time() {
        return end_Time;
    }

    public void setEnd_Time(String end_Time) {
        this.end_Time = end_Time;
    }

    /**
     *
     * @return 本场次电影的语言
     */
    public String getMovie_Langage() {
        return movie_Langage;
    }

    public void setMovie_Langage(String movie_Langage) {
        this.movie_Langage = movie_Langage;
    }

    /**
     *
     * @return 本场次电影的赢得放映厅
     */
    public String getVideo_Hall() {
        return Video_Hall;
    }

    public void setVideo_Hall(String video_Hall) {
        Video_Hall = video_Hall;
    }

    /**
     *
     * @return 电影票的价格
     */
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
