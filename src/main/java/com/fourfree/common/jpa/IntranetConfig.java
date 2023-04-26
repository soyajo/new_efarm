package com.fourfree.common.jpa;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import net.sf.log4jdbc.tools.Log4JdbcCustomFormatter;
import net.sf.log4jdbc.tools.LoggingType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@EnableJpaRepositories(
        basePackages = "com.fourfree.intranet",
        entityManagerFactoryRef = "intranetEntityManager",
        transactionManagerRef = "intranetTransactionManager"
)
@Configuration
public class IntranetConfig {
    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean intranetEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(intranetDataSource());
        em.setPackagesToScan(new String[] {"com.fourfree.intranet"});
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return em;
    }

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "intranet.datasource")
    public DataSource intranetDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager intranetTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(intranetEntityManager().getObject());
        return transactionManager;
    }


}
