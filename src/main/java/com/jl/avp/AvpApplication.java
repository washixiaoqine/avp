package com.jl.avp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jl.avp.dao")
public class AvpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvpApplication.class, args);
    }

}
