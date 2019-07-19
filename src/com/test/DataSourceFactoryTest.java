package com.test;

import com.datasource.DataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

public class DataSourceFactoryTest {

    private Logger logger = LogManager.getLogger();

    @Test
    public void c3p0DataSourceTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        ComboPooledDataSource c3p0DataSource = context.getBean("c3p0DataSource", ComboPooledDataSource.class);
        logger.debug("---------------------------------------->"+c3p0DataSource);

    }

    @Test
    public void SqlSessionFactoryTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        SqlSessionFactory sqlSessionFactory = context.getBean("factoryConfigurated", SqlSessionFactory.class);
        logger.debug("-------------------------------------------->"+sqlSessionFactory);
    }

    @Test
    public void sqlSessionTemplateTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        SqlSessionTemplate sqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        logger.debug("----------------------------->"+sqlSessionTemplate);
    }

    @Test
    public void DataSourceTransactionManagerTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        DataSourceTransactionManager transactionManager = context.getBean("transactionManager", DataSourceTransactionManager.class);
        logger.debug(transactionManager);
    }

    @Test
    public void DataSourceTransactionManagerTest2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        DataSourceTransactionManager transactionManager = context.getBean("transactionManager", DataSourceTransactionManager.class);
        logger.debug(transactionManager);
    }
     @Test
    public void DataSourceTransactionManagerTest1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
        DataSourceTransactionManager transactionManager = context.getBean("transactionManager", DataSourceTransactionManager.class);
        logger.debug(transactionManager);
    }
}
