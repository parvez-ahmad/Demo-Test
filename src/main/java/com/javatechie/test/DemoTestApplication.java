package com.javatechie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestApplication {

	public void test(){}
	public void test1(){}
	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
		System.out.println("before commit");
		System.out.println("second commit");
		System.out.println("third commit from eclipse");
		System.out.println("fourth changes");
		System.out.println("changes done throught the branch");
		
	}

}
