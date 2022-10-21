package com.project.hrworker.domain.dto;

public class Worker1Dto {
	
	private String nome;
	private String email;
	
	public Worker1Dto() {}

	public Worker1Dto(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
