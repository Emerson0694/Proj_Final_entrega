# Proj_Final_entrega


public class CadastroProduto extends javax.swing.JFrame {

  
    public CadastroProduto() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Janela = new javax.swing.JPanel();
        CadastroProdutos = new javax.swing.JLabel();
        produtos = new javax.swing.JLabel();
        Produto = new javax.swing.JFormattedTextField();
        Tam = new javax.swing.JLabel();
        Tamanho = new javax.swing.JComboBox<>();
        descrição = new javax.swing.JLabel();
        descri = new javax.swing.JTextField();
        Fornecedor = new javax.swing.JLabel();
        Forncedor = new javax.swing.JTextField();
        Custo = new javax.swing.JLabel();
        custo = new javax.swing.JTextField();
        Venda = new javax.swing.JLabel();
        venda = new javax.swing.JTextField();
        ICMS = new javax.swing.JLabel();
        icms = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        NO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Janela.setBackground(new java.awt.Color(65, 65, 65));

        CadastroProdutos.setBackground(new java.awt.Color(65, 65, 65));
        CadastroProdutos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CadastroProdutos.setForeground(java.awt.SystemColor.text);
        CadastroProdutos.setText("                                                                       Produtos");

        produtos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        produtos.setText("  Produto:");

        Produto.setBackground(new java.awt.Color(200, 50, 50));
        Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoActionPerformed(evt);
            }
        });

        Tam.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Tam.setText("  Tamanho:");

        Tamanho.setBackground(new java.awt.Color(200, 50, 50));
        Tamanho.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       M", "       G" }));

        descrição.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        descrição.setText("Descrição:");

        descri.setBackground(new java.awt.Color(200, 50, 50));
        descri.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        descri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriActionPerformed(evt);
            }
        });

        Fornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Fornecedor.setText("Fornecedor:");

        Forncedor.setBackground(new java.awt.Color(200, 50, 50));
        Forncedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Forncedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForncedorActionPerformed(evt);
            }
        });

        Custo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Custo.setText("  Custo:");

        custo.setBackground(new java.awt.Color(200, 50, 50));
        custo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        Venda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Venda.setText("   Venda:");

        venda.setBackground(new java.awt.Color(200, 50, 50));
        venda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaActionPerformed(evt);
            }
        });

        ICMS.setText("  ICMS:");

        icms.setBackground(new java.awt.Color(200, 50, 50));
        icms.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        OK.setBackground(new java.awt.Color(65, 65, 65));
        OK.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        OK.setText("OK");

        NO.setBackground(new java.awt.Color(200, 50, 50));
        NO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        NO.setText("NO");

        javax.swing.GroupLayout JanelaLayout = new javax.swing.GroupLayout(Janela);
        Janela.setLayout(JanelaLayout);
        JanelaLayout.setHorizontalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ICMS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Venda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Custo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tamanho, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Produto)
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(descrição, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descri)
                            .addComponent(Forncedor)))
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custo))
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(venda)
                            .addComponent(icms)))))
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(NO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JanelaLayout.setVerticalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addComponent(CadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descri, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(descrição, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Forncedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Custo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(venda, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ICMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icms, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OK, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void descriActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void ForncedorActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void vendaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel CadastroProdutos;
    private javax.swing.JLabel Custo;
    private javax.swing.JTextField Forncedor;
    private javax.swing.JLabel Fornecedor;
    private javax.swing.JLabel ICMS;
    private javax.swing.JPanel Janela;
    private javax.swing.JButton NO;
    private javax.swing.JButton OK;
    private javax.swing.JFormattedTextField Produto;
    private javax.swing.JLabel Tam;
    private javax.swing.JComboBox<String> Tamanho;
    private javax.swing.JLabel Venda;
    private javax.swing.JTextField custo;
    private javax.swing.JTextField descri;
    private javax.swing.JLabel descrição;
    private javax.swing.JTextField icms;
    private javax.swing.JLabel produtos;
    private javax.swing.JTextField venda;
    // End of variables declaration                   
}
