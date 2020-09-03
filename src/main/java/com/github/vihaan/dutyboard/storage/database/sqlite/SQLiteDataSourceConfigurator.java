package com.github.vihaan.dutyboard.storage.database.sqlite;

import com.github.vihaan.dutyboard.storage.database.DataSourceConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SQLiteDataSourceConfigurator implements DataSourceConfigurator {

    private Environment env;

    @Autowired
    public SQLiteDataSourceConfigurator(Environment env) {
        this.env = env;
    }

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //noinspection ConstantConditions
        dataSource.setDriverClassName(env.getProperty("org.sqlite.JDBC"));
        dataSource.setUrl(env.getProperty("jdbc:sqlite:DutyBoardDatabase.db"));
        return dataSource;
    }
}
