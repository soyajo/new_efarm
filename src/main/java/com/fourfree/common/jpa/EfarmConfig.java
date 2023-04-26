package com.fourfree.common.jpa;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@EnableJpaRepositories(
        basePackages = "com.fourfree.new_efarm",
        entityManagerFactoryRef = "efarmEntityManager",
        transactionManagerRef = "efarmTransactionManager"
)
@Configuration
public class EfarmConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean efarmEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(efarmDataSource());
        em.setPackagesToScan(new String[] {"com.fourfree.new_efarm"});
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return em;
    }

    @Bean
    @ConfigurationProperties(prefix = "efarm.datasource")
    public DataSource efarmDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public PlatformTransactionManager efarmTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(efarmEntityManager().getObject());
        return transactionManager;
    }


}
