package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        Hello obj= context.getBean("hello",Hello.class);
        obj.show();
    }

}
