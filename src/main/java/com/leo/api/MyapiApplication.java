package com.leo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leo.api.domain.Usuario;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Leonardo Wanderley" , "leo", "123");
		Usuario u2 = new Usuario(null, "Tyrael" , "tyrael", "123");
	}

}
