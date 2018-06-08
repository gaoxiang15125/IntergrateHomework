package com.example.taobaomovies.database;

import com.example.taobaomovies.taobaopo.TaoBaoTheatrePo;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class TaoBaoImplTest {

    public TaoBaoImpl taobao;
    @Before
    public void init() {
        taobao = new TaoBaoImpl();
    }

    @Test
    public void getAllMovie() {
        assertEquals(2,taobao.getAllMovie().size());
    }

    @Test
    public void getAllTheatre() {
        /**
        Vector<TaoBaoTheatrePo> taoBaoTheatrePos = taobao.getAllTheatre();
        assertEquals(2,taoBaoTheatrePos.size());
        assertEquals(2,taoBaoTheatrePos.get(1).getTheatre_Name());
        assertEquals(2,taoBaoTheatrePos.get(1).getTickets().size());
        assertEquals(2,taoBaoTheatrePos.get(1).getTheatre_Name());
        **/
        System.out.println(taobao.taobaoTicketGetter.getTicketByTheatre("CGV影城(百家湖店)"));
    }
}