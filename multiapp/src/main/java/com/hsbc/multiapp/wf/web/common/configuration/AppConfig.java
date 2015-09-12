package com.hsbc.multiapp.wf.web.common.configuration;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hsbc.au.web.processor.common.LookUpDataProcessor;
import com.hsbc.au.web.processor.spi.RequestProcessor;
 
@Configuration
public class AppConfig {
	
    @Bean
    public RequestProcessor helloWorld() {
        return new LookUpDataProcessor();
    }
	
}