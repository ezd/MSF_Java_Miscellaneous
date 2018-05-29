package com.example.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
	public enum Priority {LOW, MEDIUM, HIGH}
	public enum Status {STARTED, NOT_STARTED}
	
	String authod() default "Ezedin";
	Priority priority() default Priority.LOW;
	Status status() default Status.NOT_STARTED;

}
