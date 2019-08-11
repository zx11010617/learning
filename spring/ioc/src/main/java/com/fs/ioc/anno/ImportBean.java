package com.fs.ioc.anno;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = Configuration.class)
public class ImportBean {
}
