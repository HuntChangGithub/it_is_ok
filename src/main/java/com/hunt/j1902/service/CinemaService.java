package com.hunt.j1902.service;

import com.hunt.j1902.pojo.Cinema;

import java.util.List;

/**
 * Created by asus on 2019/5/25.
 */
public interface CinemaService {
    public List<Cinema> findAll();
    public boolean addCinema(Cinema cinema);
    public Cinema getCinema(int id);
    public boolean delCinema(int id);
}
