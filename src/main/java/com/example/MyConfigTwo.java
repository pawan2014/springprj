package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigTwo {

	
	@Bean(name="pop")
	public MovieRecommender lemovieRecommender(){
		return new MovieRecommender(null);
	}
	
}
