/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane; 
import javax.swing.filechooser.FileNameExtensionFilter;
// imports necessários


public class Index extends javax.swing.JFrame {

  
    public Index() {
        initComponents();
    }
 static int cod;
 static String nom;
 static String end;
 static String compl;
 static String resp1;
 static String resp2;
 static String sexo;
 static String prof;
 static String obs;

  String url = "jdbc:mysql://localhost/escola"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nome1 = new javax.swing.JTextField();
        matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        responsavel1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        responsavel2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        professor = new javax.swing.JTextField();
        complemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        observacao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nome7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        nome8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nome9 = new javax.swing.JTextField();
        nome10 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        endereco1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        endereco2 = new javax.swing.JTextField();
        complemento3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nome11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lblImage2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nome2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nome3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nome4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nome5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(nome1);
        nome1.setBounds(110, 50, 320, 22);
        jPanel1.add(matricula);
        matricula.setBounds(110, 100, 120, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº Matricula");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 80, 211, 17);
        jPanel1.add(endereco);
        endereco.setBounds(110, 150, 211, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 130, 211, 17);
        jPanel1.add(responsavel1);
        responsavel1.setBounds(110, 200, 320, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome 1º responsavel ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 180, 211, 17);

        responsavel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsavel2ActionPerformed(evt);
            }
        });
        jPanel1.add(responsavel2);
        responsavel2.setBounds(110, 250, 320, 20);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 211, 0);

        tfSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSexoActionPerformed(evt);
            }
        });
        jPanel1.add(tfSexo);
        tfSexo.setBounds(110, 300, 174, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 280, 211, 20);
        jPanel1.add(professor);
        professor.setBounds(110, 350, 320, 20);

        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoActionPerformed(evt);
            }
        });
        jPanel1.add(complemento);
        complemento.setBounds(330, 150, 100, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Complemento");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 130, 211, 20);

        observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacaoActionPerformed(evt);
            }
        });
        jPanel1.add(observacao);
        observacao.setBounds(450, 240, 200, 130);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Enviar foto 3x4 ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 140, 130, 25);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/59170.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(560, 40, 100, 100);

        jButton1.setText("Anexar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(570, 170, 90, 22);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Observações");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(450, 220, 211, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome 2º responsavel ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 230, 211, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nome completo");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(110, 30, 211, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome do professor");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(110, 330, 211, 17);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 393, 100, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroundAluno.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 740, 440);

        jTabbedPane1.addTab("Aluno", jPanel1);

        jPanel2.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Nome completo");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(30, 20, 211, 17);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Codigo");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(30, 70, 211, 17);
        jPanel2.add(nome7);
        nome7.setBounds(30, 140, 320, 22);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Email");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(30, 120, 211, 17);
        jPanel2.add(nome8);
        nome8.setBounds(30, 40, 320, 22);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Celular (whatsapp)");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(30, 270, 211, 17);
        jPanel2.add(nome9);
        nome9.setBounds(30, 290, 320, 22);
        jPanel2.add(nome10);
        nome10.setBounds(30, 340, 320, 22);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setText("Voce é Pai, Mãe ou Responsavel");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(30, 320, 270, 17);
        jPanel2.add(endereco1);
        endereco1.setBounds(30, 90, 130, 22);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Endereço");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(30, 170, 211, 17);
        jPanel2.add(endereco2);
        endereco2.setBounds(30, 190, 211, 22);

        complemento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complemento3ActionPerformed(evt);
            }
        });
        jPanel2.add(complemento3);
        complemento3.setBounds(250, 190, 100, 22);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setText("Anexar comprovante de residência ");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(30, 370, 280, 20);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Complemento");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(250, 170, 110, 20);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Telefone");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(30, 220, 211, 20);
        jPanel2.add(nome11);
        nome11.setBounds(30, 240, 320, 20);

        jButton3.setText("Anexar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 390, 73, 22);
        jPanel2.add(lblImage2);
        lblImage2.setBounds(410, 40, 140, 290);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroundResponsavel.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 730, 441);

        jTabbedPane1.addTab("Responsaveis", jPanel2);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nome completo");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Codigo");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Celular");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGap(3, 3, 3)
                .addComponent(nome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(3, 3, 3)
                .addComponent(nome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(3, 3, 3)
                .addComponent(nome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(nome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Professores", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void observacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        int retorno = file.showOpenDialog(this);
        file.setDialogTitle("Selecione a imagem");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "png", "jpg", "jpeg");
        file.setFileFilter(filter);
        
        
        if (retorno == JFileChooser.APPROVE_OPTION){
            File file1 = file.getSelectedFile();
            jLabel11.setVisible(false);
            panelImage1.setIcon(new ImageIcon(file1.getPath()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoActionPerformed

    private void responsavel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsavel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsavel2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       nom = nome1.getText(); // recebendo o nome
       cod = Integer.parseInt(matricula.getText()); // recebendo o email
       end = endereco.getText();
       compl = complemento.getText();
       resp1 = responsavel1.getText();
       resp2= responsavel2.getText();
       prof = professor.getText();
       sexo = tfSexo.getText();
       obs = observacao.getText();
      
  

       //BD.carregaDriver();
             
  

       //BD.carregaDriver();
       
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);

            
                   }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO alunos(alu_cod,alu_nome,alu_end, alu_end_num, alu_pai, alu_mae, alu_obs, alu_sexo, alu_prof) values('"+cod+"','"+nom+"','"+end+"','"+compl+"','"+resp1+"','"+resp2+"','"+obs+"','"+sexo+"','"+prof+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome1.setText("");
                endereco.setText("");
                responsavel1.setText("");
                responsavel2.setText("");
                tfSexo.setText("");
                complemento.setText("");
                matricula.setText("");
                observacao.setText("");
                professor.setText("");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            
        }

       
              

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSexoActionPerformed

    private void complemento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complemento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complemento3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JFileChooser file = new JFileChooser();
        int retorno = file.showOpenDialog(this);
        file.setDialogTitle("Selecione a imagem");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "png", "jpg", "jpeg");
        file.setFileFilter(filter);
        
        
        if (retorno == JFileChooser.APPROVE_OPTION){
            File file1 = file.getSelectedFile();
            jLabel11.setVisible(false);
            lblImage2.setIcon(new ImageIcon(file1.getPath()));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField complemento3;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField endereco1;
    private javax.swing.JTextField endereco2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nome1;
    private javax.swing.JTextField nome10;
    private javax.swing.JTextField nome11;
    private javax.swing.JTextField nome2;
    private javax.swing.JTextField nome3;
    private javax.swing.JTextField nome4;
    private javax.swing.JTextField nome5;
    private javax.swing.JTextField nome7;
    private javax.swing.JTextField nome8;
    private javax.swing.JTextField nome9;
    private javax.swing.JTextField observacao;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField professor;
    private javax.swing.JTextField responsavel1;
    private javax.swing.JTextField responsavel2;
    private javax.swing.JTextField tfSexo;
    // End of variables declaration//GEN-END:variables
}
