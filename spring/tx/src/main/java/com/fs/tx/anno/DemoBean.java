package com.fs.tx.anno;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Component("demo")
@Transactional(rollbackFor = Exception.class)
public class DemoBean {


    @Autowired
    SqlSessionFactory factory;

    @Autowired
    private SqlSession session;

    @Autowired
    DataSource dataSource;


    public void doJob() throws Exception {
        session.update("anno.DemoMapper.up");
        factory.openSession().update("anno.DemoMapper.up");


        Connection conn = factory.openSession().getConnection();
        conn.setAutoCommit(false);
        PreparedStatement ps = conn.prepareStatement("insert into USER (ID, NAME) VALUES (612102, '2')");
        ps.execute();
        if (ps != null) {

            throw new Exception("exp");
        }
        System.out.println("dojob..........");
    }
}
