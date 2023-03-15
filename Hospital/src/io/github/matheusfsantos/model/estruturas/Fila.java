package io.github.matheusfsantos.model.estruturas;

import io.github.matheusfsantos.model.Comum;
import io.github.matheusfsantos.model.Especial;
import io.github.matheusfsantos.model.Paciente;

public class Fila extends EstruturaEstatica {
	
	private Integer posicaoEspecial;
	
	public Fila() {
		super();
		
		this.posicaoEspecial = 0;
	}
	
	public Fila(Integer capacidade) {
		super(capacidade);

		this.posicaoEspecial = 0;
	}
	
	@Override
	public Object adiciona(Object paciente) {
		Paciente newPaciente = null;
		
		if(paciente instanceof Comum) {
			newPaciente = (Comum) paciente;
			
			if(newPaciente.getIdade() >= 60) {
				super.adiciona(posicaoEspecial, paciente);
				posicaoEspecial++;
			} else {
				super.adiciona(newPaciente);
			}
		}
			
		
		if(paciente instanceof Especial) {
			newPaciente = (Especial) paciente;
			super.adiciona(posicaoEspecial, paciente);
			posicaoEspecial++;
		}
		
		return newPaciente;
	}
	
	public Object remove() {
		return null;
	}
	
	public Object espiona() {
		return null;
	}
}