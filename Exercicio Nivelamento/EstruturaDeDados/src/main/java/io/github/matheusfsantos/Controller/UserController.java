package io.github.matheusfsantos.Controller;

import io.github.matheusfsantos.Model.BancoDados;
import io.github.matheusfsantos.Model.User;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class UserController {
    
    private static BancoDados bancoDados = null;
    private TabelaController tabelaController = null;    

    public UserController(BancoDados bancoDados){
        UserController.bancoDados = bancoDados;
        tabelaController = new TabelaController(bancoDados);
    }
    
    
    /*
        Método para adiciona um usuário no sistema (porém antes realiza uma validação dos campos)
    */
    public void adiciona(User user) throws Exception {
        try {
            validaUsuario(user.getNome(), user.getSenha());
        
            bancoDados.adiciona(user);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    
    /*
        Método para adiciona um usuário no sistema dentro da tela principal
    */
    public void adiciona(JTable tabela, User user) throws Exception {
        try {
            validaUsuario(user.getNome(), user.getSenha());
        
            bancoDados.adiciona(user);
            tabelaController.atualizarTabela(tabela, user);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    
    /*
        Método para editar uma linha
    */
    public void editar(JTable tabela, Integer indice, User user){
        bancoDados.editar(indice, user);
        tabelaController.atualizarTabela(tabela);
    }
    
    /*
        Método para remover um usuário do sistema
    */
    public void remover(JTable tabela, Integer indice){
        bancoDados.remover(indice);
        tabelaController.atualizarTabela(tabela);
    }
    
    
    /*
        Método para listar os usuários do sistema
    */
    public void listar(){
        JOptionPane.showMessageDialog(null, bancoDados.getDados(), "Dados cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    /*
        Método para logar no sistema
    */
    public void logar(User user) throws Exception {
        User usuarios [] = bancoDados.listar();
        
        for(User usuario : usuarios){
            if(usuario != null){
                if(usuario.getNome().equals(user.getNome()) && usuario.getSenha().equals(user.getSenha())){
                    JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
        
        throw new Exception("Usuário não encontrado no banco de dados");
    }
    
    
    /*
        Método para validar um usuário, caso esteja fora dos padrões, retornará uma exception
    */
    public void validaUsuario(String nome, String senha) throws Exception {
        if(nome == null || nome.equals("") || nome.length() < 3){
            throw new Exception("O campo nome deve conter pelo menos 4 caracteres");
        } else if(senha == null || senha.equals("") || senha.length() < 3){
            throw new Exception("O campo senha deve conter pelo menos 4 caracteres");
        }
    }
}