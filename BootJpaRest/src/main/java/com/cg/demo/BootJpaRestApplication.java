package com.cg.demo;

//import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class BootJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJpaRestApplication.class, args);
	}
	
//	@Bean
//	public Docket swaggerConfiguration() {
//		//Return a prepared Docket instance
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/api/*"))
//				.apis(RequestHandlerSelectors.basePackage("com.cg"))
//				.build()
//				.apiInfo(apiDetails());
//	}
//	
//	private ApiInfo apiDetails() {
//		return new ApiInfo(
//				"Student Record API",
//				"Sample API for SpringBoot practice",
//				"1.0",
//				"Free to use",
//				new springfox.documentation.service.Contact("Roshan Melanta", "http://capgemini.com", "roshan.melanta@capgemini.com"),
//				"API License",
//				"http://capgemini.com",
//				Collections.emptyList());
//	}

}
