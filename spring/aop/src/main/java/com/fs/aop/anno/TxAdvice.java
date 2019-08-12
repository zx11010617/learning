package com.fs.aop.anno;

import org.springframework.stereotype.Component;

public class TxAdvice {

    public void before() {
        System.out.println("before.........");
    }

    public void after() {
        System.out.println("after.........");
    }
}
