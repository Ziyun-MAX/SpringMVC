package com.service.impl;

import com.crm.dao.CityDao;
import com.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<CityVO> findCity(String paramCriteria) {
        List<CityVO> city = cityDao.findCity(paramCriteria);
        return city;
    }

    @Override
    public List<CityVO> findProvince() {
        List<CityVO> province = cityDao.findProvince();
        return province;
    }
}
