package io.github.matheusfsantos.model;

public class Paciente {
	private String nome;
	private String sobrenome;
	private Integer idade;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, String sobrenome, Integer idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Paciente [nome=" + this.getNome() + ", sobrenome=" + this.getSobrenome() + ", idade=" + this.getIdade() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}