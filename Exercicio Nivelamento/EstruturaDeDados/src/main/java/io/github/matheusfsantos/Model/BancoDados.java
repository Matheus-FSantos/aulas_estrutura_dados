package io.github.matheusfsantos.Model;

import java.util.Arrays;

public class BancoDados {
    private static User[] dados = null;
    private static Integer tamanho = 0;
    
    public BancoDados(Integer capacidade){
        dados = new User[capacidade];
        tamanho = 0;
    }
    
    public void adiciona(User user) throws Exception {
        if(this.getTamanho() != dados.length){
            dados[tamanho] = user;
            setTamanho(getTamanho() + 1);
        } else  
            throw new Exception("O vetor está cheio");
    }
    
    public void editar(Integer indice, User user){
        dados[indice] = user;
    }
    
    public void remover(Integer indice){
        for(int i = indice; i < dados.length; i++){
            if(dados[i] != null){
                dados[i] = dados[i + 1];
            }
        }
    }

    public User[] listar(){
        return dados;
    }
    
    public String getDados() {
        return Arrays.toString(dados);
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
}
