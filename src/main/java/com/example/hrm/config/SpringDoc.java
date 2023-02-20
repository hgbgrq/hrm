package com.example.hrm.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDoc {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info();
        info.setTitle("STUDY");
        info.setDescription("지능플랫폼사업팀");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}

