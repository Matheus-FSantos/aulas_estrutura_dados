package br.com.grafo.grafoapp.view;

import br.com.grafo.grafoapp.model.Grafo;
import br.com.grafo.grafoapp.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    private Grafo<Pessoa> grafo;
    private ArrayList<Pessoa> pessoas;
    
    public Home() {
        initComponents();
        
        grafo = new Grafo<>();
        pessoas = new ArrayList<>();
        
        this.injetaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        applicationName = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        subtitle = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jTablePessoas = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph Application");
        setResizable(false);

        Right.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/matheus/Área de Trabalho/graph_resized.png")); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Header.setBackground(new java.awt.Color(0, 0, 204));
        Header.setToolTipText("");

        Title.setFont(new java.awt.Font("Lohit Devanagari", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("4Graph");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        applicationName.setBackground(new java.awt.Color(204, 204, 204));
        applicationName.setFont(new java.awt.Font("URW Gothic", 0, 15)); // NOI18N
        applicationName.setForeground(new java.awt.Color(255, 255, 255));
        applicationName.setText("Graph Application");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(121, 121, 121)
                .addComponent(applicationName)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(applicationName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subtitle.setFont(new java.awt.Font("URW Gothic", 0, 15)); // NOI18N
        subtitle.setText("Select...");

        comboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        confirmButton.setBackground(new java.awt.Color(204, 204, 255));
        confirmButton.setText("Confirm");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 255));
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Mail", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePessoas.setViewportView(jTable);

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTablePessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTablePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboBoxAncestorAdded
        comboBox.removeAll();
        
        for(Pessoa p : pessoas){
            comboBox.addItem(p.toString());
        }
    }//GEN-LAST:event_comboBoxAncestorAdded

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        String name = this.comboBox.getSelectedItem().toString();
        
        
        JOptionPane.showMessageDialog(null, "A tabela abaixo irá mostrar todas as pessoas que " + name + " segue", "Sucess!", JOptionPane.INFORMATION_MESSAGE);
        
        ArrayList<Pessoa> seguindo = this.grafo.busca(new Pessoa(name));
        
        this.populaTabela(seguindo);
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        this.limparTabela();
    }//GEN-LAST:event_clearButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel applicationName;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable;
    private javax.swing.JScrollPane jTablePessoas;
    private javax.swing.JLabel subtitle;
    // End of variables declaration//GEN-END:variables
    
    private void injetaDados() {
        Pessoa p1 = new Pessoa("Matheus", "matheus.fs.contato@gmail.com");
        Pessoa p2 = new Pessoa("Joca", "joca@gmail.com");
        Pessoa p3 = new Pessoa("Antonio", "antonio@gmail.com");
        Pessoa p4 = new Pessoa("Rafaela", "rafaela@gmail.com");
        Pessoa p5 = new Pessoa("Pedro", "antonio@gmail.com");
        Pessoa p6 = new Pessoa("Fernanda", "antonio@gmail.com");
        Pessoa p7 = new Pessoa("Paula", "antonio@gmail.com");
        Pessoa p8 = new Pessoa("José", "antonio@gmail.com");
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        pessoas.add(p7);
        pessoas.add(p8);
        
        grafo.addVertice(p1);
        grafo.addVertice(p2);
        grafo.addVertice(p3);
        grafo.addVertice(p4);
        grafo.addVertice(p5);
        grafo.addVertice(p6);
        grafo.addVertice(p7);
        grafo.addVertice(p8);
        
        grafo.addAresta(2.0, p1, p2);
        grafo.addAresta(3.0, p1, p3);
        grafo.addAresta(3.0, p1, p4);
        grafo.addAresta(3.0, p1, p5);
        grafo.addAresta(3.0, p1, p6);
        grafo.addAresta(3.0, p1, p7);
        
        grafo.addAresta(1.0, p2, p3);
        grafo.addAresta(1.0, p2, p1);
        grafo.addAresta(4.0, p2, p8);
        grafo.addAresta(1.0, p2, p7);
        
        grafo.addAresta(1.0, p3, p4);
        grafo.addAresta(2.0, p3, p1);
        grafo.addAresta(1.0, p3, p2);
        
        grafo.addAresta(2.0, p4, p3);
        grafo.addAresta(3.0, p4, p1);
        
        grafo.addAresta(2.0, p5, p4);
        grafo.addAresta(3.0, p5, p2);
        grafo.addAresta(3.0, p5, p3);
        grafo.addAresta(3.0, p5, p1);
        
        
        grafo.addAresta(3.0, p6, p2);
        grafo.addAresta(1.0, p6, p8);
        grafo.addAresta(1.0, p6, p7);
        
        
        grafo.addAresta(1.0, p8, p6);
        grafo.addAresta(3.0, p8, p7);
        grafo.addAresta(4.0, p8, p3);
        grafo.addAresta(1.0, p8, p2);
    }

    private void populaTabela(ArrayList<Pessoa> seguindo) {
        this.limparTabela();
        
        DefaultTableModel tabelaPessoas = (DefaultTableModel) jTable.getModel();
        
        for(Pessoa p : seguindo){
            Object[] dados = {p.getId(), p.getNome(), p.getMail()};
            tabelaPessoas.addRow(dados);
        }
    }

    private void limparTabela() {
        DefaultTableModel tabelaPessoas = (DefaultTableModel) jTable.getModel();
        
        Integer number = tabelaPessoas.getRowCount();
        
        if(number > 0){
            for(int i = 0; i < number; i++){
                tabelaPessoas.removeRow(0);
            }
        }
    }
}
