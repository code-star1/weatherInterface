package com.tfhkx.service;

import com.tfhkx.entity.City;

import java.util.List;

public interface CityService {
    List<City> selectAllCity(int provinceid);
}
