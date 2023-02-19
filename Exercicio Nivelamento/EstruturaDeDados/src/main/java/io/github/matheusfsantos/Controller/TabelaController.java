package io.github.matheusfsantos.Controller;

import io.github.matheusfsantos.Model.BancoDados;
import io.github.matheusfsantos.Model.User;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaController {
    
    private static BancoDados bancoDados;
    private static Integer id = 0;
    
    public TabelaController(){}
    
    public TabelaController(BancoDados bancoDados){
        TabelaController.bancoDados = bancoDados;
    }
    
    /*
        Método que popula a tabela da pagina principal
    */
    public void criarTabela(JTable tabela){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        
        User usuarios [] = bancoDados.listar();
        
        for(User usuario: usuarios){
            if(usuario != null) {
                Object objeto[] = {(id + 1), usuario.getNome(), usuario.getSenhaMod()};
            
                modelo.addRow(objeto);
                id++;
            }
        }
    }
    
    
    /*
        Método para atualizar uma tabela apos inserção
    */
    public void atualizarTabela(JTable tabela, User user) {
       DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
       
       Object objeto[] = {(id + 1), user.getNome(), user.getSenhaMod()};
       modelo.addRow(objeto);
       
       id++; 
    }
    
    
    /*
        Método para atualizar uma tabela apos remoção
    */
    public void atualizarTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        removerLinhas(tabela);
        User usuarios [] = bancoDados.listar();

        id = 0;

        for(User usuario: usuarios){
            if(usuario != null){
                Object objeto[] = {(id + 1), usuario.getNome(), usuario.getSenhaMod()};
                modelo.addRow(objeto);
                        
                id++;
            }
        } 
    }
    
    /*
        Método privado para limpar todas as linhas da tabela
        serve para atualizar a tabela de uma maneira forçada
        após uma exclusão de dados
    */
    private void removerLinhas(JTable tabela) {
        while(tabela.getModel().getRowCount() > 0){
            ((DefaultTableModel) tabela.getModel()).removeRow(0);
        }
    }
}