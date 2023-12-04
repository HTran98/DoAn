package com.h3phonestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class H3phonesApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
	return application.sources(H3phonesApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(H3phonesApplication.class, args);
	}

}
