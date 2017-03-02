package com.example;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class MovieCatalogA extends MovieCatalog{

	public Object getname() {
		// TODO Auto-generated method stub
		return "MovieCatalogA";
	}
}
