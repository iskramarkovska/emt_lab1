package com.example.rentalapp.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public io.swagger.v3.oas.models.OpenAPI customOpenAPI() {
        return new io.swagger.v3.oas.models.OpenAPI()
                .info(new Info().title("Rental App API")
                        .description("API for managing accommodations")
                        .version("v1"));
    }
}
