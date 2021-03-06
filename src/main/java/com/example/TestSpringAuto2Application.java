package com.example;

import com.example.model.entity.Employee;
import com.example.model.service.WServ;
import org.json.JSONException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringAuto2Application {

	public static void main(String[] args) throws JSONException {
		BeanFactory beanFactory = SpringApplication.run(TestSpringAuto2Application.class, args);
		beanFactory.getBean(WServ.class).save(new Employee("Vasia", 3333, "Manager", 20000));


    }
}
