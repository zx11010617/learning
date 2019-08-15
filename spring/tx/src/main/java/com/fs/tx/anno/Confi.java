package com.fs.tx.anno;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.InputStream;

@Configuration
public class Confi {

    @Resource
    SqlSessionFactory factory;

    @Bean(value = "session")
    public SqlSession getSqlSession () throws Exception {
        return factory.openSession();
    }


//    @Bean("txManager")
//    public DataSourceTransactionManager getTxManager() {
//        return new DataSourceTransactionManager(factory.openSession());
//    }
}
