package com.cruelengine.dairyfarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages= {"com.cruelengine.dairyfarm.services", "com.cruelengine.dairyfarm.controllers","com.cruelengine.dairyfarm.persitence"})
@EnableReactiveMongoRepositories("com.cruelengine.dairyfarm.repository")
@EnableTransactionManagement
//@EntityScan("com.cruelengine.dairyfarm.persitence")
public class DairyFarmApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DairyFarmApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DairyFarmApplication.class, args);
	}
}
