package com.tfhkx.dao;

import com.tfhkx.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> selectAllArea(int provinceid,int cityid);
}
