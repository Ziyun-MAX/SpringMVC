package com.test;

import com.crm.dao.impl.CityDaoImpl;
import com.crm.vo.CityVO;
import com.datasource.DataSourceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CityDaoTest {

    private Logger logger = LogManager.getLogger();

    @Test
    public void findProvinceTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        CityDaoImpl cityDaoImpl = context.getBean("cityDaoImpl", CityDaoImpl.class);
        List<CityVO> province = cityDaoImpl.findProvince();
        province.forEach((m)->logger.debug(m));
    }


}
