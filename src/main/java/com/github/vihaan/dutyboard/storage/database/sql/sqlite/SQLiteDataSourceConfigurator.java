package com.github.vihaan.dutyboard.storage.database.sql.sqlite;

import com.github.vihaan.dutyboard.storage.database.DataSourceConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SQLiteDataSourceConfigurator implements DataSourceConfigurator {

    @Value("{$spring.datasource.url}")
    private String dataSourceUrl;

    @Value("{$spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dataSourceUrl);
        return dataSource;
    }
}
