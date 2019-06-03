package com.example.libray.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
	LibraryContextConfig.class,
	LibraryPersistenceConfig.class,
	LibraryServiceConfig.class
})
public class LibrarySpringbootV2Application {

	public static void main(String[] args) {
		SpringApplication.run(LibrarySpringbootV2Application.class, args);
	}

}
