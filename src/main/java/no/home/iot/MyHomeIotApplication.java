package no.home.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class MyHomeIotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHomeIotApplication.class, args);
	}
}
