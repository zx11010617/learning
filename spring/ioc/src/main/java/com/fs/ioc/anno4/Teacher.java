package com.fs.ioc.anno4;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("teacher")
@Data
public class Teacher {

    private String age;
}
