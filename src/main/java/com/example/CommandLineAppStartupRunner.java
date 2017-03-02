package com.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.go.SimpleMovieLister;

@Component

public class CommandLineAppStartupRunner implements CommandLineRunner {

	private Logger log = Logger.getLogger(CommandLineAppStartupRunner.class);
	@Autowired
	private ApplicationContext context;

	@Autowired
	MovieRecommender movieRecommender;
	
	@Autowired
	MovieRecommender lemovieRecommender;
	
	@Autowired
	MovieRecommender pop;
	
	@Autowired
	private HelloWorld helloworld;
	
	
	
	@Autowired
	private SimpleMovieLister simpleMovieLister;
	@Autowired
	private SimpleMovieLister movielister;
	
	/*@Autowired
	MovieRecommender newmovierecommender;*/

	@Override
	public void run(String... args) throws Exception {
		log.info("Eeeoe");
		log.info("==>>> MOVIE ARRAY" + movieRecommender.getMovie());
		log.info("==>>> MOVIE SET" + movieRecommender.getMovieSet());
		log.info("==>>> MOVIE List" + movieRecommender.getMovieList());
		log.info("Here comes movieRecommender1 = "+pop.hashCode());
		log.info("Here comes movieRecommender = "+movieRecommender.hashCode() + " "+lemovieRecommender.hashCode());
		log.info(simpleMovieLister);
		HelloWorld h = (HelloWorld)context.getBean("hello");
		log.info(movielister);
		System.out.println(h +"===" +helloworld);
		
		
		

	}
}