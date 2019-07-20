package com.crm.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityDao {

    // 查询省
    @Select("SELECT id,address,pid FROM city WHERE pid = 0")
    public List<CityVO> findProvince();

    @Select("SELECT m.id,m.address,m.pid FROM `city` n  JOIN city m ON n.id = m.pid AND n.address = #{paramCriteria}")
    // 查询市
    public List<CityVO> findCity(String paramCriteria);
}
