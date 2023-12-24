package com.example.carrentaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestCarRentalDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(CarRentalDemoApplication::main).with(TestCarRentalDemoApplication.class).run(args);
    }

}
