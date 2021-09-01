package com.leo.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.api.domain.Usuario;
import com.leo.api.repositories.UsuarioRepository;
import com.leo.api.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario findById(Integer id) {
		
		Optional<Usuario> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}


	public List<Usuario> findAll() {
		return repository.findAll();
	}


	public Usuario update(Integer id, Usuario obj) {
		
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		
		return repository.save(newObj);
		
		
	}
	
}
