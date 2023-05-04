package com.springframework.springproject;

import com.springframework.springproject.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringprojectApplicationTests {

	@Autowired
	MyController myController;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testAutoWireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController);
	}
	@Test
	void contextLoads() {
	}

}
