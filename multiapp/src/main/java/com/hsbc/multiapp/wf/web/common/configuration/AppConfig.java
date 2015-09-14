package com.hsbc.multiapp.wf.web.common.configuration;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hsbc.au.web.processor.util.ApplicationContextProvider;
 
@Configuration
@ComponentScan(basePackages = "com.hsbc.au.web.processor")
public class AppConfig {
    @Bean
    public ApplicationContextProvider applicationContextProvder() {
        return new ApplicationContextProvider();
    }
}