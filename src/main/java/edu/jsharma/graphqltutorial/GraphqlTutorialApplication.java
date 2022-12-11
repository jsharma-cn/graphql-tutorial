package edu.jsharma.graphqltutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GraphqlTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTutorialApplication.class, args);
		System.out.println("Welcome to Java Wrold!!!");
	}
	
	@RequestMapping("/")
	  public String home() {
	    return "Hello Docker World";
	  }

}
