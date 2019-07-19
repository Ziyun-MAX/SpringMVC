package com.crm.dao.impl;

import com.crm.dao.CityDao;
import com.crm.vo.CityVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cityDaoImpl")
public class CityDaoImpl extends SqlSessionDaoSupport implements CityDao {

    private static final String ANMESPACE = "com.mybatis.dao.";

    @Autowired
    public void init(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<CityVO> findProvince() {
        List<CityVO> findProvince = this.getSqlSessionTemplate().selectList("findProvince", null);
        return findProvince;
    }

    @Override
    public List<CityVO> findCity(String paramCriteria) {
        List<CityVO> findCity = this.getSqlSessionTemplate().selectList("findCity", paramCriteria);
        return findCity;
    }
}
