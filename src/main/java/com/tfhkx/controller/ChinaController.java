package com.tfhkx.controller;

import com.tfhkx.entity.Area;
import com.tfhkx.entity.City;
import com.tfhkx.entity.Province;
import com.tfhkx.service.AreaService;
import com.tfhkx.service.CityService;
import com.tfhkx.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ChinaController {

    @Resource
    private ProvinceService provinceService;
    @Resource
    private CityService cityService;
    @Resource
    private AreaService areaService;

    @RequestMapping("/china")
    @ResponseBody
    public List<Province> SelectAllProvince(){
        List<Province> provinceList=provinceService.findAllProvince();
        return provinceList;
    }

    @RequestMapping("/china/{provinceid}")
    @ResponseBody
    public List<City> SelectAllCity(@PathVariable("provinceid")Integer provinceid){
        List<City> cityList=cityService.selectAllCity(provinceid);
        return cityList;
    }

    @RequestMapping("/china/{provinceid}/{cityid}")
    @ResponseBody
    public List<Area> SelectAllArea(@PathVariable("provinceid")Integer province_id,@PathVariable("cityid")Integer city_id){
        List<Area> areaList=areaService.selectAllArea(province_id, city_id);
        return areaList;
    }
}
