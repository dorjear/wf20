package com.dorjear.ralf.web.configuration;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dorjear.ralf.web.processor.util.ApplicationContextProvider;
 
@Configuration
@ComponentScan(basePackages = "com.dorjear.ralf.web.processor")
public class AppConfig {
    @Bean
    public ApplicationContextProvider applicationContextProvder() {
        return new ApplicationContextProvider();
    }
}