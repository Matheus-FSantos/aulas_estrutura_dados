package br.com.grafo.grafoapp.model;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;
    
    public Grafo(){
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }
    
    public ArrayList<T> buscaLargura(){
        ArrayList<Vertice<T>> marcados = new ArrayList<>();
        ArrayList<Vertice<T>> fila = new ArrayList<>();
        ArrayList<T> dados = new ArrayList<>();
        
        Vertice<T> atual = this.vertices.get(0);
        
        
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        
        while(fila.size() > 0){
            Vertice<T> visitado = fila.get(0);
            for(int i = 0; i < visitado.getArestasSaida().size(); i++){
                Vertice<T> proximo = visitado.getArestasSaida().get(i).getFim();
                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
        }
        
        fila.remove(0);
        
        return null;
    }
    
    public ArrayList<T>  busca(T dado){
        Vertice<T> vertice = this.getVertice(dado);
        ArrayList<Aresta<T>> saida = vertice.getArestasSaida();
        
        ArrayList<T> seguindo = new ArrayList<>();
        
        for(Aresta<T> elemento : saida){
            if(elemento.getFim().getDado() != null){
                seguindo.add(elemento.getFim().getDado());
            }
        }
        
        return seguindo;
    }
    
    public void addVertice(T dado){
        Vertice<T> newVertice = new Vertice<>(dado);
        this.vertices.add(newVertice);
        
    }
    
    public void addAresta(Double peso, T dadoInicio, T dadoFim){
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);
        Aresta<T> aresta = new Aresta<>(peso, inicio, fim);
        
        inicio.addArestaSaida(aresta);
        fim.addArestaEntrada(aresta);
    }
    
    public Vertice<T> getVertice(T dado){
        Vertice<T> vertice = null;
        
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        
        return vertice;
    }

    public ArrayList<Vertice<T>> getVertices() {
        return vertices;
    }

    public ArrayList<Aresta<T>> getArestas() {
        return arestas;
    }
}