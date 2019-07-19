package com.service;

import com.crm.vo.CityVO;

import java.util.List;

public interface CityService {

    public List<CityVO> findProvince();

    public List<CityVO> findCity(String paramCriteria);
}
