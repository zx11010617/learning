package com.fs.tx.anno;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


public class TxAdvice {

    public void before() {
        System.out.println("before.........");
    }

    public void after() {
        System.out.println("after.........");
    }
}
