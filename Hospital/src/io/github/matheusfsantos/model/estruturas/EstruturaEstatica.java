package io.github.matheusfsantos.model.estruturas;

public class EstruturaEstatica {
	private Object[] array;
	private Integer tamanho;
	
	public EstruturaEstatica() {
		this(5);
	}
	
	public EstruturaEstatica(Integer capacidade) {
		this.array = new Object[capacidade];
		this.tamanho = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			string.append(this.array[i]);
			string.append(", ");
		}
		
		if(this.tamanho > 0) {
			string.append(this.array[this.tamanho - 1]);
		}
		
		string.append("]");
		
		return string.toString();
	}
	
	public Object adiciona(Object paciente) {
		if(tamanho + 1 != array.length) {
			array[tamanho] = paciente;
			tamanho++;
		
			return paciente;
		} else {
			aumentaCapacidade();
			
			return adiciona(paciente);
		}
	}
	
	public Object adiciona(Integer posicao, Object paciente) {
		if(!(posicao >= 0 && posicao < tamanho))
			throw new IllegalArgumentException("É Impossivel adicionar um paciente a essa posicao, a posição é inválida!");
		
		if(tamanho + 1 != array.length) {
			for(int i = this.tamanho - 1; i >= posicao; i--) {
				this.array[i + 1] = this.array[i];
			}
			
			array[posicao] = paciente;
			tamanho++;
			
			return paciente;
		} else {
			aumentaCapacidade();
			
			return adiciona(posicao, paciente);
		}
	}
	
	public Object remove(Integer posicao) {
		if(!(posicao >= 0 || posicao < tamanho))
			throw new IllegalArgumentException("É Impossivel remover um paciente nessa posicao, a posição é inválida!");
		
		Object paciente =  array[posicao];
		
		for(int i = posicao; i < tamanho; i++) {
			array[i] = array[i + 1];
		}
		
		tamanho--;
		
		return paciente;
	}
	
	public Boolean isEmpty() {
		if(tamanho != 0)
			return false;
		
		return true;
	}
	
	public void aumentaCapacidade() {
		Object[] copia = array;
		Integer tamanho = 0;
		array = new Object[copia.length * 2];
		
		for(Object dados : copia) {
			if(dados != null) {
				array[tamanho] = dados;
				tamanho++;
			}
		}
	}
	
	public Object[] getArray() {
		return array;
	}
}
