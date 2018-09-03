package com.cruelengine.dairyfarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.cruelengine.dairyfarm.controllers" , "com.cruelengine.dairyfarm.services","com.cruelengine.dairyfarm.persitence","com.cruelengine.dairyfarm.initializers"})
@EnableReactiveMongoRepositories("com.cruelengine.dairyfarm.repository")
public class DairyFarmApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DairyFarmApplication.class);
    }
	
    @Bean 
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
    	return new BCryptPasswordEncoder();
    }
    
    
	public static void main(String[] args) {
		SpringApplication.run(DairyFarmApplication.class, args);
	}
}
