package com.example.demo;

import com.example.demo.controller.GreetingController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    static ApplicationContext context;

    @BeforeAll
    static void init() {
        context = new AnnotationConfigApplicationContext(DemoApplication.class);
    }

    @Test
    void contextLoads() {
        GreetingController controller = context.getBean(GreetingController.class);
        assertNotNull(controller);
    }

    @Test
    public void checkValue() {
        GreetingController controller = context.getBean(GreetingController.class);
        assertEquals(controller.sayHello("Roman"), "Hello, Roman!");
    }

}
