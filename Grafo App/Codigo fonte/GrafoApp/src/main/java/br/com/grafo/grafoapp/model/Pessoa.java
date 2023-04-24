package br.com.grafo.grafoapp.model;

import java.util.Objects;

public class Pessoa {
    
    private static Integer increment = 0;
    
    private Integer id;
    private String nome;
    private String mail;

    public Pessoa (String nome, String mail){
        Pessoa.increment = Pessoa.increment + 1;
        this.id = increment;
        
        this.nome = nome;
        this.mail = mail;
    }
    
    public Pessoa(String nome){
        this.id = 0;
        this.nome = nome;
        this.mail = "";
    }
    
    @Override
    public String toString(){
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void updateId(Integer id){
        this.setId(id);
    }
    
    private void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void updateNome(String nome){
        this.setNome(nome);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }
    
    public void updateMail(String mail){
        this.setMail(mail);
    }

    private void setMail(String mail) {
        this.mail = mail;
    }
}