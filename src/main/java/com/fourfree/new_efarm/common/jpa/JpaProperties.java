package com.fourfree.new_efarm.common.jpa;

import org.hibernate.dialect.Oracle10gDialect;

import java.util.Properties;


public class JpaProperties {
    /**
     * 참고 : https://mycup.tistory.com/237 Hibernate Naming Strategy
     *
     * @return
     */

    public static Properties mariadb_additionalProperties(String active) {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "validate");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect");
        //물리(영문, 테이블명
        properties.setProperty("hibernate.physical_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        //논리(설명)
        properties.setProperty("hibernate.implicit_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        properties.setProperty("hibernate.use-new-id-generator-mappings", "false");

        if (active.equals("dev")) {
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.format_sql", "true");
            properties.setProperty("hibernate.use_sql_comments", "true");
        }
        return properties;
    }

    public static Properties oracle_additionalProperties(String active) {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "validate");
        properties.setProperty("hibernate.dialect", Oracle10gDialect.class.getName());

        //물리(영문, 테이블명
        properties.setProperty("hibernate.physical_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");

        //논리(설명)
        properties.setProperty("hibernate.implicit_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        properties.setProperty("hibernate.use-new-id-generator-mappings", "false");

        if (active.equals("dev")) {
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.format_sql", "true");
            properties.setProperty("hibernate.use_sql_comments", "true");
        }
        return properties;
    }
}
