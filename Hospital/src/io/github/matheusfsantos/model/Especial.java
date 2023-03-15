package io.github.matheusfsantos.model;

public class Especial extends Paciente {
	private String problema;

	public Especial() {
		
	}
	
	public Especial(String nome, String sobrenome, Integer idade, String problema) {
		super(nome, sobrenome, idade);
		
		this.problema = problema;
	}

	@Override
	public String toString() {
		return "Especial [" + super.toString() + ", problema=" + this.getProblema() + "]";
	}
	
	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}
}