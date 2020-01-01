package com.hunt.j1902.controller;

import com.hunt.j1902.pojo.MovieLeix;
import com.hunt.j1902.service.MovieLeixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by asus on 2019/5/25.
 */
@Controller
public class MovieLxController {
    @Autowired
    private MovieLeixService movieLeixService;
    @RequestMapping(value = "/cinemas" , method = RequestMethod.GET)
    public String query(Model model){
        List<MovieLeix> list = movieLeixService.getMovieLxs();
        System.out.println(list);
        model.addAttribute("list",list);
        return "cinema";
    }
}
