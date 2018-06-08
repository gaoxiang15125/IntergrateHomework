package com.example.catmovies.webservices;

import com.example.catmovies.dao.CatMovieGetter;
import com.example.catmovies.generatedPos.com.catmovies.webservices.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Endpoint
public class CatMovieEndpoint {

    private static final String NAMESPACE_URL = "http://catmovies.com/webservices/service";

    @Autowired
    private CatMovieGetter getter;

    private ObjectFactory factory = new ObjectFactory();

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAllMoviesRequest")
    @ResponsePayload
    public GetAllMoviesResponse getMovies(@RequestPayload GetAllMoviesRequest request) {
        GetAllMoviesResponse response = factory.createGetAllMoviesResponse();
        Vector<com.example.catmovies.catpo.CatEyePo> pos = getter.getAllMovie();
        List<CatEyePo> result = new ArrayList<>();
        transform(result, pos);
        response.setPos(result);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAllTheatresRequest")
//    @PayloadRoots()
    @ResponsePayload
    public GetAllTheatresResponse getTheatres(@RequestPayload GetAllTheatresRequest request) {
        GetAllTheatresResponse response = new GetAllTheatresResponse();
        Vector<com.example.catmovies.catpo.CatTheatrePo> pos = getter.getAllTheatre();
        System.out.println("Begin to transform!");
        List<CatTheatrePo> result = new ArrayList<>();
        transformTheatre(result, pos);
        response.setPos(result);
        return response;
    }

    private void transformTheatre(List<CatTheatrePo> result, Vector<com.example.catmovies.catpo.CatTheatrePo> pos) {
        for (com.example.catmovies.catpo.CatTheatrePo po : pos) {
            CatTheatrePo newPo = new CatTheatrePo();
            newPo.setSeaverUsable(po.getSeaverUsable());
            newPo.setTheatre(po.getTheatre());
            newPo.setTheatreAddress(po.getTheatre_Address());
            newPo.setTheatrePhone(po.getTheatre_Phone());
            newPo.setTheatreName(po.getTheatre_Name());
            HashMap<String, Vector<com.example.catmovies.catpo.CatTicketPo>> map = po.getTickets();
            List<CatTheatrePo.Tickets.Entry> entries = new ArrayList<>(map.size());
            for (Map.Entry<String, Vector<com.example.catmovies.catpo.CatTicketPo>> entry : map.entrySet()) {
                CatTheatrePo.Tickets.Entry aEntry = new CatTheatrePo.Tickets.Entry();
                aEntry.setKey(entry.getKey());
                List<CatTicketPo> catTicketPos = new ArrayList<>(entry.getValue().size());
                transformCatTicket(catTicketPos, entry.getValue());
                aEntry.setValue(catTicketPos);
                entries.add(aEntry);
            }
            CatTheatrePo.Tickets tickets = new CatTheatrePo.Tickets();
            tickets.setEntry(entries);
            newPo.setTickets(tickets);
            result.add(newPo);
        }
    }

    private void transformCatTicket(List<CatTicketPo> catTicketPos, Vector<com.example.catmovies.catpo.CatTicketPo> value) {
        for (com.example.catmovies.catpo.CatTicketPo ticketPo : value) {
            CatTicketPo newPo = new CatTicketPo();
            newPo.setBeginTime(ticketPo.getBegin_Time());
            newPo.setEndTime(ticketPo.getEnd_Time());
            newPo.setMoney(ticketPo.getMoney());
            newPo.setMovieLangage(ticketPo.getMovie_Langage());
            newPo.setVideoHall(ticketPo.getMovie_Langage());
            newPo.setVideoHall(ticketPo.getVideo_Hall());
            catTicketPos.add(newPo);
        }
    }

    private void transform(List<CatEyePo> result, Vector<com.example.catmovies.catpo.CatEyePo> pos) {
        for (com.example.catmovies.catpo.CatEyePo po : pos) {
            CatEyePo newPo = new CatEyePo();
            newPo.setBookingOffice(po.getBooking_Office());
            newPo.setIntroduction(po.getIntroduction());
            newPo.setLastingTime(po.getLasting_Time());
            newPo.setMovieEnglishName(po.getMovie_English_Name());
            newPo.setMovieName(po.getMovie_Name());
            newPo.setMoviePic(po.getMovie_Pic());
            newPo.setShootPlace(po.getShoot_Place());
            newPo.setShowPlace(po.getShow_Place());
            newPo.setUserNUM(po.getUser_NUM());
            newPo.setUserScore(po.getUser_Score());
            newPo.setTypes(po.getTypes());

            Date date = po.getShow_Time();
            ZoneId zoneId = ZoneId.systemDefault();
            LocalDateTime dateTime = LocalDateTime.ofInstant(date.toInstant(), zoneId);
            newPo.setShowTime(dateTime.format(DateTimeFormatter.ISO_DATE));

            List<CatReviewPo> reviewPos = new ArrayList<>();
            for (com.example.catmovies.catpo.CatReviewPo reviewPo : po.getCatReviewPoVector()) {
                CatReviewPo catReviewPo = new CatReviewPo();
                catReviewPo.setReviews(reviewPo.getReviews());
                catReviewPo.setReviewScore(reviewPo.getReview_score());
                catReviewPo.setReviewTime(reviewPo.getReview_Time());
                catReviewPo.setThumbUP(reviewPo.getThumb_UP());
                catReviewPo.setUserImage(reviewPo.getUser_Image());
                catReviewPo.setUserName(reviewPo.getUser_Name());
                reviewPos.add(catReviewPo);
            }

            newPo.setCatReviewPoVector(reviewPos);
            result.add(newPo);
        }
    }
}
