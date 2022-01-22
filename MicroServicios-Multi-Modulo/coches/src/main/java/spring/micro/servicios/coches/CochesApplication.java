package spring.micro.servicios.coches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CochesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CochesApplication.class, args);
	}

}
