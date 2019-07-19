package com.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.crm.dao")
@org.springframework.context.annotation.Configuration
public class DataSourceFactory {

    @Bean
    public ComboPooledDataSource c3p0DataSource() {
        return new ComboPooledDataSource();
    }

    @Bean
    public SqlSessionFactory factoryConfigurated(DataSource c3p0DataSource, Configuration configuration) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(c3p0DataSource);
        factoryBean.setConfiguration(configuration);
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = factoryBean.getObject();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Bean
    public Configuration configuration() {
        Configuration configuration = new Configuration();
        configuration.setAggressiveLazyLoading(true);
        configuration.setCacheEnabled(true);
        configuration.setDefaultFetchSize(2000);
        configuration.setLazyLoadingEnabled(false);
        configuration.setLogImpl(Log4j2Impl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory factoryConfigurated) {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factoryConfigurated);
        return sqlSessionTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource c3p0DataSource) {
        return new DataSourceTransactionManager(c3p0DataSource);
    }
}
