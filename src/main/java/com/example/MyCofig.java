package com.example;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:com/example/test.properties")

public class MyCofig {
	
	String username;
	 
	@Autowired
	private MyConfigTwo myConfigTwo;

	
	@Bean(initMethod = "init", destroyMethod = "destroy", name="hello" )
	@Scope("prototype")
	public HelloWorld helloworld(){
		return new HelloWorld("HeLPP");
	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() {
	    return new DriverManagerDataSource();
	}
	

	
	
	/*@Bean
	public DataSource getDatasource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(this.dbDriver);
		datasource.setUrl(this.dbURL);
		datasource.setUsername(this.dbUserName);
		datasource.setPassword(this.dbPassword);
		return datasource;
	}*/
	
}
