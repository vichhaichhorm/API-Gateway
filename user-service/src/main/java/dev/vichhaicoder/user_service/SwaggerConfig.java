//package dev.vichhaicoder.user_service;
//
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public GroupedOpenApi userServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("user-service")
//                .pathsToMatch("/api/v1/user/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi authServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("auth-service")
//                .pathsToMatch("/auth/**")
//                .build();
//    }
//    @Bean
//    public GroupedOpenApi firstServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("first-service")
//                .pathsToMatch("/first/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi secondServiceApi() {
//        return GroupedOpenApi.builder()
//                .group("second-service")
//                .pathsToMatch("/second/**")
//                .build();
//    }
//}
