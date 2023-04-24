package br.com.grafo.grafoapp.test;

import br.com.grafo.grafoapp.model.Grafo;
import br.com.grafo.grafoapp.model.Pessoa;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Grafo<Pessoa> grafo = new Grafo<>();
        
        Pessoa p1 = new Pessoa("Matheus", "matheus.fs.contato@gmail.com");
        Pessoa p2 = new Pessoa("Joca", "joca@gmail.com");
        Pessoa p3 = new Pessoa("Antonio", "antonio@gmail.com");
        Pessoa p4 = new Pessoa("Rafaela", "rafaela@gmail.com");
        
        grafo.addVertice(p1);
        grafo.addVertice(p2);
        grafo.addVertice(p3);
        grafo.addVertice(p4);
        
        grafo.addAresta(2.0, p1, p2);
        grafo.addAresta(3.0, p1, p3);
        grafo.addAresta(3.0, p1, p4);
        grafo.addAresta(1.0, p2, p3);
        grafo.addAresta(1.0, p3, p4);
        grafo.addAresta(2.0, p4, p3);
        grafo.addAresta(3.0, p4, p1);
        
        grafo.buscaLargura();
    }
}