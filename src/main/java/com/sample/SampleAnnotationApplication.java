package com.sample;

import java.lang.reflect.Field;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.annotation.MyAnnotation;
import com.sample.domain.Person;

@SpringBootApplication
public class SampleAnnotationApplication {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		SpringApplication.run(SampleAnnotationApplication.class, args);
		
		Person person = new Person();
		
		Field field = person.getClass().getField("name");  
		  
		MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);  
		System.out.println("My name is: "+myAnnotation.name());  
	}

}
