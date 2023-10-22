package com.example.custom_starter.config;

import com.example.custom_starter.service.CopyrightGenService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterCopyrightProperties.class)
public class StarterCopyrightConfiguration {
    @Bean
    public CopyrightGenService copyrightGenService(StarterCopyrightProperties props) {
        return new CopyrightGenService(props);
    }
}
