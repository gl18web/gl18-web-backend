package com.gl18.gl18webbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Gl18WebBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gl18WebBackendApplication.class, args);
    }

}
