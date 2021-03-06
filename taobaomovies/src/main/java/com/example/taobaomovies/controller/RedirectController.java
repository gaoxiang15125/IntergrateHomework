package com.example.taobaomovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;


@Controller
@ApiIgnore
public class RedirectController {

    @RequestMapping("/api")
    public String redirect(){
        return "redirect:swagger-ui.html";
    }
}
