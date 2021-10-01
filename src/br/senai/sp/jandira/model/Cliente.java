package br.senai.sp.jandira.model;

public class Cliente {
	
	private String nome;
	private String email;
	private String salario;
	
	public void setNome (String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setEmail (String email) {
		
		this.email = email;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	public void setSalario (String salario) {
		
		this.salario = salario;
		
	}
	
	public String getSalario() {
		
		return salario;
		
	}
	

}
