package com.tfhkx.service.impl;

import com.tfhkx.dao.ProvinceDao;
import com.tfhkx.entity.Province;
import com.tfhkx.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private  ProvinceDao provinceDao;

    @Override
    public List<Province> findAllProvince() {
        return provinceDao.selectAllProvince();
    }
}
