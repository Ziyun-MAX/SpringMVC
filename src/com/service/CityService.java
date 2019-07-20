package com.service;

import java.util.List;

public interface CityService {

    public List<CityVO> findProvince();

    public List<CityVO> findCity(String paramCriteria);
}
