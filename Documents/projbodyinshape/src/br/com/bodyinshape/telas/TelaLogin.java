package br.com.bodyinshape.telas;

import java.sql.*;
import br.com.bodyinshape.conexao.Moduloconexao; //Importação para chamar a tela Modulo de conexão com o banco de daos
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null; //chamando variavel conexao com valor nulo
    PreparedStatement pst = null; //criando variavél pst para manipulaçao instrução SQL
    ResultSet rs = null; //exibe resultado das instruções SQL

    //  A linha abaixo exibe o método logar
    public void logar() {
        // variavel sql executa a instrucao sql através da pesquisa no banco de dados usuario e senha de login
        String sql = " select * from tbusuarios where login=? and senha= ?"; //Linha seleciona do banco de dados login e senha
        

        try {

            pst = conexao.prepareStatement(sql);//A variavel pst(PreparedStatement) prepara a consulta ao banco de dados
            pst.setString(1, txtUsuario.getText()); //obtemos o que é digitado no campo txtusuário
            pst.setString(2, txtSenha.getText()); //obtemos o que é digitado no campo txtSenha , porem com a senha escondida/mascarada
            rs = pst.executeQuery(); //executa a Query,pesquisando no banco de dados

            if (rs.next()) { //Caso exista usuário e senha liberar a tela principal
                String perfil = rs.getString(6); // faz a leitura da coluna de 
                System.out.println(perfil);
                //A linha abaixo trata o perfil do usuário

                if (perfil.equals("admin")) { // Se o acesso for do administrador, deixe disponível todas as telas
                    Telaprincipal principal = new Telaprincipal(); //Classe Tela principal instancia/cria o objeto principal
                    principal.setVisible(true); // Abrindo tela principal(tela cadastro cliente/ cadastro usuario)
                    Telaprincipal.MenRelatorio.setEnabled(true);
                    Telaprincipal.MenCadUsu.setEnabled(true);
                    Telaprincipal.lblUsuario.setText(rs.getString(2));
                    Telaprincipal.lblUsuario.setForeground(Color.red);
                    this.dispose();
                  } 
                
                else {
                    Telaprincipal principal = new Telaprincipal();  
                    principal.setVisible(true);
                    Telaprincipal.lblUsuario.setText(rs.getString(2));
                    this.dispose();  
                }

            } else { // caso contrário exibir mensagem de erro ao usuário
                JOptionPane.showMessageDialog(null, "usuario ou senha inválido(s)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);// exibe o motivo do erro/problema
        }
    }

    public TelaLogin() {
        initComponents(); //Iniciando os componentes para conexão com o banco
        conexao = Moduloconexao.conector();

        //System.out.println(conexao); ->Linha de apoio para informar status da conexão
        if (conexao != null) {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/cumprimento.png")));

        } else {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/atencao.png")));
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimeiraTela = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnPrimeiroCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Body in shape- Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrimeiraTela.setBackground(new java.awt.Color(0, 0, 0));
        PrimeiraTela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrimeiraTela.setPreferredSize(new java.awt.Dimension(700, 500));
        PrimeiraTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        PrimeiraTela.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 30));
        PrimeiraTela.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 300, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Senha");
        PrimeiraTela.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 20));
        PrimeiraTela.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 300, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Usuário");
        PrimeiraTela.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("ENTRE");
        PrimeiraTela.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("BODY IN SHAPE");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BODY IN SHAPE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        PrimeiraTela.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 700, 70));

        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bodyinshape/icones/atencao.png"))); // NOI18N
        PrimeiraTela.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 100, 120));

        btnPrimeiroCadastro.setText("Cadastrar");
        btnPrimeiroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroCadastroActionPerformed(evt);
            }
        });
        PrimeiraTela.add(btnPrimeiroCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 30));

        getContentPane().add(PrimeiraTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 700, 500));

        setSize(new java.awt.Dimension(712, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // A linha abaixo é acionada quando clicado no botão login
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        logar(); // chamamos o método logar

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPrimeiroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroCadastroActionPerformed
        // TODO add your handling code here:
      
      TelaCliente cliente = new TelaCliente();
      cliente.setVisible(true);
      PrimeiraTela.add(cliente);
        
    }//GEN-LAST:event_btnPrimeiroCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrimeiraTela;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPrimeiroCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
