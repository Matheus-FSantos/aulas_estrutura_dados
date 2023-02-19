package io.github.matheusfsantos.View;

import io.github.matheusfsantos.Controller.UserController;
import io.github.matheusfsantos.Model.User;
import io.github.matheusfsantos.Model.BancoDados;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistrarFrame extends javax.swing.JFrame {

    private UserController userController = null;
    private static BancoDados bancoDados = null;
    
    public RegistrarFrame() throws Exception {
        initComponents();
        bancoDados = new BancoDados(50);
        
        inserirDadosPadrao();
        
        userController = new UserController(bancoDados);
    }
    
    
    /*
        Método que insere alguns dados para o banco de dados
    */
    private void inserirDadosPadrao() throws Exception {
        bancoDados.adiciona(new User("TesteRoot", "admin"));
        bancoDados.adiciona(new User("Admin", "root"));
        bancoDados.adiciona(new User("Root", "teste"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esquerda = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        subtitulo_nome = new javax.swing.JLabel();
        input_nome = new javax.swing.JTextField();
        subtitulo_senha = new javax.swing.JLabel();
        input_senha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        subtitulo_redirect = new javax.swing.JLabel();
        subtitulo_entrar = new javax.swing.JLabel();
        direita = new javax.swing.JPanel();
        Duke = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        esquerda.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Suruma", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 204));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("SignIn Form");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subtitulo_nome.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        subtitulo_nome.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_nome.setText("Username");

        input_nome.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        subtitulo_senha.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        subtitulo_senha.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_senha.setText("Senha");

        input_senha.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        input_senha.setToolTipText("");

        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrar(evt);
            }
        });

        subtitulo_redirect.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        subtitulo_redirect.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_redirect.setText("Já possui login?");

        subtitulo_entrar.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        subtitulo_entrar.setForeground(new java.awt.Color(204, 255, 255));
        subtitulo_entrar.setText("Entre");
        subtitulo_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirecionamento(evt);
            }
        });

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subtitulo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtitulo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(input_nome)))
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(subtitulo_redirect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtitulo_entrar))))
                        .addGap(0, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(subtitulo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(subtitulo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitulo_redirect)
                    .addComponent(subtitulo_entrar))
                .addContainerGap())
        );

        Titulo.getAccessibleContext().setAccessibleDescription("Tela de login do sistema");

        direita.setBackground(new java.awt.Color(204, 204, 204));

        Duke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Duke.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://marcus-biel.com/wp-content/uploads/2017/06/cropped-java-craftsman-duke-300x300.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Duke, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Duke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /*
        Método para o botão de registrar
    */
    private void registrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrar
        User user = this.criarUser();
        
        try {
            userController.adiciona(user);
            
            this.dispose();
            new LoginFrame(bancoDados).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrar

    
    /*
        Método que faz o redirecionamento caso o usuário tenha login
    */
    private void redirecionamento(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirecionamento
        this.dispose();
        new LoginFrame(bancoDados).setVisible(true);
    }//GEN-LAST:event_redirecionamento

    /*
        Método para criar um usuário
    */
    private User criarUser(){
        User user = new User(input_nome.getText(), input_senha.getText());
        return user;
    }
    
    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrarFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(RegistrarFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Duke;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel direita;
    private javax.swing.JPanel esquerda;
    private javax.swing.JTextField input_nome;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel subtitulo_entrar;
    private javax.swing.JLabel subtitulo_nome;
    private javax.swing.JLabel subtitulo_redirect;
    private javax.swing.JLabel subtitulo_senha;
    // End of variables declaration//GEN-END:variables

}