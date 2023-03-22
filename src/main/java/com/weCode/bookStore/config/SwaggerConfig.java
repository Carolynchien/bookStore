package com.weCode.bookStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
//@Configuration
public class SwaggerConfig {

    @Bean
    public Docket bookStoreApiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wecode.bookStore.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiMetaData());
    }


    private ApiInfo apiMetaData() {
        return new ApiInfo(
                "Book Stroe REST API",
                "ALl api's for book store application",
                "1.0",
                "term and condition url",
                new Contact(
                        "BookStore Admin",
                        "https://bookstore-flying-creamy-web.herokuapp.com",
                        "bookstore@gmail.com"

                ),
                "book store license",
                "license url",
                Collections.emptyList()
        );
    }
}
