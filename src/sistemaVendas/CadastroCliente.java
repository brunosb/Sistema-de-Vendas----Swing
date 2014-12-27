/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaVendas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


/**
 *
 * @author BRUNO
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        lblCpfValido.setVisible(false); 
        int idAtual = idverificador();
        String id = String.valueOf(idAtual);
        txtIdCliente.setText(id);
        model9.setNumRows(0);
        tblListaCadCliente.setModel(model9);
        tblListaCadCliente.getColumnModel().getColumn(0).setMaxWidth(35);
        tblListaCadCliente.getColumnModel().getColumn(1).setMaxWidth(250);
        tblListaCadCliente.getColumnModel().getColumn(1).setMinWidth(250);
        tblListaCadCliente.getColumnModel().getColumn(3).setMaxWidth(60);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelarCliente = new javax.swing.JButton();
        tpGuias = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        lblIDCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox();
        txtNomeCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtFone = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblCpfValido = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();
        lblClientesCad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaCadCliente = new javax.swing.JTable();
        btnOkCliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Clientes");

        btnCancelarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        tpGuias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpGuiasMouseClicked(evt);
            }
        });

        lblIDCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDCliente.setText("ID:");

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome:");

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSexo.setText("Sexo:");

        lblIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdade.setText("Idade:");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpf.setText("CPF:");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------", "Masculino", "Feminino" }));

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdCliente.setEnabled(false);

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        lblCpfValido.setText("CPF INVÁLIDO!");

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeCliente))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lblIDCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(lblSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(lblCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(lblTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCpfValido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lblIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblIdade)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblTelefone)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfValido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(208, 208, 208))
        );

        tpGuias.addTab("Novo Cadastro", panelCadastro);

        lblClientesCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClientesCad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientesCad.setText("Clientes Cadastrados");

        tblListaCadCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6"
            }
        ));
        jScrollPane1.setViewportView(tblListaCadCliente);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelListaLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(lblClientesCad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientesCad)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpGuias.addTab("Lista de Cadastrados", panelLista);

        btnOkCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnOkCliente.setText("Ok");
        btnOkCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkCliente)
                .addGap(41, 41, 41)
                .addComponent(btnCancelarCliente)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpGuias)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tpGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkCliente)
                    .addComponent(btnCancelarCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed
    File diretorio = new File("Bancos de Dados");
    File arquivo = new File(diretorio,"BancoCliente.xml");
    Document doc;
    Element root;
       
    private void btnOkClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkClienteActionPerformed
       
        if(verificarCPf()){
            if(cpfdiferentes()==0){
            if(criarXml()){
                        JOptionPane.showMessageDialog(null,"DADOS SALVOS COM SUCESSO!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            txtIdCliente.setText("");
            txtNomeCliente.setText("");
            txtIdade.setText("");
            txtCpf.setText("");
            txtFone.setText("");
            cbxSexo.setSelectedIndex(0);
            lblCpfValido.setVisible(false);
            int idAtual = idverificador();
            String id = String.valueOf(idAtual);
            txtIdCliente.setText(id);
            }
            else{
                JOptionPane.showMessageDialog(null,"ERRO NA GRAVAÇÃO DO ARQUIVO!","ERRO",JOptionPane.ERROR_MESSAGE);
            }
          }
          else{
             JOptionPane.showMessageDialog(null,"CPF JÁ CADASTRADO!","ERRO",JOptionPane.ERROR_MESSAGE);   
          }
        }
        else{
                JOptionPane.showMessageDialog(null,"CPF INVÁLIDO! DIGITE NOVAMENTE!","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOkClienteActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
    if(verificarCPf()){
          lblCpfValido.setText("CPF VÁLIDO!");
                    lblCpfValido.setForeground(Color.GREEN);
                    lblCpfValido.setVisible(true);
      }
      else{
          lblCpfValido.setText("CPF INVÁLIDO!");
                    lblCpfValido.setForeground(Color.RED);
          //          Sound erro = new Sound("./erro.wav");  
          //          SoundManager sm = new SoundManager();  
          //          sm.play(erro); 
                    lblCpfValido.setVisible(true);
      }
    }//GEN-LAST:event_txtCpfFocusLost

    private void tpGuiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpGuiasMouseClicked
        model9.setNumRows(0);
        if(panelLista.isShowing()){
            try{
                SAXBuilder carregar = new SAXBuilder();
                doc = carregar.build(arquivo);
                root = (Element) doc.getRootElement();
                List<Element> clientes = root.getChildren();
                String dados[] = new String[6];

                for(int i=0;i<clientes.size();i++){
                    Element cliente = clientes.get(i);
                    dados[0]=(String)cliente.getAttributeValue("id");
                    dados[1]=(String)cliente.getChildText("nome");
                    dados[2]=(String)cliente.getChildText("sexo");
                    dados[3]=(String)cliente.getChildText("idade");
                    dados[4]=(String)cliente.getChildText("telefone");
                    dados[5]=(String)cliente.getChildText("cpf");
                    model9.addRow(new Object[]{dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]});
                }

            }catch(JDOMException | IOException e){}
        }else{
            model9.setNumRows(0);
        }
    }//GEN-LAST:event_tpGuiasMouseClicked

    
    private int idverificador(){
        int idAtual=0;
		Document aux;
                File diretorio = new File("Bancos de Dados");
                File arquivo = new File(diretorio,"BancoCliente.xml");
		SAXBuilder carrega = new SAXBuilder();
                if(!(arquivo.exists())){
			root=new Element("BancoCliente");
			doc = new Document(root);
                        return idAtual=1;
		}
		try{
			aux=carrega.build(arquivo);
			Element root =(Element) aux.getRootElement();
			List<Element> clientes = root.getChildren();
			for(int i=0;i<clientes.size();i++){
				Element cliente=clientes.get(i);
				idAtual=Integer.parseInt(cliente.getAttributeValue("id"));
			}
		}catch(JDOMException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}		
		return idAtual+1;
    }
    private boolean verificarCPf(){
        String cpf = txtCpf.getText();
        StringBuffer cpfaux = new StringBuffer("");  
        String cpfval = cpf;  
        try {  
            if (cpfval != null) {  
                for (int i = 0;i<cpfval.length(); i++) {  
                    if (cpfval.charAt(i) != '.') {
                        if(cpfval.charAt(i)!= '-'){
                        cpfaux.append(cpfval.charAt(i));  
                        }  
                    }    
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();              
        }             
        String cpfiguais = cpfaux.toString();
          if ((cpfiguais.equals("00000000000")) || (cpfiguais.equals("11111111111")) || (cpfiguais.equals("22222222222")) || (cpfiguais.equals("33333333333")) || (cpfiguais.equals("44444444444")) || (cpfiguais.equals("55555555555")) ||
              (cpfiguais.equals("66666666666")) || (cpfiguais.equals("77777777777")) || (cpfiguais.equals("88888888888")) || (cpfiguais.equals("99999999999")) || ((cpfiguais.length()!= 11))){ 
              return (false);

          }
          else{
          char dig10, dig11;
          int sm, i, r, num, peso;
          // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
          try { 
          // Calculo do 1o. Digito Verificador
              sm = 0; 
              peso = 10;

              for (i=0; i<9; i++) {
                  // converte o i-esimo caractere do CPF em um numero: 
                  // por exemplo, transforma o caractere '0' no inteiro 0 
                  // (48 eh a posicao de '0' na tabela ASCII) 
                  num = (int)(cpfaux.charAt(i) - 48);
                  sm = sm + (num * peso); 
                  peso = peso - 1; 
              } 
                  r = 11 - (sm % 11);
                  if ((r == 10) || (r == 11))
                      dig10 = '0'; 
                  else 
                      dig10 = (char)(r + 48); 
              // converte no respectivo caractere numerico 
              // Calculo do 2o. Digito Verificador 
              sm = 0; 
              peso = 11;
              for(i=0; i<10; i++) { 
                  num = (int)(cpfaux.charAt(i) - 48);
                  sm = sm + (num * peso);
                  peso = peso - 1;
              } 
              r = 11 - (sm % 11);
              if ((r == 10) || (r == 11))
                  dig11 = '0';
              else 
                  dig11 = (char)(r + 48); 
          // Verifica se os digitos calculados conferem com os digitos informados. 
              if ((dig10 == cpfaux.charAt(9)) && (dig11 == cpfaux.charAt(10))){
                  return(true);
              }
              else{ 
                  return(false);                        
              }
          } catch (InputMismatchException erro) { 
              return(false);
            }
          }   
    }
    public boolean criarXml(){
        
        String cpf = txtCpf.getText();
        String nome = txtNomeCliente.getText().toUpperCase();
        String idade = txtIdade.getText();
        String telefone = txtFone.getText();
        String sexo = (String)cbxSexo.getSelectedItem();
	int id=1;
        
        if(!(arquivo.exists())){
			root=new Element("BancoCliente");
			doc = new Document(root); 
                        id=1;
		}
		/*Se existir faz uma copia do original e acrescenta novas informações*/
		try{
			if(arquivo.exists()){
				SAXBuilder builder=new SAXBuilder();
				doc=builder.build(arquivo);
				root =(Element) doc.getRootElement();
				id=idverificador();
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(JDOMException e){
			e.printStackTrace();
		}
		
		Element cliente=new Element("cliente");
		
		Attribute idd= new Attribute("id",""+id);
		cliente.setAttribute(idd);
		
		
		Element name=new Element("nome");
		name.setText(nome);
		Element sex=new Element("sexo");
		sex.setText(sexo);
                Element age=new Element("idade");
		age.setText(idade);
                Element fone = new Element("telefone");
                fone.setText(telefone);
                Element cpfxml = new Element("cpf");
                cpfxml.setText(cpf);
                
		cliente.addContent(name);
                cliente.addContent(sex);
		cliente.addContent(age);
		cliente.addContent(fone);
                cliente.addContent(cpfxml);
	
		root.addContent(cliente);
	
		try {
			XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
			OutputStream out = new FileOutputStream(new File(diretorio,"BancoCLiente.xml")); 
			xout.output(doc , out);
			out.close();
                        
		} catch (IOException e) {
			e.printStackTrace();
		}
                return (true);
    }
    Document doc6;
    Element root6;
    public int cpfdiferentes(){
    int aux = 0;
    String cpf = txtCpf.getText();
    File diretorio = new File("Bancos de Dados");
    File arquivo = new File (diretorio,"BancoCliente.xml");
        try{
            SAXBuilder builder = new SAXBuilder();
            doc6 = builder.build(arquivo);
            root6 = (Element)doc6.getRootElement();
            List<Element> clientes = root6.getChildren();
            for(int i=0;i<clientes.size();i++){
                Element cliente = clientes.get(i);
                if(cpf.equals(cliente.getChildText("cpf"))){
                aux =1;
                break;
                }
                else{
                aux =0;
                }
            }
       }catch(JDOMException | IOException e){}
        return aux;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnOkCliente;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClientesCad;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfValido;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTable tblListaCadCliente;
    private javax.swing.JTabbedPane tpGuias;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model9 = new DefaultTableModel(  
            new Object[] []{ },  
            new String[] {"ID", "Nome", "Sexo", "Idade","Telefone","CPF"}  
         ) {  
  
            public boolean isCellEditable(int row, int col) {  
                    return false;  
            }  
         };
}
