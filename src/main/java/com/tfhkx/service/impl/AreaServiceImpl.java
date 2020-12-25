package com.tfhkx.service.impl;

import com.tfhkx.dao.AreaDao;
import com.tfhkx.entity.Area;
import com.tfhkx.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;

    @Override
    public List<Area> selectAllArea(int provinceid, int cityid) {
        return areaDao.selectAllArea(provinceid, cityid);
    }
}
