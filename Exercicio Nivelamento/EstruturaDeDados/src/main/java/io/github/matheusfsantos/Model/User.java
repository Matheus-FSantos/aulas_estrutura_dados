package io.github.matheusfsantos.Model;

public class User {
    private String nome;
    private String senha;
    
    public User(){
        
    }
    
    public User(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    public String toString(){
        return "Nome: " + this.getNome() + 
                "\nSenha: " + this.getSenha();
    }
    
    public void updateNome(String nome){
        this.setNome(nome);
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void updateSenha(String senha){
        this.setSenha(senha);
    }
    
    private void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    /*
        Gere uma senha modificada para cada usuário
    */
    public String getSenhaMod(){
        String senhaMod = "";
        
        for(int i = 0; i < 3; i++){
            senhaMod = senhaMod + "*";
        }
        
        senhaMod = senhaMod + (this.getSenha().substring(this.getSenha().length() - 2, this.getSenha().length()));
        
        return senhaMod;
    }
}