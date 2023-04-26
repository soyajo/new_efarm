package com.fourfree.new_efarm;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication(scanBasePackages = "com.fourfree")
public class NewEfarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewEfarmApplication.class, args);
    }

    @Bean
    JPAQueryFactory jpaQueryFactory(EntityManager em) {
        return new JPAQueryFactory(em);
    }
}
