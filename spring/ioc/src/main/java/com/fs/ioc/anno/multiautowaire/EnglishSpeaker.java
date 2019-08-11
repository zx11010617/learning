package com.fs.ioc.anno.multiautowaire;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EnglishSpeaker implements ISpeakAble {
    public void speak() {
        log.info("i can speak english ");

    }

    public void setBeanName(String name) {
        System.out.println(name);
    }
}
