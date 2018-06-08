package com.example.integration.controller;

import com.example.integration.po.catpo.CatTheatrePo;
import com.example.integration.po.catpo.CatTicketPo;
import com.example.integration.po.taobaopo.TaoBaoPo;
import com.example.integration.po.taobaopo.TaoBaoTheatrePo;
import com.example.integration.po.taobaopo.TaoBaoTicketPo;
import com.example.integration.webservices.CatMoviesWsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/integration")
public class IntegrationController {

    @Autowired
    private CatMoviesWsClient catMoviesWsClient;

    private RestTemplate template = new RestTemplate();

    @GetMapping("/allMovies")
    public List<TaoBaoPo> getAllMovies(){
        return template.exchange("http://localhost:8079/taobao/allMovies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TaoBaoPo>>() {}).getBody();
    }

    @GetMapping("/allTheatres")
    public List<TaoBaoTheatrePo> getAllTheatres(){
        return template.exchange("http://localhost:8079/taobao/allTheatres",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TaoBaoTheatrePo>>() {}).getBody();
    }

    @GetMapping("/allTickets")
    public List<Ticket> getTickets(@RequestParam("theatre") String theatre, @RequestParam("movieName") String movieName) {

        List<TaoBaoTheatrePo> taoBaoTheatrePos = template.exchange("http://localhost:8079/taobao/allTheatres",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TaoBaoTheatrePo>>() {}).getBody();
        List<CatTheatrePo> catTheatrePos = catMoviesWsClient.getTheatres().getPos();

        List<Ticket> tickets = new LinkedList<>();
        TaoBaoTheatrePo taoBaoTheatrePo = null;
        CatTheatrePo catTheatrePo = null;
        for (TaoBaoTheatrePo baoTheatrePo : taoBaoTheatrePos) {
            if (baoTheatrePo.getTheatre_Name().equals(theatre)) {
                taoBaoTheatrePo = baoTheatrePo;
                break;
            }
        }

        for (CatTheatrePo theatrePo : catTheatrePos) {
            if (theatrePo.getTheatreName().equals(theatre)) {
                catTheatrePo = theatrePo;
                break;
            }
        }
        addTicketFromTaobao(tickets, taoBaoTheatrePo, movieName);
        addTicketFromCat(tickets, catTheatrePo, movieName);

        tickets.sort((o1, o2) -> o1.getNow_Money() > o2.getNow_Money() ? 1 : -1);
        return tickets;
    }

    private void addTicketFromCat(List<Ticket> tickets, CatTheatrePo catTheatrePo, String movieName) {
        if (catTheatrePo == null) return;
        for (CatTheatrePo.Tickets.Entry entry : catTheatrePo.getTickets().getEntry()) {
            if (entry.getKey().equals(movieName)) {
                for (CatTicketPo ticketPo : entry.getValue()) {
                    tickets.add(new Ticket(ticketPo));
                }
                break;
            }
        }
    }

    private void addTicketFromTaobao(List<Ticket> tickets, TaoBaoTheatrePo taoBaoTheatrePo, String movieName) {
        if (taoBaoTheatrePo == null) return;
        for (TaoBaoTicketPo ticketPo : taoBaoTheatrePo.getTickets().get(movieName)) {
            tickets.add(new Ticket(ticketPo));
        }
    }



    private class Ticket {

        private String whichSite;
        private String begin_Time;
        private String end_Time;
        private String movie_Langage;
        private String Video_Hall;
        private double now_Money;
        private double original_Money;

        public Ticket(CatTicketPo po) {
            this.whichSite = "猫眼";
            this.begin_Time = po.getBeginTime();
            this.end_Time = po.getEndTime();
            this.movie_Langage = po.getMovieLangage();
            this.now_Money = po.getMoney();
            this.original_Money = 0;
            this.Video_Hall = po.getVideoHall();
        }

        public Ticket(TaoBaoTicketPo po) {
            this.whichSite = "淘票票";
            this.Video_Hall = po.getVideo_Hall();
            this.original_Money = po.getOriginal_Money();
            this.now_Money = po.getNow_Money();
            this.begin_Time = po.getBegin_Time();
            this.end_Time = po.getEnd_Time();
            this.movie_Langage = po.getMovie_Langage();
        }

        public String getWhichSite() {
            return whichSite;
        }

        public void setWhichSite(String whichSite) {
            this.whichSite = whichSite;
        }

        public String getBegin_Time() {
            return begin_Time;
        }

        public void setBegin_Time(String begin_Time) {
            this.begin_Time = begin_Time;
        }

        public String getEnd_Time() {
            return end_Time;
        }

        public void setEnd_Time(String end_Time) {
            this.end_Time = end_Time;
        }

        public String getMovie_Langage() {
            return movie_Langage;
        }

        public void setMovie_Langage(String movie_Langage) {
            this.movie_Langage = movie_Langage;
        }

        public String getVideo_Hall() {
            return Video_Hall;
        }

        public void setVideo_Hall(String video_Hall) {
            Video_Hall = video_Hall;
        }

        public double getNow_Money() {
            return now_Money;
        }

        public void setNow_Money(double now_Money) {
            this.now_Money = now_Money;
        }

        public double getOriginal_Money() {
            return original_Money;
        }

        public void setOriginal_Money(double original_Money) {
            this.original_Money = original_Money;
        }
    }
}
