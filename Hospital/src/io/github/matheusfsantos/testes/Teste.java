package io.github.matheusfsantos.testes;

import io.github.matheusfsantos.model.Comum;
import io.github.matheusfsantos.model.Especial;
import io.github.matheusfsantos.model.Paciente;

import io.github.matheusfsantos.model.estruturas.Fila;

public class Teste {
	public static void main(String[] args) {
		Fila teste = new Fila();
		
		Paciente comum1 = new Comum("Matheus", "Ferreira", 18);
		Paciente comum2 = new Comum("Lucas", "Silva", 18);
		Paciente comum3 = new Comum("Umberto", "Soares", 22);
		Paciente idoso1 = new Comum("José", "Algusto", 60);
		Paciente idoso2 = new Comum("Antonio", "Alberto", 60);
		Paciente especial = new Especial("Lucas", "Souza", 67, "Parkison");
		
		teste.adiciona(comum1);
		teste.adiciona(idoso1);
		teste.adiciona(especial);
		teste.adiciona(comum2);
		teste.adiciona(comum3);
		teste.adiciona(idoso2);
		
		System.out.print(teste.toString());
	}
}