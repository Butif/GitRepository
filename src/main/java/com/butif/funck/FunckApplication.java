package com.butif.funck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//用来声明这是启动SpringBoot程序的启动类，必须有
@MapperScan(basePackages = "com.butif.funck.com.example.demo.mapper")
public class FunckApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(FunckApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
