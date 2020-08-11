package com.github.vihaan.dutyboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DutyBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DutyBoardApplication.class, args);
    }

}
