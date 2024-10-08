package com.sparta.week04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling   // 스프링 부트에서 스케줄러가 작동하게 함
@EnableJpaAuditing  // 시간 자동 변경이 가능하도록 함
@SpringBootApplication  // 스프링부트임을 선언
public class Week04Application {

    public static void main(String[] args) {
        SpringApplication.run(Week04Application.class, args);
    }

}
