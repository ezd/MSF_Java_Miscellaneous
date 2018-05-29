package com.example.annotations;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.lang.reflect.Method;

import com.example.annotations.Todo.Priority;
import com.example.annotations.Todo.Status;

public class AnotationDemo {
	
	public void runAnnotationDemo() {
		try {
			Class myclass=AnotationDemo.class;
			for (Method method :myclass.getMethods()) {
				Todo annotation = method.getAnnotation(Todo.class);
				if(annotation!=null) {
					System.out.println("method name:"+method.getName());
					System.out.println("author name:"+annotation.authod());
					System.out.println("priority:"+annotation.priority());
					System.out.println("status:"+annotation.status());
				}
				
			}
			
//			Method method = ad.getClass().getMethod("nameAndAge");
//			NameAge annotation = method.getAnnotation(NameAge.class);
//			System.out.println("Name value of the annotation is:"+annotation.name());
//			System.out.println("Age value of the annotation is"+annotation.age());
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	@Todo(authod="kebede",priority=Priority.HIGH,status=Status.STARTED)
	public void doSomething() {
		
	}
	@Todo(priority=Priority.MEDIUM)
	public void doOtherthing() {
		
	}

}
