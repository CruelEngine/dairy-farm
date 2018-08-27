package com.cruelengine.dairyfarm.initializers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class InitDatabase {

	
	@Bean
	CommandLineRunner init(MongoOperations mongoOperations) {
		return args -> {
			//do operations when mongodb is initialized in app
		};
	}
	
}
