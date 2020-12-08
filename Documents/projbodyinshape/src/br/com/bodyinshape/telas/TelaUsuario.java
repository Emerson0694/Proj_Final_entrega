/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bodyinshape.telas;

import java.sql.*;
import br.com.bodyinshape.conexao.Moduloconexao;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null; //chamando variavel conexao com valor nulo
    PreparedStatement pst = null; //criando variavél pst para manipulaçao instrução SQL
    ResultSet rs = null; //exibe resultado das instruções SQL

    public TelaUsuario() { //Construtor para iniciar módulo de conexão
        initComponents(); //Instanciando módulo de conexão
        conexao = Moduloconexao.conector(); //Chamando módulo de conexão
    }

    private void consultar() {// Método consultar sem retorno
        String sql = "select * from tbusuarios where iduser = ?"; //Variável sql armazema o resultado da consulta
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuId.getText()); // substitui o valor pelo ?
            rs = pst.executeQuery();
            if (rs.next()) {
                txtUsuNome.setText(rs.getString(2));//Puxa da tabela banco de dados o id
                txtUsuLogin.setText(rs.getString(3));
                txtUsuSenha.setText(rs.getString(4));
                txtUsuFone.setText(rs.getString(5));
                cboUsuPerfil.setSelectedItem(rs.getString(6));//Combobox da tabela usuário

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                txtUsuNome.setText(null);
                txtUsuLogin.setText(null);
                txtUsuSenha.setText(null);
                txtUsuFone.setText(null);
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void adicionar() { //Método sem retorno adicionar usuários
        //A linha abaixo insere os dados na tabela
        String sql = " insert into tbusuarios(iduser,usuario,telefone,login,senha,perfil) values (?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuId.getText());
            pst.setString(2, txtUsuNome.getText());
            pst.setString(3, txtUsuFone.getText());
            pst.setString(4, txtUsuLogin.getText());
            pst.setString(5, txtUsuSenha.getText());
            pst.setString(6, cboUsuPerfil.getSelectedItem().toString());//Combobox convertido para string

            //Valindando os campos obrigatórios
            if ((txtUsuId.getText().isEmpty()) || (txtUsuNome.getText().isEmpty()) || (txtUsuLogin.getText().isEmpty())||(txtUsuSenha.getText().isEmpty()))  {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");//Exibe a mensagem de procedimento realizado com sucesso

            } else {

                int adicionado = pst.executeUpdate(); //Atualiza no banco de dados o novo cadastro realizado 
                System.out.println(adicionado); // Exibe resultado/confirmação valor verdadeiro

                if (adicionado > 0) { //Se o conteúdo do adicionado for maior que zero
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");//Exibe a mensagem de procedimento realizado com sucesso
                    txtUsuId.setText(null);
                    txtUsuNome.setText(null);
                    txtUsuLogin.setText(null);
                    txtUsuSenha.setText(null);
                    txtUsuFone.setText(null);
                
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void alterar (){ //Método alterar dados do usuário
    String sql ="update tbusuarios set usuario = ?, telefone =? , login = ?, senha =?, perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuNome.getText());
             pst.setString(2,txtUsuFone.getText());
              pst.setString(3,txtUsuLogin.getText());
               pst.setString(4,txtUsuSenha.getText());
               pst.setString(5,cboUsuPerfil.getSelectedItem().toString());
                pst.setString(6,txtUsuId.getText());
                
                 if ((txtUsuId.getText().isEmpty()) || (txtUsuNome.getText().isEmpty()) || (txtUsuLogin.getText().isEmpty())||(txtUsuSenha.getText().isEmpty()))  {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");//Exibe a mensagem de procedimento realizado com sucesso

            } else {

                int adicionado = pst.executeUpdate(); // Alterar os dados da tabela
                System.out.println(adicionado);   

                if (adicionado > 0) { //Se o conteúdo do adicionado for maior que zero
                    JOptionPane.showMessageDialog(null, "Dados do usuário alterado com sucesso");//Exibe a mensagem de procedimento realizado com sucesso
                    txtUsuId.setText(null);
                    txtUsuNome.setText(null);
                    txtUsuLogin.setText(null);
                    txtUsuSenha.setText(null);
                    txtUsuFone.setText(null);
                
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void remover (){ //Método de remoção dos dados do usuário
    int confirma= JOptionPane.showConfirmDialog(null,"Confirma a remoção ?","Atencao",JOptionPane.YES_NO_OPTION);
    if(confirma==JOptionPane.YES_OPTION){
       String sql ="delete from tbusuarios where iduser =?";
         try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuId.getText());
            int apagado = pst.executeUpdate();
            if(apagado > 0){ 
            JOptionPane.showMessageDialog(null,"Usuário removio");
                    txtUsuId.setText(null);
                    txtUsuNome.setText(null);
                    txtUsuLogin.setText(null);
                    txtUsuSenha.setText(null);
                    txtUsuFone.setText(null);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuId = new java.awt.TextField();
        txtUsuSenha = new java.awt.TextField();
        txtUsuNome = new java.awt.TextField();
        txtUsuLogin = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboUsuPerfil = new javax.swing.JComboBox<>();
        txtUsuFone = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        btnUsuCreate = new javax.swing.JButton();
        btnUsuRead = new javax.swing.JButton();
        btnUsuUpdate = new javax.swing.JButton();
        btnUsuDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(690, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, -1));
        getContentPane().add(txtUsuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 284, -1));
        getContentPane().add(txtUsuNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 284, -1));
        getContentPane().add(txtUsuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 284, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("*Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("*Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 40, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("*Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("*Perfil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 30, 20));

        cboUsuPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "usuário" }));
        getContentPane().add(cboUsuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, -1));

        txtUsuFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuFoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 140, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("*Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        btnUsuCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/adicionar.png"))); // NOI18N
        btnUsuCreate.setToolTipText("Adicionar");
        btnUsuCreate.setBorder(null);
        btnUsuCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuCreate.setPreferredSize(new java.awt.Dimension(64, 64));
        btnUsuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, 70));

        btnUsuRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/pesquisa.png"))); // NOI18N
        btnUsuRead.setToolTipText("Consultar");
        btnUsuRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuRead.setPreferredSize(new java.awt.Dimension(64, 64));
        btnUsuRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuReadActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 70));

        btnUsuUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/salve.png"))); // NOI18N
        btnUsuUpdate.setToolTipText("Atualizar");
        btnUsuUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuUpdate.setPreferredSize(new java.awt.Dimension(64, 64));
        btnUsuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 70));

        btnUsuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/lixo.png"))); // NOI18N
        btnUsuDelete.setToolTipText("Excluir");
        btnUsuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuDelete.setPreferredSize(new java.awt.Dimension(64, 64));
        btnUsuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 90, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("FORMULÁRIO CADASTRO DE USUÁRIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 300, 30));

        jLabel8.setText("*Campos obrigatórios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 210, 20));

        setBounds(0, 0, 690, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuFoneActionPerformed

    private void btnUsuReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuReadActionPerformed
        // Botão que chama o método consultar
        consultar();

    }//GEN-LAST:event_btnUsuReadActionPerformed

    private void btnUsuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCreateActionPerformed
        //Botão chama o método adicionar
        adicionar();
    }//GEN-LAST:event_btnUsuCreateActionPerformed

    private void btnUsuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuUpdateActionPerformed
        alterar(); //Chamamos o método/botão alterar
    }//GEN-LAST:event_btnUsuUpdateActionPerformed

    private void btnUsuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuDeleteActionPerformed
        remover();
    }//GEN-LAST:event_btnUsuDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuCreate;
    private javax.swing.JButton btnUsuDelete;
    private javax.swing.JButton btnUsuRead;
    private javax.swing.JButton btnUsuUpdate;
    private javax.swing.JComboBox<String> cboUsuPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.TextField txtUsuFone;
    private java.awt.TextField txtUsuId;
    private java.awt.TextField txtUsuLogin;
    private java.awt.TextField txtUsuNome;
    private java.awt.TextField txtUsuSenha;
    // End of variables declaration//GEN-END:variables
}
