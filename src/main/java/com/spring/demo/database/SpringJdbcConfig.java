package com.spring.demo.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfig {

    @Bean
    public static AbstractDriverBasedDataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //dataSource.setDriverClassName("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/guestdb");
        dataSource.setUsername("guest");
        dataSource.setPassword("guest");
        return  dataSource;
    }
}
