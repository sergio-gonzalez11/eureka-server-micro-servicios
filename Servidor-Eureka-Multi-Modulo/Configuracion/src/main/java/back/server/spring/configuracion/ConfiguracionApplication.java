package back.server.spring.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfiguracionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionApplication.class, args);
	}

}
