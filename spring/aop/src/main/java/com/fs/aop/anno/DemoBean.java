package com.fs.aop.anno;

import org.springframework.stereotype.Component;

@Component("demo")
public class DemoBean {

    public void doJob() {
        System.out.println("dojob..........");
    }
}
