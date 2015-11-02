package com.springapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author asif.hossain
 * @since 11/2/15
 */
@Configuration
@PropertySource("classpath:ApplicationResources.properties")
public class PropertiesConfig {
    @Bean
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
