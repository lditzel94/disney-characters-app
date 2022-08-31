package com.disney.disneycharacters.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    /*@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName( "com.mysql.cj.jdbc.Driver" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "VL1hsLzs" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/disney-movies?createDatabaseIfNotExist=true" );

        return dataSource;
    }*/

    @Bean
    @Primary
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName( "org.h2.Driver" );
        dataSourceBuilder.url( "jdbc:h2:mem:testdb" );
        dataSourceBuilder.username( "sa" );
        dataSourceBuilder.password( "password" );
        return dataSourceBuilder.build();
    }
}
