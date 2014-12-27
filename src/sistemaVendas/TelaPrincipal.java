/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaVendas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author BRUNO
 */
public class TelaPrincipal extends javax.swing.JFrame {
    /*Declarar Telas*/
    CadastroCliente cadastroCliente;
    CadastroProduto cadastroProduto;
    AlterarCliente alterarCliente;
    AlterarProduto alterarProduto;
    RealizarVenda realizarVenda;
    CancelarVenda cancelarVenda;
    Relatorios relatorio;
            
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);//Já abre a tela Maxmizada
    }
    
    private void criarTelaDeCadastroCliente(){
        if(cadastroCliente==null){
            cadastroCliente = new CadastroCliente();
        }
        /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        //Calcula a posição do frame a partir da resolucao usada 
        int x = (tamanhoTela.width - cadastroCliente.getWidth()) / 2; 
        int y = (tamanhoTela.height - cadastroCliente.getHeight()) / 2;
        
        jDesktopPaneTelaDeInteracao.add(cadastroCliente);
        cadastroCliente.setVisible(true);
        cadastroCliente.setLocation(x, y);
    }
    
    private void criarTelaDeCadastroProduto(){
        if(cadastroProduto==null){
            cadastroProduto = new CadastroProduto(jDesktopPaneTelaDeInteracao);
        }
        /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - cadastroProduto.getWidth())/2;
        int y = (tamanhoTela.height - cadastroProduto.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(cadastroProduto);
        cadastroProduto.setVisible(true);
        cadastroProduto.setLocation(x, y);
    }
    
    private void criarTelaDeAlteracaoCliente(){
        if(alterarCliente==null){
            alterarCliente = new AlterarCliente(jDesktopPaneTelaDeInteracao);
        }
        /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - alterarCliente.getWidth())/2;
        int y = (tamanhoTela.height - alterarCliente.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(alterarCliente);
        alterarCliente.setVisible(true);
        alterarCliente.setLocation(x, y);
    }
    
    private void criarTelaDeAlteracaoProduto(){
        if(alterarProduto==null){
            alterarProduto = new AlterarProduto(jDesktopPaneTelaDeInteracao);
        }
        /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - alterarProduto.getWidth())/2;
        int y = (tamanhoTela.height - alterarProduto.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(alterarProduto);
        alterarProduto.setVisible(true);
        alterarProduto.setLocation(x, y);
    }
    
    private void criarTelaDeVendas(){
        if(realizarVenda==null){
            realizarVenda = new RealizarVenda(jDesktopPaneTelaDeInteracao);
        }
        /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - realizarVenda.getWidth())/2;
        int y = (tamanhoTela.height - realizarVenda.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(realizarVenda);
        realizarVenda.setVisible(true);
        realizarVenda.setLocation(x, (y-60));
    }
    
     private void criarTelaCancelarVenda(){
         if(cancelarVenda==null){
            cancelarVenda = new CancelarVenda(jDesktopPaneTelaDeInteracao);
         }
          /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - cancelarVenda.getWidth())/2;
        int y = (tamanhoTela.height - cancelarVenda.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(cancelarVenda);
        cancelarVenda.setVisible(true);
        cancelarVenda.setLocation(x, y);
     }
     
     private void criarTelaRelatorio(){
         if(relatorio==null){
             relatorio = new Relatorios(jDesktopPaneTelaDeInteracao);
         }
         /*Centralizar tela*/
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension tamanhoTela = toolkit.getScreenSize();
        int x = (tamanhoTela.width - relatorio.getWidth())/2;
        int y = (tamanhoTela.height - relatorio.getHeight())/2;
        jDesktopPaneTelaDeInteracao.add(relatorio);
        relatorio.setVisible(true);
        relatorio.setLocation(x, y);
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblInfo = new javax.swing.JLabel();
        jDesktopPaneTelaDeInteracao = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        subMenuClienteCadastro = new javax.swing.JMenuItem();
        subMenuProdutosCadastro = new javax.swing.JMenuItem();
        menuAlteracao = new javax.swing.JMenu();
        subMenuClienteAlteracao = new javax.swing.JMenuItem();
        subMenuProdutoAlteracao = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        subMenuRealizarVenda = new javax.swing.JMenuItem();
        subMenuCancelarVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        setPreferredSize(new java.awt.Dimension(1350, 680));

        lblInfo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Sistema de Vendas Desenvolvido por Bruno e Samara ");

        jDesktopPaneTelaDeInteracao.setMaximumSize(getMaximumSize());

        javax.swing.GroupLayout jDesktopPaneTelaDeInteracaoLayout = new javax.swing.GroupLayout(jDesktopPaneTelaDeInteracao);
        jDesktopPaneTelaDeInteracao.setLayout(jDesktopPaneTelaDeInteracaoLayout);
        jDesktopPaneTelaDeInteracaoLayout.setHorizontalGroup(
            jDesktopPaneTelaDeInteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneTelaDeInteracaoLayout.setVerticalGroup(
            jDesktopPaneTelaDeInteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        menuCadastro.setText("Cadastro");

        subMenuClienteCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10590023_678671205559301_122432120_n.jpg"))); // NOI18N
        subMenuClienteCadastro.setText("Clientes");
        subMenuClienteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClienteCadastroActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuClienteCadastro);

        subMenuProdutosCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1082164_678671208892634_2086332730_n.jpg"))); // NOI18N
        subMenuProdutosCadastro.setText("Produtos");
        subMenuProdutosCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProdutosCadastroActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuProdutosCadastro);

        jMenuBar1.add(menuCadastro);

        menuAlteracao.setText("Alteração");

        subMenuClienteAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10590023_678671205559301_122432120_n.jpg"))); // NOI18N
        subMenuClienteAlteracao.setText("Cliente");
        subMenuClienteAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClienteAlteracaoActionPerformed(evt);
            }
        });
        menuAlteracao.add(subMenuClienteAlteracao);

        subMenuProdutoAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1082164_678671208892634_2086332730_n.jpg"))); // NOI18N
        subMenuProdutoAlteracao.setText("Produto");
        subMenuProdutoAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProdutoAlteracaoActionPerformed(evt);
            }
        });
        menuAlteracao.add(subMenuProdutoAlteracao);

        jMenuBar1.add(menuAlteracao);

        menuVenda.setText("Venda");

        subMenuRealizarVenda.setText("Realizar Venda");
        subMenuRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRealizarVendaActionPerformed(evt);
            }
        });
        menuVenda.add(subMenuRealizarVenda);

        subMenuCancelarVenda.setText("Cancelar Venda");
        subMenuCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCancelarVendaActionPerformed(evt);
            }
        });
        menuVenda.add(subMenuCancelarVenda);

        jMenuBar1.add(menuVenda);

        menuRelatorio.setText("Relatório");
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRelatorio);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPaneTelaDeInteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPaneTelaDeInteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        String info="";
        info+="Turma de PEOO 2014.1\n\n";
        info+="Trabalho 4 - Sistema de Vendas\n\n";
        info+="Aluno: Bruno Silva Barbosa     Mat:1284770\n";
        info+="Aluna: Samara Ximendes        Mat:1234309";
        info+="\n\nVersão: Beta 3.0";
        JOptionPane.showMessageDialog(null, info, "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuSobreMouseClicked

    private void subMenuClienteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClienteCadastroActionPerformed
        criarTelaDeCadastroCliente();
    }//GEN-LAST:event_subMenuClienteCadastroActionPerformed

    private void subMenuProdutosCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProdutosCadastroActionPerformed
        criarTelaDeCadastroProduto();
    }//GEN-LAST:event_subMenuProdutosCadastroActionPerformed

    private void subMenuClienteAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClienteAlteracaoActionPerformed
        criarTelaDeAlteracaoCliente();
    }//GEN-LAST:event_subMenuClienteAlteracaoActionPerformed

    private void subMenuProdutoAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProdutoAlteracaoActionPerformed
        criarTelaDeAlteracaoProduto();
    }//GEN-LAST:event_subMenuProdutoAlteracaoActionPerformed

    private void subMenuRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRealizarVendaActionPerformed
        criarTelaDeVendas();
    }//GEN-LAST:event_subMenuRealizarVendaActionPerformed

    private void subMenuCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCancelarVendaActionPerformed
        criarTelaCancelarVenda();
    }//GEN-LAST:event_subMenuCancelarVendaActionPerformed

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
        criarTelaRelatorio();
    }//GEN-LAST:event_menuRelatorioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneTelaDeInteracao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenu menuAlteracao;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem subMenuCancelarVenda;
    private javax.swing.JMenuItem subMenuClienteAlteracao;
    private javax.swing.JMenuItem subMenuClienteCadastro;
    private javax.swing.JMenuItem subMenuProdutoAlteracao;
    private javax.swing.JMenuItem subMenuProdutosCadastro;
    private javax.swing.JMenuItem subMenuRealizarVenda;
    // End of variables declaration//GEN-END:variables

}
