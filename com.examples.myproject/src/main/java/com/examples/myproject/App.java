package com.examples.myproject;

public class App {
	
	// something
	public String sayHello(String name) {
		if (name == null) {
			return "Hello";
		}
		
		return "Hello " + name;
		
	}
	
	public String sayHello() {
		return sayHello(null);
	}
}
