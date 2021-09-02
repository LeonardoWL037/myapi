package com.leo.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leo.api.domain.Usuario;
import com.leo.api.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Usuario u1 = new Usuario(null, "Leonardo Wanderley", "leo", "123456789");
//		Usuario u2 = new Usuario(null, "Tyrael" , "tyrael", "123456789");
//	
//		
//		usuarioRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
	
}
