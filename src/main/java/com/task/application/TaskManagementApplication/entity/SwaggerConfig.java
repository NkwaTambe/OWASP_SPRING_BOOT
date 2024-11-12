package com.task.application.TaskManagementApplication.entity;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Task Management API")
                        .description("API documentation for Task Management System")
                        .version("v1.0.0")
                        .contact(new Contact().name("Owner").email("nkwajudetambe@gmail.com").url("https://nkwatambe.github.io/personal_portfolior/")))
                .externalDocs(new ExternalDocumentation()
                        .description("Task Management Documentation")
                        .url("https://example.com/docs"));
    }
}
