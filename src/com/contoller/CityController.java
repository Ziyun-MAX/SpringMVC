package com.contoller;

import com.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(path = "/province")
    @ResponseBody
    public  List<CityVO> findProvince(){
        System.out.println("--------------------------------------------------#########################");
        List<CityVO> province = cityService.findProvince();
        System.out.println("-------------------------------------------------"+province);
        return province;
    }

    @ResponseBody
    public List<CityVO> findCity(String paramCriteria){
        List<CityVO> city = cityService.findCity(paramCriteria);
        return city;
    }
}
