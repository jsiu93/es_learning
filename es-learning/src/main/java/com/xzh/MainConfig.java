/**
 * Copyright 2017 JINZAY All Rights Reserved.
 */
package com.xzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@EnableWebMvc
@Configuration
@ComponentScan({"com.xzh.*"})
@MapperScan(basePackages = "com.xzh.mapper")
public class MainConfig {

}
