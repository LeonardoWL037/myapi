package com.leo.api.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo nome é obrigatório")
	@Length(min = 3, max = 100, message = "O nome deve possuir mais que 3 e menos que 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo login é obrigatório")
	@Length(min = 3, max = 20, message = "O login deve possuir mais que 3 e menos que 20 caracteres")
	private String login;
	
	@NotEmpty(message = "Campo senha é obrigatório")
	@Length(min = 8, max = 30, message = "O nome deve possuir mais que 3 e menos que 30 caracteres")
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String nome, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

}
