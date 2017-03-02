package com.example;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(9)
public class MovieCatalog {

	public Object getname() {
		// TODO Auto-generated method stub
		return "MovieCatalog";
	}

}
