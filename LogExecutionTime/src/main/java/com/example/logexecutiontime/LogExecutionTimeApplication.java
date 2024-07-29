package com.example.logexecutiontime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LogExecutionTimeApplication implements org.springframework.boot.CommandLineRunner {

	@Autowired
	LoggerTestClass loggerTestClass;

	public static void main(String[] args) {
		SpringApplication.run(LogExecutionTimeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		loggerTestClass.testMethod();
	}

}
