package com.fs.ioc.anno.multiautowaire;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ChineseSpeaker implements ISpeakAble, BeanNameAware {
    public void speak() {
        log.info("i can speak chinsese ");
    }

    public void setBeanName(String name) {
        System.out.println(name);
    }
}
