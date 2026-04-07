package com.letsdo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LetsdoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LetsdoApplication.class, args);
        System.out.println("===========================================");
        System.out.println("   🚀 Lets Do Application is Running!     ");
        System.out.println("   📍 http://localhost:8080                ");
        System.out.println("===========================================");
    }
}
