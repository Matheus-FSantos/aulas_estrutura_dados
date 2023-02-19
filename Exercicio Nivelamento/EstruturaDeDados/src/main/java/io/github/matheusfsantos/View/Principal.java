package io.github.matheusfsantos.View;

import io.github.matheusfsantos.Controller.TabelaController;
import io.github.matheusfsantos.Controller.UserController;
import io.github.matheusfsantos.Model.User;
import io.github.matheusfsantos.Model.BancoDados;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private UserController userController = null;
    private TabelaController tabelaController = null;
    private static BancoDados bancoDados;
    
    
    public Principal(BancoDados bancoDados) {
        if(bancoDados != null) {
            initComponents();
            Principal.bancoDados = bancoDados;
            
            userController = new UserController(bancoDados);
            tabelaController = new TabelaController(bancoDados);
            
            tabelaController.criarTabela(tabela);
        } else {
            this.dispose();
            try {
                new RegistrarFrame().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cabecalho = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        input_nome = new javax.swing.JTextField();
        input_senha = new javax.swing.JPasswordField();
        subtitulo_nome = new javax.swing.JLabel();
        subtitulo_senha = new javax.swing.JLabel();
        criar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "Senha"
            }
        ));
        tabela.setToolTipText("");
        scrollpane.setViewportView(tabela);

        cabecalho.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("Lista de Usuários");

        javax.swing.GroupLayout cabecalhoLayout = new javax.swing.GroupLayout(cabecalho);
        cabecalho.setLayout(cabecalhoLayout);
        cabecalhoLayout.setHorizontalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        cabecalhoLayout.setVerticalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        input_nome.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        input_senha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        subtitulo_nome.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        subtitulo_nome.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_nome.setText("Informe um nome");

        subtitulo_senha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        subtitulo_senha.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_senha.setText("Informe um senha");

        criar.setText("Criar");
        criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarUsuario(evt);
            }
        });

        editar.setText("Editar");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarUsuario(evt);
            }
        });

        remover.setText("Remover");
        remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerUsuario(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparDados(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtitulo_nome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(criar)
                        .addGap(18, 18, 18)
                        .addComponent(editar)
                        .addGap(18, 18, 18)
                        .addComponent(remover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitulo_senha)
                    .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(limpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitulo_nome)
                    .addComponent(subtitulo_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criar)
                    .addComponent(editar)
                    .addComponent(limpar)
                    .addComponent(remover))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(cabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparDados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparDados
        limpar();
    }//GEN-LAST:event_limparDados

    private void criarUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarUsuario
        User user = criarUser();
        
        try {
            userController.adiciona(tabela, user);
            
            input_nome.setText("");
            input_senha.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_criarUsuario

    private void removerUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerUsuario
        if(tabela.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Para excluir um item, é necessário selecionar uma linha", "Erro!", JOptionPane.ERROR_MESSAGE);
        else { 
            userController.remover(tabela, tabela.getSelectedRow());
            limpar();
        }
    }//GEN-LAST:event_removerUsuario

    private void editarUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarUsuario
        User user = null;
        
        try {
            userController.validaUsuario(input_nome.getText(), input_senha.getText());
            user =  criarUser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        if(tabela.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Para editar um item, é necessário selecionar uma linha", "Erro!", JOptionPane.ERROR_MESSAGE);
        else { 
            userController.editar(tabela, tabela.getSelectedRow(), user);
            limpar();
        }
    }//GEN-LAST:event_editarUsuario
    
    private void limpar(){
        input_nome.setText("");
        input_senha.setText("");
    }
    
    private User criarUser() {
        User user = new User(input_nome.getText(), input_senha.getText());
        return user;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(bancoDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cabecalho;
    private javax.swing.JButton criar;
    private javax.swing.JButton editar;
    private javax.swing.JTextField input_nome;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton remover;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JLabel subtitulo_nome;
    private javax.swing.JLabel subtitulo_senha;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
