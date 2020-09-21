package com.github.vihaan.dutyboard.configuration;

import com.github.vihaan.dutyboard.storage.properties.StorageProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class DutyBoardConfiguration {
}
