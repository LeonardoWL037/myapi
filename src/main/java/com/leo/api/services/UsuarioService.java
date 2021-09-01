package com.leo.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.api.domain.Usuario;
import com.leo.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario findById(Integer id) {
		
		Optional<Usuario> obj = repository.findById(id);
		
		return obj.orElse(null);
	}
	
}
