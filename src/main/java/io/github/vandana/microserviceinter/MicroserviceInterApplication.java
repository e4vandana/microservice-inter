package io.github.vandana.microserviceinter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceInterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceInterApplication.class, args);
	}
	
	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
