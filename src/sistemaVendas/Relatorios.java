/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaVendas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author BRUNO
 */
public class Relatorios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Relatorios
     */
    NotaFiscal notaFiscal;
    JDesktopPane telas;
    public Relatorios(JDesktopPane tela) {
        telas=tela;
        initComponents();
        model7.setNumRows(0);
        model8.setNumRows(0);
        tabRelatorioNotasFiscais.setModel(model7);
        tabRelatorioClientes.setModel(model8);
        spnDataRelatorio.setEditor(new JSpinner.DateEditor(spnDataRelatorio, "dd/MM/yyyy"));
    }
    
    public String formatarData(){// Retorna a data com uma String legível
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String valorDaData = formater.format(spnDataRelatorio.getValue());
        return valorDaData;
    }
    
    File diretorio = new File("Bancos de Dados");
    File bancoCliente  = new File(diretorio,"BancoCliente.xml");
    
    Document doc;
    Element root;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRelatorios = new javax.swing.JLabel();
        tabpnlGuiasRelatorio = new javax.swing.JTabbedPane();
        pnlNotaFiscal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRelatorioNotasFiscais = new javax.swing.JTable();
        lblNumeroNota = new javax.swing.JLabel();
        lblDataRelatorio = new javax.swing.JLabel();
        txtNumeroNota = new javax.swing.JTextField();
        spnDataRelatorio = new javax.swing.JSpinner();
        btnVisualizarNota = new javax.swing.JButton();
        btnCancelarRelatorio = new javax.swing.JButton();
        lblTotalSaida = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabRelatorioClientes = new javax.swing.JTable();
        lblSelecionarCliente = new javax.swing.JLabel();
        cbxRelatorioCliente = new javax.swing.JComboBox();
        btnVisualizarNotaCliente = new javax.swing.JButton();
        btnCancelarRelatorioCliente = new javax.swing.JButton();
        lblTotalVendido = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Relatórios");

        lblRelatorios.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblRelatorios.setText("Relatórios");

        tabpnlGuiasRelatorio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabpnlGuiasRelatorioStateChanged(evt);
            }
        });

        tabRelatorioNotasFiscais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabRelatorioNotasFiscais);

        lblNumeroNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroNota.setText("Nº da Nota:");

        lblDataRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataRelatorio.setText("Data:");

        txtNumeroNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroNotaKeyReleased(evt);
            }
        });

        spnDataRelatorio.setModel(new javax.swing.SpinnerDateModel());
        spnDataRelatorio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDataRelatorioStateChanged(evt);
            }
        });

        btnVisualizarNota.setText("Visualizar");
        btnVisualizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarNotaActionPerformed(evt);
            }
        });

        btnCancelarRelatorio.setText("Cancelar");
        btnCancelarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRelatorioActionPerformed(evt);
            }
        });

        lblTotalSaida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalSaida.setText("Total de Saída: R$");

        javax.swing.GroupLayout pnlNotaFiscalLayout = new javax.swing.GroupLayout(pnlNotaFiscal);
        pnlNotaFiscal.setLayout(pnlNotaFiscalLayout);
        pnlNotaFiscalLayout.setHorizontalGroup(
            pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotaFiscalLayout.createSequentialGroup()
                .addGroup(pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotaFiscalLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarRelatorio))
                    .addGroup(pnlNotaFiscalLayout.createSequentialGroup()
                        .addGroup(pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNotaFiscalLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(lblNumeroNota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(lblDataRelatorio))
                            .addGroup(pnlNotaFiscalLayout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(btnVisualizarNota)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalSaida)
                            .addComponent(spnDataRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNotaFiscalLayout.setVerticalGroup(
            pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotaFiscalLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroNota)
                    .addComponent(lblDataRelatorio)
                    .addComponent(txtNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnDataRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarNota)
                    .addComponent(lblTotalSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotaFiscalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarRelatorio))
        );

        tabpnlGuiasRelatorio.addTab("Notas Fiscais", pnlNotaFiscal);

        tabRelatorioClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabRelatorioClientes);

        lblSelecionarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSelecionarCliente.setText("Selecione o Cliente:");

        cbxRelatorioCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxRelatorioCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRelatorioClienteItemStateChanged(evt);
            }
        });

        btnVisualizarNotaCliente.setText("Visualizar");
        btnVisualizarNotaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarNotaClienteActionPerformed(evt);
            }
        });

        btnCancelarRelatorioCliente.setText("Cancelar");
        btnCancelarRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRelatorioClienteActionPerformed(evt);
            }
        });

        lblTotalVendido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalVendido.setText("Total Vendido:  R$");

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSelecionarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarRelatorioCliente)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                        .addComponent(btnVisualizarNotaCliente)
                        .addGap(35, 35, 35)
                        .addComponent(lblTotalVendido)
                        .addGap(141, 141, 141))))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecionarCliente)
                    .addComponent(cbxRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarNotaCliente)
                    .addComponent(lblTotalVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarRelatorioCliente))
        );

        tabpnlGuiasRelatorio.addTab("Clientes", pnlClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpnlGuiasRelatorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRelatorios)
                .addGap(18, 18, 18)
                .addComponent(tabpnlGuiasRelatorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRelatorioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarRelatorioActionPerformed

    private void btnCancelarRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRelatorioClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarRelatorioClienteActionPerformed

    private void cbxRelatorioClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRelatorioClienteItemStateChanged
        model8.setNumRows(0);
        String itemSelecionado = (String) cbxRelatorioCliente.getSelectedItem();
        File bancoNotas = new File(diretorio,"BancoNotas.xml");
        if(cbxRelatorioCliente.getSelectedIndex()==0){
                     model8.setNumRows(0);
        }else{
            try{
                SAXBuilder builder = new SAXBuilder();
                doc=builder.build(bancoNotas);
                root = (Element)doc.getRootElement();
                List<Element> notas = root.getChildren();
                String dados[]= new String[3];
                for(int i=0;i<notas.size();i++){
                    Element nota = notas.get(i);
                    if(itemSelecionado.equals(nota.getChild("Cliente").getChildText("Nome"))){
                        dados[0]=nota.getAttributeValue("Numeracao");
                        dados[1]=nota.getAttributeValue("Data");
                        dados[2]=nota.getChild("Pagamento").getChildText("ValorTotal");
                        model8.addRow(new Object[]{dados[0], dados[1], dados[2]});
                    }
                }
                double total=0;
                for(int j=0;j<tabRelatorioClientes.getRowCount();j++){
                    String valorZero=(String)tabRelatorioClientes.getValueAt(j, 2);
                    if(!valorZero.equals(""))
                        total+=Double.parseDouble((String)tabRelatorioClientes.getValueAt(j, 2));
                }
                DecimalFormat decimal = new DecimalFormat( "0.00" ); 
                lblTotalVendido.setText("Total Vendido:  R$ "+decimal.format(total));
            }catch(JDOMException | IOException e){}
        }
        
    }//GEN-LAST:event_cbxRelatorioClienteItemStateChanged

    private void txtNumeroNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroNotaKeyReleased
        model7.setNumRows(0);
        File bancoNotas = new File(diretorio,"BancoNotas.xml");
        try{
            SAXBuilder builder = new SAXBuilder();
            doc=builder.build(bancoNotas);
            root = (Element)doc.getRootElement();
            List<Element> notas = root.getChildren();
            String dados[]= new String[4];
            for(int i=0;i<notas.size();i++){
                Element nota = notas.get(i);
                dados[0]=nota.getAttributeValue("Numeracao");
                dados[1]=nota.getAttributeValue("Data");
                dados[2]=nota.getChild("Cliente").getChildText("Nome");
                dados[3]=nota.getChild("Pagamento").getChildText("ValorTotal");
                if(txtNumeroNota.getText().equals("") || dados[0].equals(txtNumeroNota.getText())){
                    model7.addRow(new Object[]{dados[0], dados[1], dados[2], dados[3]});
                }
            }
            double total=0;
            for(int j=0;j<tabRelatorioNotasFiscais.getRowCount();j++){
                String valorZero=(String)tabRelatorioNotasFiscais.getValueAt(j, 3);
                if(!valorZero.equals(""))
                    total+=Double.parseDouble((String)tabRelatorioNotasFiscais.getValueAt(j, 3));
            }
            DecimalFormat decimal = new DecimalFormat( "0.00" ); 
            lblTotalSaida.setText("Total Saída: R$ "+decimal.format(total));
        }catch(JDOMException | IOException e){}
        
    }//GEN-LAST:event_txtNumeroNotaKeyReleased

    private void spnDataRelatorioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDataRelatorioStateChanged
        model7.setNumRows(0);
        File bancoNotas = new File(diretorio,"BancoNotas.xml");
        try{
            SAXBuilder builder = new SAXBuilder();
            doc=builder.build(bancoNotas);
            root = (Element)doc.getRootElement();
            List<Element> notas = root.getChildren();
            String dados[]= new String[4];
            for(int i=0;i<notas.size();i++){
                Element nota = notas.get(i);
                dados[0]=nota.getAttributeValue("Numeracao");
                dados[1]=nota.getAttributeValue("Data");
                dados[2]=nota.getChild("Cliente").getChildText("Nome");
                dados[3]=nota.getChild("Pagamento").getChildText("ValorTotal");
                if(txtNumeroNota.getText().equals("") && dados[1].equals(formatarData())){
                    model7.addRow(new Object[]{dados[0], dados[1], dados[2], dados[3]});
                }
            }
            double total=0;
            for(int j=0;j<tabRelatorioNotasFiscais.getRowCount();j++){
                String valorZero=(String)tabRelatorioNotasFiscais.getValueAt(j, 3);
                if(!valorZero.equals(""))
                    total+=Double.parseDouble((String)tabRelatorioNotasFiscais.getValueAt(j, 3));
            }
            DecimalFormat decimal = new DecimalFormat( "0.00" ); 
            lblTotalSaida.setText("Total Saída: R$ "+decimal.format(total));
        }catch(JDOMException | IOException e){}
    }//GEN-LAST:event_spnDataRelatorioStateChanged
    int linhaSelecionada=0;
    private void btnVisualizarNotaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarNotaClienteActionPerformed
        if(tabRelatorioClientes.getRowSelectionAllowed()){//Se a tabela estiver com algum item selecionado fazer....
            int linha=tabRelatorioClientes.getSelectedRow();
            linhaSelecionada=linha;
            String numNota = (String)tabRelatorioClientes.getValueAt(linha, 0);
            notaFiscal = new NotaFiscal(numNota,this);
            /*Centralizar tela*/
            Toolkit toolkit = Toolkit.getDefaultToolkit(); 
            Dimension tamanhoTela = toolkit.getScreenSize();
            int x = (tamanhoTela.width - notaFiscal.getWidth())/2;
            int y = (tamanhoTela.height - notaFiscal.getHeight())/2;
            telas.add(notaFiscal);
            notaFiscal.setVisible(true);
            notaFiscal.setLocation(x, y-60);
        }
    }//GEN-LAST:event_btnVisualizarNotaClienteActionPerformed

    private void btnVisualizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarNotaActionPerformed
        if(tabRelatorioNotasFiscais.getRowSelectionAllowed()){
            int linha=tabRelatorioNotasFiscais.getSelectedRow();
            linhaSelecionada=linha;
            String numNota = (String)tabRelatorioNotasFiscais.getValueAt(linha, 0);
            notaFiscal = new NotaFiscal(numNota,this);
            /*Centralizar tela*/
            Toolkit toolkit = Toolkit.getDefaultToolkit(); 
            Dimension tamanhoTela = toolkit.getScreenSize();
            int x = (tamanhoTela.width - notaFiscal.getWidth())/2;
            int y = (tamanhoTela.height - notaFiscal.getHeight())/2;
            telas.add(notaFiscal);
            notaFiscal.setVisible(true);
            notaFiscal.setLocation(x, y-60);
        }
    }//GEN-LAST:event_btnVisualizarNotaActionPerformed

    private void tabpnlGuiasRelatorioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabpnlGuiasRelatorioStateChanged
        if(tabpnlGuiasRelatorio.getSelectedIndex()==1){
            model7.setNumRows(0);
            //Preencher ComboBox
            cbxRelatorioCliente.removeAllItems();
            cbxRelatorioCliente.addItem("--------------------------------------------");
            try{
                SAXBuilder builder = new SAXBuilder();
                doc = builder.build(bancoCliente);
                root = (Element) doc.getRootElement();
                List<Element> clientes = root.getChildren();
                for(int i=0;i<clientes.size();i++){
                    Element cliente = clientes.get(i);
                    cbxRelatorioCliente.addItem(cliente.getChildText("nome"));
                }
            }catch(JDOMException | IOException e){}
        }
        if(tabpnlGuiasRelatorio.getSelectedIndex()==0){
            model8.setNumRows(0);
        }
    }//GEN-LAST:event_tabpnlGuiasRelatorioStateChanged
    
//Busca a Proxima ou a Anterior Nota Fiscal de acordo com a tabela de busca
    public String NumeroDaNota_Referente_A_Tabela(String idAtual,String proximaOUanterior){
        String proxOuAnteriorID="";
        //Tabela de Notas Gerais
        if(!(model7.getRowCount()==0)){
            int numLinhas1= tabRelatorioNotasFiscais.getRowCount();
            if(proximaOUanterior.equals("prox")){//Prox Nota
                if(numLinhas1>linhaSelecionada){
                    for(int i=0;i<numLinhas1-1;i++){
                        if(idAtual.equals(tabRelatorioNotasFiscais.getValueAt(i, 0))){
                            proxOuAnteriorID = (String)tabRelatorioNotasFiscais.getValueAt(i+1, 0);
                            linhaSelecionada = Integer.parseInt(proxOuAnteriorID);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Não tem próxima nota fiscal!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return ""+linhaSelecionada;
                }
                if(numLinhas1==1){
                    JOptionPane.showMessageDialog(null, "Única Nota Fiscal Encontrada!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return idAtual;
                }
            }
            else if(proximaOUanterior.equals("anterior")){//Anterior Nota
                if(linhaSelecionada>1){
                    for(int i=0;i<numLinhas1;i++){
                        if(idAtual.equals(tabRelatorioNotasFiscais.getValueAt(i, 0))){
                            proxOuAnteriorID = (String)tabRelatorioNotasFiscais.getValueAt(i-1, 0);
                            linhaSelecionada = Integer.parseInt(proxOuAnteriorID);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Não tem nota fiscal anterior!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return ""+linhaSelecionada;
                }
                if(numLinhas1==1){
                    JOptionPane.showMessageDialog(null, "Única Nota Fiscal Encontrada!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return idAtual;
                }
            }
        }
        
        //Tabela de Notas por Cliente
        if(!(model8.getRowCount()==0)){
            int numLinhas2 = tabRelatorioClientes.getRowCount();
            if(proximaOUanterior.equals("prox")){//Prox Nota
                if(numLinhas2>=linhaSelecionada){
                    for(int i=0;i<numLinhas2-1;i++){
                        if(idAtual.equals(tabRelatorioClientes.getValueAt(i, 0))){
                            proxOuAnteriorID = (String)tabRelatorioClientes.getValueAt(i+1, 0);
                            linhaSelecionada = Integer.parseInt(proxOuAnteriorID);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Não tem próxima nota fiscal!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return ""+linhaSelecionada;
                }
                if(numLinhas2==1){
                    JOptionPane.showMessageDialog(null, "Única Nota Fiscal Encontrada!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return idAtual;
                }
            }
            else if(proximaOUanterior.equals("anterior")){//Anterior Nota
                if(linhaSelecionada>=1){
                    for(int i=0;i<numLinhas2;i++){
                        if(idAtual.equals(tabRelatorioClientes.getValueAt(i, 0))){
                            proxOuAnteriorID = (String)tabRelatorioClientes.getValueAt(i-1, 0);
                            linhaSelecionada = Integer.parseInt(proxOuAnteriorID);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Não tem nota fiscal anterior!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return ""+linhaSelecionada;
                }
                if(numLinhas2==1){
                    JOptionPane.showMessageDialog(null, "Única Nota Fiscal Encontrada!","Inválido",JOptionPane.INFORMATION_MESSAGE);
                    return idAtual;
                }
            }
        }
        
        return proxOuAnteriorID;
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRelatorio;
    private javax.swing.JButton btnCancelarRelatorioCliente;
    private javax.swing.JButton btnVisualizarNota;
    private javax.swing.JButton btnVisualizarNotaCliente;
    private javax.swing.JComboBox cbxRelatorioCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataRelatorio;
    private javax.swing.JLabel lblNumeroNota;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblSelecionarCliente;
    private javax.swing.JLabel lblTotalSaida;
    private javax.swing.JLabel lblTotalVendido;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlNotaFiscal;
    private javax.swing.JSpinner spnDataRelatorio;
    private javax.swing.JTable tabRelatorioClientes;
    private javax.swing.JTable tabRelatorioNotasFiscais;
    private javax.swing.JTabbedPane tabpnlGuiasRelatorio;
    private javax.swing.JTextField txtNumeroNota;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model7 = new DefaultTableModel(  
            new Object[] []{ },  
            new String[] {"Numero da Nota", "Data", "Cliente","Total da Compra"}  
         ) {  
  
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  
         };
    
    private DefaultTableModel model8 = new DefaultTableModel(  
            new Object[] []{ },  
            new String[] {"Numero da Nota", "Data","Total da Compra"}  
         ) {  
  
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  
         };
}
