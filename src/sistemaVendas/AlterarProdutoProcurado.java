/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaVendas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author BRUNO
 */
public final class AlterarProdutoProcurado extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlterarProdutoProcurado
     */
    public AlterarProdutoProcurado(JDesktopPane tela) {
        JDesktopPane telas = tela;
        initComponents();
        preencherComboBox();
    }
    Document doc;
    Element root;
    public void atualizar(String id,String nome,String tipo,String qtde,String precoUnit,String descriao){
        txtIdProdutoProcurado.setText(id);
        txtNomeProdutoProcurado.setText(nome);
        cbxTipoProdutoProcurado.setSelectedItem(tipo);
        txtQtdeEstoqueProcurado.setText(qtde);
        ftxtPrecoUnitProdutoProcurado.setText(precoUnit);
        txtDescricaoProcurado.setText(descriao);
    }
    
    public void preencherComboBox(){
        File diretorio = new File("Bancos de Dados");
        File bancoTipos = new File(diretorio,"BDtipoProduto.xml");
       try{
           SAXBuilder builder = new SAXBuilder();
           doc = builder.build(bancoTipos);
           root = (Element) doc.getRootElement();
           List<Element> tipos = root.getChildren();

           for(int i=0;i<tipos.size();i++){
               Element tipo = tipos.get(i);
               cbxTipoProdutoProcurado.addItem(tipo.getText());
           }

       }catch(JDOMException | IOException e){}
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDProdutoProcurado = new javax.swing.JLabel();
        lblNomeProdutoProcurado = new javax.swing.JLabel();
        txtNomeProdutoProcurado = new javax.swing.JTextField();
        txtIdProdutoProcurado = new javax.swing.JTextField();
        lblTipoProdutoProcurado = new javax.swing.JLabel();
        lblQtdeEstoqueProcurado = new javax.swing.JLabel();
        lblPrecoUnitProdutoProcurado = new javax.swing.JLabel();
        lblDescricaoProdutoProcurado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoProcurado = new javax.swing.JTextArea();
        txtQtdeEstoqueProcurado = new javax.swing.JTextField();
        ftxtPrecoUnitProdutoProcurado = new javax.swing.JFormattedTextField();
        btnCancelarProdutoProcurado = new javax.swing.JButton();
        btnOkProdutoProcurado = new javax.swing.JButton();
        cbxTipoProdutoProcurado = new javax.swing.JComboBox();
        btnDeletarProdutoProcurado = new javax.swing.JButton();

        setClosable(true);
        setTitle("Realizar Alteração do Produto");

        lblIDProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDProdutoProcurado.setText("ID:");

        lblNomeProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeProdutoProcurado.setText("Nome:");

        txtNomeProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtIdProdutoProcurado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProdutoProcurado.setEnabled(false);

        lblTipoProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoProdutoProcurado.setText("Tipo do Produto:");

        lblQtdeEstoqueProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQtdeEstoqueProcurado.setText("Qtde Estoque:");

        lblPrecoUnitProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecoUnitProdutoProcurado.setText("Preço Unitário:");

        lblDescricaoProdutoProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricaoProdutoProcurado.setText("Descrição:");

        txtDescricaoProcurado.setColumns(20);
        txtDescricaoProcurado.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoProcurado);

        txtQtdeEstoqueProcurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ftxtPrecoUnitProdutoProcurado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btnCancelarProdutoProcurado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelarProdutoProcurado.setText("Cancelar");
        btnCancelarProdutoProcurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoProcuradoActionPerformed(evt);
            }
        });

        btnOkProdutoProcurado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnOkProdutoProcurado.setText("OK");
        btnOkProdutoProcurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkProdutoProcuradoActionPerformed(evt);
            }
        });

        cbxTipoProdutoProcurado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------------" }));

        btnDeletarProdutoProcurado.setText("Deletar");
        btnDeletarProdutoProcurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoProcuradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIDProdutoProcurado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDescricaoProdutoProcurado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDeletarProdutoProcurado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOkProdutoProcurado)
                                .addGap(37, 37, 37)
                                .addComponent(btnCancelarProdutoProcurado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNomeProdutoProcurado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProdutoProcurado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblQtdeEstoqueProcurado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeEstoqueProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lblPrecoUnitProdutoProcurado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftxtPrecoUnitProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoProdutoProcurado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxTipoProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDProdutoProcurado)
                    .addComponent(txtIdProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProdutoProcurado)
                    .addComponent(txtNomeProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoProdutoProcurado)
                    .addComponent(cbxTipoProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeEstoqueProcurado)
                    .addComponent(txtQtdeEstoqueProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoUnitProdutoProcurado)
                    .addComponent(ftxtPrecoUnitProdutoProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblDescricaoProdutoProcurado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProdutoProcurado)
                    .addComponent(btnOkProdutoProcurado)
                    .addComponent(btnDeletarProdutoProcurado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarProdutoProcuradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoProcuradoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarProdutoProcuradoActionPerformed

    private void btnOkProdutoProcuradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkProdutoProcuradoActionPerformed
        File diretorio = new File("Bancos de Dados");
        File arquivo = new File(diretorio,"BancoProduto.xml");
        String id=txtIdProdutoProcurado.getText();
        String nome=txtNomeProdutoProcurado.getText();
        String tipo=(String)cbxTipoProdutoProcurado.getSelectedItem();
        String qtde=txtQtdeEstoqueProcurado.getText();
        String preco=ftxtPrecoUnitProdutoProcurado.getText();
        String descricao=txtDescricaoProcurado.getText();
        try{
            SAXBuilder builder = new SAXBuilder();
            doc=builder.build(arquivo);
            root=doc.getRootElement();
            List<Element> produtos = root.getChildren();
            for(int i=0;i<produtos.size();i++){
                Element produto=produtos.get(i);
                if(produto.getAttributeValue("id").equals(id)){
                    if(!produto.getChildText("nome").equals(nome)){
                        produto.getChild("nome").setText(nome);
                    }
                    if(!produto.getChild("nome").getAttributeValue("tipo").equals(tipo)){
                        produto.getChild("nome").setAttribute("tipo", tipo);
                    }
                    if(!produto.getChildText("qtde").equals(qtde)){
                        produto.getChild("qtde").setText(qtde);
                    }
                    if(!produto.getChildText("preçoUnitário").equals(preco)){
                        produto.getChild("preçoUnitário").setText(preco);
                    }
                    if(!produto.getChildText("descrição").equals(descricao)){
                        produto.getChild("descrição").setText(descricao);
                    }
                }
            }
            XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
            OutputStream out = new FileOutputStream(new File(diretorio,"BancoProduto.xml")); 
            xout.output(doc , out);
            out.close();
        }catch(JDOMException | IOException e){}
        JOptionPane.showMessageDialog(null,"DADOS ALTERADOS COM SUCESSO!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnOkProdutoProcuradoActionPerformed

    private void btnDeletarProdutoProcuradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoProcuradoActionPerformed
        File diretorio = new File("Bancos de Dados");
        File arquivo = new File(diretorio,"BancoProduto.xml");
        String id=txtIdProdutoProcurado.getText();
        try{
            SAXBuilder builder = new SAXBuilder();
            doc = builder.build(arquivo);
            root = doc.getRootElement();
            List<Element> produtos = root.getChildren();
            for(int i=0;i<produtos.size();i++){
                Element produto = produtos.get(i);
                if(produto.getAttributeValue("id").equals(id)){
                    produto.getParent().removeContent(produto);
                }
            }
            XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
            OutputStream out = new FileOutputStream(new File(diretorio,"BancoProduto.xml")); 
            xout.output(doc , out);
            out.close();
        }catch(JDOMException | IOException e){}
        JOptionPane.showMessageDialog(null,"PRODUTO REMOVIDO COM SUCESSO!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnDeletarProdutoProcuradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProdutoProcurado;
    private javax.swing.JButton btnDeletarProdutoProcurado;
    private javax.swing.JButton btnOkProdutoProcurado;
    private javax.swing.JComboBox cbxTipoProdutoProcurado;
    private javax.swing.JFormattedTextField ftxtPrecoUnitProdutoProcurado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricaoProdutoProcurado;
    private javax.swing.JLabel lblIDProdutoProcurado;
    private javax.swing.JLabel lblNomeProdutoProcurado;
    private javax.swing.JLabel lblPrecoUnitProdutoProcurado;
    private javax.swing.JLabel lblQtdeEstoqueProcurado;
    private javax.swing.JLabel lblTipoProdutoProcurado;
    private javax.swing.JTextArea txtDescricaoProcurado;
    private javax.swing.JTextField txtIdProdutoProcurado;
    private javax.swing.JTextField txtNomeProdutoProcurado;
    private javax.swing.JTextField txtQtdeEstoqueProcurado;
    // End of variables declaration//GEN-END:variables
}
