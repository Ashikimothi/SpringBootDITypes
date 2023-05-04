package com.springframework.springproject;

import com.springframework.springproject.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringprojectApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
