package com.hunt.j1902.service.impl;

import com.hunt.j1902.mapper.CinemaMapper;
import com.hunt.j1902.pojo.Cinema;
import com.hunt.j1902.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2019/5/25.
 */
@Component
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaMapper cinemaMapper;
    @Override
    public List<Cinema> findAll() {
        List<Cinema> list=cinemaMapper.findAll();
        return list;
    }

    @Override
    public boolean addCinema(Cinema cinema) {
        boolean isadd=cinemaMapper.addCinema(cinema);
        return isadd;
    }

    @Override
    public Cinema getCinema(int id) {
        Cinema cinema = cinemaMapper.getCinema(id);
        return cinema;
    }

    @Override
    public boolean delCinema(int id) {
        boolean isdel = cinemaMapper.delCinema(id);
        return isdel;
    }
}
