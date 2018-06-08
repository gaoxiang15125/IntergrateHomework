package com.example.catmovies.dao;

import com.example.catmovies.catpo.CatEyePo;
import com.example.catmovies.catpo.CatTheatrePo;
import com.example.catmovies.catpo.CatTicketPo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

//@Repository
public class CatMovieGetterMock implements CatMovieGetter {

    @Override
    public Vector<CatEyePo> getAllMovie() {
        CatEyePo po1 = new CatEyePo();
        po1.setBooking_Office(11.1);
        po1.setIntroduction("simple test");
        po1.setShow_Time(new Date());
        po1.setCatReviewPoVector(new Vector<>());
        Vector<CatEyePo> result = new Vector<>();
        result.add(po1);
        return result;
    }

    @Override
    public Vector<CatTheatrePo> getAllTheatre() {
        CatTheatrePo po = new CatTheatrePo();
        po.setTheatre("Simple test theatre!");
        HashMap<String, Vector<CatTicketPo>> map = new HashMap<>();
        CatTicketPo catTicketPo = new CatTicketPo();
        catTicketPo.setBegin_Time("2018-05-06");
        catTicketPo.setEnd_Time("2018-06-06");
        catTicketPo.setMoney(100);
        catTicketPo.setMovie_Langage("Chinese");
        catTicketPo.setVideo_Hall("南京仙林影城");
        Vector<CatTicketPo> ticketPos = new Vector<>();
        ticketPos.add(catTicketPo);
        map.put("妖猫传", ticketPos);
        po.setTickets(map);
        Vector<CatTheatrePo> catTheatrePos = new Vector<>();
        catTheatrePos.add(po);
        return catTheatrePos;
    }
}
