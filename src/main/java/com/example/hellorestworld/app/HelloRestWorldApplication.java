package com.example.hellorestworld.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Puedes configurar en boot el context root en el archivo de propiedades:
 * 
 * spring.data.rest.basePath=/api
 * 
 * server.contextPath=/greetings
 * 
 * Para swagger2: (empieza en el root de la aplicación)
 * http://localhost:8080/greetings/swagger-ui.html
 * http://localhost:8080/greetings/v2/api-docs
 * 
 * @author core
 *
 */
@SpringBootApplication
public class HelloRestWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestWorldApplication.class, args);
	}

}
