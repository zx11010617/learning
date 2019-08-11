package com.fs.ioc.anno4;


import com.fs.ioc.anno3.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope// (value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)这种写法多用于属性，或者setter上，用于在会话内每次新建一个注入的bean的代理
public class AutowaireAnno {

    // 不支持静态的注入
//    @Autowired
    public Teacher st;


    public Teacher getTeacher() {
        return this.st;
    }

    @Autowired
    public void setTeacher(Teacher t) {
        this.st = t;
    }
}
