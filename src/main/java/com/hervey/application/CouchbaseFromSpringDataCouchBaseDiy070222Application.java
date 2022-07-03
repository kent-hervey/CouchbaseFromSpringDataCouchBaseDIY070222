package com.hervey.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CouchbaseFromSpringDataCouchBaseDiy070222Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CouchbaseFromSpringDataCouchBaseDiy070222Application.class, args);
		System.out.println("number of beans:   " + run.getBeanDefinitionNames().length);
	}

}
