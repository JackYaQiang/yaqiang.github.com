package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(value = {"com.example.springboot"},
		includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value ={org.springframework.stereotype.Controller.class,org.springframework.web.bind.annotation.ControllerAdvice.class}  ))
@EnableAutoConfiguration
@ImportResource({"classpath:beanContext.xml"})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
