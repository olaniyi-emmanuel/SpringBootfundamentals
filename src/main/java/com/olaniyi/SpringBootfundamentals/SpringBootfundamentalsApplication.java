package com.olaniyi.SpringBootfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.olaniyi.Controller"})
public class SpringBootfundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootfundamentalsApplication.class, args);
	}

}
