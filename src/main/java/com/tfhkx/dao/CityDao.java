package com.tfhkx.dao;

import com.tfhkx.entity.City;

import java.util.List;

public interface CityDao {
    List<City> selectAllCity(int provinceid);
}
