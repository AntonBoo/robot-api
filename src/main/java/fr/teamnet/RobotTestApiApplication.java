package fr.teamnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SuppressWarnings("deprecation")
@SpringBootApplication
public class RobotTestApiApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(RobotTestApiApplication.class, args);
	}
}
