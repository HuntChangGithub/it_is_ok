package com.hunt.j1902.controller;

import com.hunt.j1902.pojo.Cinema;
import com.hunt.j1902.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by asus on 2019/5/25.
 */
@Controller
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @RequestMapping(value = "/films" , method = RequestMethod.GET)
    public ResponseEntity<List<Cinema>> findAll(){
        List<Cinema> list = cinemaService.findAll();
        ResponseEntity<List<Cinema>> entity=null;
        if (list != null){
            entity = new ResponseEntity<List<Cinema>>(list , HttpStatus.OK);
        }else{
            entity = new ResponseEntity<List<Cinema>>(HttpStatus.NOT_FOUND);
        }
        return entity;
    }

    @RequestMapping(value = "/filmSearch/{id}" , method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Cinema> delete(@PathVariable("id") int fid){
        Cinema cinema = cinemaService.getCinema(fid);
        ResponseEntity<Cinema> entity=null;
        if (cinema != null){
            boolean isdel = cinemaService.delCinema(fid);
            if (isdel){
                entity = new ResponseEntity<Cinema>(HttpStatus.OK);
            }
        }else {
            entity = new ResponseEntity<Cinema>(HttpStatus.NOT_FOUND);
        }
        return entity;
    }
    @RequestMapping(value = "/cinema" , method = RequestMethod.POST)
    public String add(@RequestBody Cinema cinema){
        boolean isadd = cinemaService.addCinema(cinema);
        ResponseEntity<Cinema> entity=null;
        if (isadd){
            entity = new ResponseEntity<Cinema>(HttpStatus.OK);
        }else {
            entity = new ResponseEntity<Cinema>(HttpStatus.CONFLICT);
        }
        return  null;
    }
}
