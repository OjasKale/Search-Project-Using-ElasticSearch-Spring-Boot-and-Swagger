package com.ojas.zendesk.projectsearch.config;

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
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.ojas.zendesk.projectsearch.controller"))
				.build()
				.apiInfo(apiInfo());
	}


	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Zendesk Search API")
				.description("Zendesk Search Project Developed by Ojas Kale")
				.termsOfServiceUrl("http://www.zendesk.com")
				.version("1.0").build();
	}

}
