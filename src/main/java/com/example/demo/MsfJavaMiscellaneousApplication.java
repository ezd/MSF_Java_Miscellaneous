package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.annotations.AnotationDemo;
import com.example.gennerics.GennericsTest;
@ComponentScan("com.example.*")
@SpringBootApplication
public class MsfJavaMiscellaneousApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsfJavaMiscellaneousApplication.class, args);
//		AnotationDemo ad=new AnotationDemo();
//		ad.runAnnotationDemo();
		GennericsTest gt=new GennericsTest();
		gt.runGennericTest();
	}
}
