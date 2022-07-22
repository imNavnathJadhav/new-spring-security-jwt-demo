package com.navnath.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtTestApplication.class, args);
    }

}


// ref
// https://github.com/spring-projects/spring-security-samples/tree/main/servlet/spring-boot/java/jwt/login
