package com.example;

public class HelloWorld {

	private String name;
	
	public HelloWorld(String n){
		name=n;
	}
	public void init() {
		System.out.println("init...");
	}

	public void destroy() {
		System.out.println("destroy...");
	}
	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}
	
}
