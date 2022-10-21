package com.project.hrworker.domain.entities;

public class Worker1 {

	private String nome;
	private String email;
	
	public Worker1() {
		super();
	}

	public Worker1(String nome, String email) {
		super();
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
