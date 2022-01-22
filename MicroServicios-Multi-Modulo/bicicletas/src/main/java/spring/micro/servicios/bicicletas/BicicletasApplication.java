package spring.micro.servicios.bicicletas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BicicletasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BicicletasApplication.class, args);
	}

}
