package com.springcodelab.didemo;

import com.springcodelab.didemo.controllers.ConstructorInjectedController;
import com.springcodelab.didemo.controllers.HelloController;
import com.springcodelab.didemo.controllers.PropertyInjectedController;
import com.springcodelab.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		final ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
		final HelloController helloController = applicationContext.getBean(HelloController.class);

		System.out.println(helloController.sayHello());
		System.out.println("PropertyInjectedController: " + applicationContext.getBean(PropertyInjectedController.class).sayGreeting());
		System.out.println("SetterInjectedController: " + applicationContext.getBean(SetterInjectedController.class).sayGreeting());
		System.out.println("ConstructorInjectedController: " + applicationContext.getBean(ConstructorInjectedController.class).sayGreeting());
	}
}
