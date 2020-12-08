/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bodyinshape.telas;

import java.sql.*;
import br.com.bodyinshape.conexao.Moduloconexao;
import javax.swing.JOptionPane;

public class TelaCliente extends javax.swing.JInternalFrame {

Connection conexao = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public TelaCliente() {
    initComponents();
    conexao =Moduloconexao.conector();
    }
    //Método para cadastrar cliente
     private void adicionar() { //Método sem retorno adicionar Cliente
        //A linha abaixo insere os dados na tabela
        String sql = " insert into tbcliente(nomecliente,cpf,telefonecliente,emailcliente,login,senha) values (?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCliNome.getText());
            pst.setString(2, txtClicpf.getText());
            pst.setString(3, txtClifone.getText());
            pst.setString(4, txtCliemail.getText());
            pst.setString(5, txtClilogin.getText() );
            pst.setString(6, txtClisenha.getText());
      
            
            //Valindando os campos obrigatórios
            if ((txtCliNome.getText().isEmpty()) || (txtClicpf.getText().isEmpty()) || (txtClifone.getText().isEmpty())||(txtCliemail.getText().isEmpty()) ||(txtClilogin.getText().isEmpty()) ||(txtClisenha.getText().isEmpty()))  {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");//Exibe a mensagem de procedimento realizado com sucesso

            } else {

                int adicionado = pst.executeUpdate(); //Atualiza no banco de dados o novo cadastro realizado 
                System.out.println(adicionado); // Exibe resultado/confirmação valor verdadeiro

                if (adicionado > 0) { //Se o conteúdo do adicionado for maior que zero
                    JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");//Exibe a mensagem de procedimento realizado com sucesso
                    txtCliNome.setText(null);
                    txtClicpf.setText(null);
                    txtClifone.setText(null);
                    txtCliemail.setText(null);
                    txtClilogin.setText(null);
                    txtClisenha.setText(null);
                    this.dispose();
                }
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
    }
     
     
      private void alterar (){ //Método alterar dados do cliente
    String sql ="update tbcliente set nomecliente = ?, cpf =? , telefonecliente = ?, emailcliente =?,senha =?, login=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCliNome.getText());
             pst.setString(2,txtClicpf.getText());
              pst.setString(3,txtClifone.getText());
               pst.setString(4,txtCliemail.getText());
               pst.setString(5,txtClisenha.getText());
               pst.setString(6,txtClilogin.getText());
              
                
                
                 if ((txtCliNome.getText().isEmpty()) || (txtClicpf.getText().isEmpty()) || (txtClifone.getText().isEmpty())||(txtCliemail.getText().isEmpty())||(txtClilogin.getText().isEmpty()) || (txtClisenha.getText().isEmpty()))  {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");//Exibe a mensagem de procedimento realizado com sucesso

            } else {

                int adicionado = pst.executeUpdate(); // Alterar os dados da tabela
                System.out.println(adicionado);   

                if (adicionado > 0) { //Se o conteúdo do adicionado for maior que zero
                    JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");//Exibe a mensagem de procedimento realizado com sucesso
                    txtCliNome.setText(null);
                    txtClicpf.setText(null);
                    txtClifone.setText(null);
                    txtCliemail.setText(null);
                    txtClisenha.setText(null);
                    txtClilogin.setText(null);
                     
                
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCliNome = new javax.swing.JTextField();
        txtClicpf = new javax.swing.JTextField();
        txtClifone = new javax.swing.JTextField();
        txtCliemail = new javax.swing.JTextField();
        txtClisenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncadastrar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        txtClilogin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdcliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(690, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCliNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 458, -1));
        getContentPane().add(txtClicpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 188, -1));
        getContentPane().add(txtClifone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 194, -1));
        getContentPane().add(txtCliemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 458, -1));
        getContentPane().add(txtClisenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 287, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("*Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("*CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 49, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*Telefone");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("*email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 55, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("*Senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 55, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("      CADASTRO CLIENTE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 250, 50));

        btncadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/adicionar-amigo.png"))); // NOI18N
        btncadastrar.setBorder(null);
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 80, 60));

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/troca.png"))); // NOI18N
        btnsalvar.setBorder(null);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 70, 60));
        getContentPane().add(txtClilogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("*Login");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 20, 20));

        txtIdcliente.setEnabled(false);
        getContentPane().add(txtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("*Campo obrigatório");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/125-1257053_transparent-runner-silhouette-png-running-man-and-woman.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 720, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // Método cadastrar cliente
         adicionar();
                
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
       //Método para alterar dados do cliente
       alterar();
    }//GEN-LAST:event_btnsalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtClicpf;
    private javax.swing.JTextField txtCliemail;
    private javax.swing.JTextField txtClifone;
    private javax.swing.JTextField txtClilogin;
    private javax.swing.JTextField txtClisenha;
    private javax.swing.JTextField txtIdcliente;
    // End of variables declaration//GEN-END:variables
}

