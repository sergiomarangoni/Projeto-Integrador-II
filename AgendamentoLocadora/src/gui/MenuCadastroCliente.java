/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Cadastro.CadastroCliente;
import com.toedter.calendar.JDateChooser;
import database.CadastroClienteDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author michael.aroriz
 */
public class MenuCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form MenuCadastroCliente
     */
    public MenuCadastroCliente() {
        initComponents();
        //Código para as mensagens de campos obrigatórios iniciarem invisíveis
        jLabelMsgNome.setVisible(false);
        jLabelMsgSexo.setVisible(false);
        jLabelMsgBairro.setVisible(false);
        jLabelMsgCidade.setVisible(false);
        jLabelMsgComplemento.setVisible(false);
        jLabelMsgCpf.setVisible(false);
        jLabelMsgData.setVisible(false);
        jLabelMsgEndereco.setVisible(false);
        jLabelMsgUF.setVisible(false);
        jLabelMsgNumero.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCpfFormatted = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        textSexo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textComplemento = new javax.swing.JTextField();
        textBairro = new javax.swing.JTextField();
        textUF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        jLabelMsgNome = new javax.swing.JLabel();
        jLabelMsgSexo = new javax.swing.JLabel();
        jLabelMsgData = new javax.swing.JLabel();
        jLabelMsgCpf = new javax.swing.JLabel();
        jLabelMsgEndereco = new javax.swing.JLabel();
        jLabelMsgNumero = new javax.swing.JLabel();
        jLabelMsgComplemento = new javax.swing.JLabel();
        jLabelMsgBairro = new javax.swing.JLabel();
        jLabelMsgCidade = new javax.swing.JLabel();
        jLabelMsgUF = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Cadastro de Cliente");
        jInternalFrame1.setVisible(true);

        jPanel1.setToolTipText("Cliente"); // NOI18N

        jLabel1.setText("Nome:");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de Nascimento:");

        jLabel3.setText("CPF:");

        try {
            textCpfFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpfFormatted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfFormattedActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo:");

        textSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Masculino", "Feminino"}));
        textSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSexoActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        jLabel6.setText("Numero:");

        textNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroActionPerformed(evt);
            }
        });

        jLabel8.setText("Complemento:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("UF:");

        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        jLabel11.setText("Cidade:");

        textCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCidadeActionPerformed(evt);
            }
        });

        jLabelMsgNome.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgNome.setText("*Campo Obrigatório");

        jLabelMsgSexo.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgSexo.setText("\"Campo Obrigatório");

        jLabelMsgData.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgData.setText("\"Campo Obrigatório");

        jLabelMsgCpf.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgCpf.setText("\"Campo Obrigatório");

        jLabelMsgEndereco.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgEndereco.setText("\"Campo Obrigatório");

        jLabelMsgNumero.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgNumero.setText("\"Campo Obrigatório");

        jLabelMsgComplemento.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgComplemento.setText("\"Campo Obrigatório");

        jLabelMsgBairro.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgBairro.setText("\"Campo Obrigatório");

        jLabelMsgCidade.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgCidade.setText("\"Campo Obrigatório");

        jLabelMsgUF.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMsgUF.setText("\"Campo Obrigatório");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabelMsgData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMsgCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUF)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabelMsgUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCadastrar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabelMsgEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMsgNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textNumero, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCpfFormatted)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMsgCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabelMsgComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textBairro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabelMsgBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabelMsgNome, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelMsgSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMsgSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCpfFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgData)
                    .addComponent(jLabelMsgCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgEndereco)
                    .addComponent(jLabelMsgNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgComplemento)
                    .addComponent(jLabelMsgBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgCidade)
                    .addComponent(jLabelMsgUF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonCadastrar))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   // static Cadastro.CadastroCliente ccl = new CadastroCliente(null, null, null, null, null, null, null, null, null, null);
    
    
    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        //Se botão Cancelar for selecionada, dados serão apagados
        if (ButtonCancelar.isEnabled()) {
            textNome = null;
            textBairro = null;
            textCidade = null;
            textComplemento = null;
            textCpfFormatted = null;
            jDate = null;
            textEndereco = null;
            textNumero = null;
            textSexo = null;
            textUF = null;
        }
        this.dispose();
        new MenuInicial().setVisible(true);

    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        
         //Variável necessária para verificação de campos preenchidos
        int j = 0;
        if (ButtonCadastrar.isEnabled()) {
            //Condição para identificar campos não preenchidos
            if (textNome.getText().isEmpty()) {
                jLabelMsgNome.setVisible(true);
            } else {
                jLabelMsgNome.setVisible(false);
                j++;
            }
            if (textSexo.getSelectedItem().equals("")) {
                jLabelMsgSexo.setVisible(true);
            } else {
                jLabelMsgSexo.setVisible(false);
                j++;
            }
            if (jDate.getJCalendar().isValid()){
                jLabelMsgData.setVisible(false);
            } else {
                jLabelMsgData.setVisible(true);
                j++;
            }
            if (textCpfFormatted.getText().equals("   .   .   -  ")) {
                jLabelMsgCpf.setVisible(true);
            } else {
                jLabelMsgCpf.setVisible(false);
                j++;
            }
            if (textEndereco.getText().isEmpty()) {
                jLabelMsgEndereco.setVisible(true);
            } else {
                jLabelMsgEndereco.setVisible(false);
                j++;
            }
            if (textNumero.getText().isEmpty()) {
                jLabelMsgNumero.setVisible(true);
            } else {
                jLabelMsgNumero.setVisible(false);
                j++;
            }
            if (textComplemento.getText().isEmpty()) {
                jLabelMsgComplemento.setVisible(true);
            } else {
                jLabelMsgComplemento.setVisible(false);
                j++;
            }
            if (textBairro.getText().isEmpty()) {
                jLabelMsgBairro.setVisible(true);
            } else {
                jLabelMsgBairro.setVisible(false);
                j++;
            }
            if (textCidade.getText().isEmpty()) {
                jLabelMsgCidade.setVisible(true);
            } else {
                jLabelMsgCidade.setVisible(false);
                j++;
            }
            if (textUF.getText().isEmpty()) {
                jLabelMsgUF.setVisible(true);
            } else {
                jLabelMsgUF.setVisible(false);
                j++;
            }
        }
        //Se todos os campos estiverem preenchidos, os dados são armazenados
        if (ButtonCadastrar.isEnabled() && j == 10) {
            CadastroCliente cliente = new CadastroCliente(null,null,null,null,null,null,null,null,null,null);
            
            //preenchimento dos dados no formulario e encaminhamento para execução da entrada do cliente
            cliente.setNome(textNome.getText());
            cliente.setCpf(textCpfFormatted.getText());
            cliente.setData(jDate.getDate());
            cliente.setSexo(textSexo.getSelectedItem());
            cliente.setEndereco(textEndereco.getText());
            cliente.setNumero(textNumero.getText());
            cliente.setComplemento(textComplemento.getText());
            cliente.setBairro(textBairro.getText());
            cliente.setCidade(textCidade.getText());
            cliente.setUf(textUF.getText());
            
            CadastroClienteDAO dao = new CadastroClienteDAO();
            dao.CadastroClientes(cliente);
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
            
            
            //fecha a janela de Cadastro e volta para o menu principal          
            this.dispose();
            new MenuInicial().setVisible(true);
        }
    }//GEN-LAST:event_ButtonCadastrarActionPerformed


    private void textNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroActionPerformed

    }//GEN-LAST:event_textNumeroActionPerformed

    private void textSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSexoActionPerformed
        
    }//GEN-LAST:event_textSexoActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed

    }//GEN-LAST:event_textNomeActionPerformed

    private void textCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCidadeActionPerformed

    }//GEN-LAST:event_textCidadeActionPerformed

    private void textCpfFormattedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfFormattedActionPerformed

    }//GEN-LAST:event_textCpfFormattedActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonCancelar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMsgBairro;
    private javax.swing.JLabel jLabelMsgCidade;
    private javax.swing.JLabel jLabelMsgComplemento;
    private javax.swing.JLabel jLabelMsgCpf;
    private javax.swing.JLabel jLabelMsgData;
    private javax.swing.JLabel jLabelMsgEndereco;
    private javax.swing.JLabel jLabelMsgNome;
    private javax.swing.JLabel jLabelMsgNumero;
    private javax.swing.JLabel jLabelMsgSexo;
    private javax.swing.JLabel jLabelMsgUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JFormattedTextField textCpfFormatted;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumero;
    private javax.swing.JComboBox textSexo;
    private javax.swing.JTextField textUF;
    // End of variables declaration//GEN-END:variables

    
}
