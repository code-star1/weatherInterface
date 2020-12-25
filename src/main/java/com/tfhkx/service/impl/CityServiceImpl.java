package com.tfhkx.service.impl;

import com.tfhkx.dao.CityDao;
import com.tfhkx.entity.City;
import com.tfhkx.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;

    @Override
    public List<City> selectAllCity(int provinceid) {
        return cityDao.selectAllCity(provinceid);
    }
}
