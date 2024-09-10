package dev.vichhaicoder.api_gateway;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {


//    @Bean
//    public CommandLineRunner openApiGroup(SwaggerUiConfigParameters swaggerUiConfigParameters){
//        return args -> {
//            swaggerUiConfigParameters.addGroup("user-service","/api/v1/user/**");
//            swaggerUiConfigParameters.addGroup("order-service");
//        };
//    }

    @Bean
    public GroupedOpenApi userServiceApi() {
        return GroupedOpenApi.builder()
                .group("user-service")
                .pathsToMatch("api/v1/user/**")
                .build();
    }

    @Bean
    public GroupedOpenApi authServiceApi() {
        return GroupedOpenApi.builder()
                .group("auth-service")
                .pathsToMatch("api/v1/order/**")
                .build();
    }
}

