package taobaopo.catpo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 * @program: IntegrateHomework
 * @description: 猫眼售票系统中的影院信息类，用于存储影院信息。
 * @author: Mr.Wang
 * @create: 2018-06-01 19:45
 **/
public class CatTheatrePo {

    private String theatre_Name;
    private String theatre_Address;
    private String theatre_Phone;
    private List<String> seaver = new ArrayList<String>();
    private HashMap<String,Vector<TicketPo>> tickets;

    public CatTheatrePo(String theatre_Name, String theatre_Address, String theatre_Phone, List<String> seaver, HashMap<String, Vector<TicketPo>> tickets) {
        this.theatre_Name = theatre_Name;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.seaver = seaver;
        this.tickets = tickets;
    }

    /**
     *
     * @return 获取本电影院的所有场次信息 key是电影名称，值是该电影在该影院所有场次信息
     */
    public HashMap<String, Vector<TicketPo>> getTickets() {
        return tickets;
    }

    public void setTickets(HashMap<String, Vector<TicketPo>> tickets) {
        this.tickets = tickets;
    }

    public CatTheatrePo(String theatre_Name, String theatre_Address, String theatre_Phone, List<String> seaver) {
        this.theatre_Name = theatre_Name;
        this.theatre_Address = theatre_Address;
        this.theatre_Phone = theatre_Phone;
        this.seaver = seaver;
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
    public List<String> getSeaver() {
        return seaver;
    }

    public void setSeaver(List<String> seaver) {
        this.seaver = seaver;
    }
}
