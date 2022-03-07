package com.test.albo.marvel.docs;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.test.albo.marvel.controller")).paths(PathSelectors.any())
				.build().apiInfo(metaData());

	}

	
	private ApiInfo metaData() {
	    return new ApiInfoBuilder()
	        .title("Marvel REST API ")
	        .description("\"REST API for explore Marvel API\"")
	        .version("1.0.0")
	        .build();
	  }
	}