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
        assertEquals(1,taobao.getAllMovie().size());
    }

    @Test
    public void getAllTheatre() {
        Vector<TaoBaoTheatrePo> taoBaoTheatrePos = taobao.getAllTheatre();
        assertEquals(2,taoBaoTheatrePos.size());
        assertEquals(10,taoBaoTheatrePos.get(0).getTickets().size());
        assertEquals(10,taoBaoTheatrePos.get(0).getTickets().get("0").size());
        assertEquals(null,taoBaoTheatrePos.get(1).getTheatre_Name());

    }
}