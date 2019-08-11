package com.fs.ioc.anno;

import com.fs.ioc.anno.multiautowaire.ISpeakAble;
import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "b1")
@Data
public class AnnoBean implements BeanNameAware{

    @Value("${bean.name}")
    private String name;

    private String nameOfBean;

    private Long ageOfBean;

//    @Autowired
//    @Qualifier("englishSpeaker")
    @Resource(name = "englishSpeaker")
    private ISpeakAble speaker;


    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    public AnnoBean() {

    }

    public void setBeanName(String name) {
        System.out.println(name);
    }

}
