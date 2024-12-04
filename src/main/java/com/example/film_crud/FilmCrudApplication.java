package com.example.film_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching // Habilita el soporte de caché en la aplicación
public class FilmCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(FilmCrudApplication.class, args);
	}
}
