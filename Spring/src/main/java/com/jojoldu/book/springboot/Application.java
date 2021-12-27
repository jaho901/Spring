package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동 설정
// Spring에 의하여 생성되고 관리되는 자바 객체를 Bean이라고 합니다.
// 이 데코레이터가 있는 위치부터 설정을 읽기 시작하므로 항상 프로젝트의 최상단에 위치!!!
@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//      SpringApplication.run == 내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
