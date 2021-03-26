package com.example.pismoBank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.pismoBank"))
                .paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }
    
    
    private ApiInfo metaData() {
        return new ApiInfoBuilder()
            .title("PismoBank (0.0.1-SNAPSHOT)")
            .description("\"Spring Boot REST API Pismo Bank\"")
            .version("0.0.1-SNAPSHOT")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
            .build();
      }
}