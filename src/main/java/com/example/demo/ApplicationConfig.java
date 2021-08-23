package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan(basePackages = "com.example.*")
@MapperScan(basePackages = "com.example.mapper") //mapper가 어디있는지 알려주기
public class ApplicationConfig{

}