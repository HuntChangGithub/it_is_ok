package com.hunt.j1902.service.impl;

import com.hunt.j1902.mapper.MovieLeiMapper;
import com.hunt.j1902.pojo.MovieLeix;
import com.hunt.j1902.service.MovieLeixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2019/5/25.
 */
@Component
public class MovieLeixServiceImpl implements MovieLeixService {
    @Autowired
    private MovieLeiMapper movieLeiMapper;
    @Override
    public List<MovieLeix> getMovieLxs() {
        List<MovieLeix> list=movieLeiMapper.getMovieLxs();
        return list;
    }
}
