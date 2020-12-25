package com.tfhkx.service;

import com.tfhkx.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> selectAllArea(int provinceid, int cityid);
}
