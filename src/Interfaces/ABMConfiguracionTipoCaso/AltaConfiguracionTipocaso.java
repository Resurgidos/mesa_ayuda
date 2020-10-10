/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOAgregarConfiguracion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class AltaConfiguracionTipocaso extends javax.swing.JFrame {
    ControladorConfiguracionTipoCaso controlador = new ControladorConfiguracionTipoCaso();
    


    /**
     * Creates new form AltaConfiguracionTipocaso
     */
    public AltaConfiguracionTipocaso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputNombreTipoCaso = new javax.swing.JTextField();
        volverABM = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        inputInicioVigencia = new javax.swing.JTextField();
        confirmarAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputNumConfiCaso = new javax.swing.JTextField();
        inputCodTipoCaso1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        errorMensaje = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Caso:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Tipo Caso: (PONER LOGO DE LUPA)");

        inputNombreTipoCaso.setEditable(false);
        inputNombreTipoCaso.setBackground(new java.awt.Color(255, 255, 255));
        inputNombreTipoCaso.setBorder(null);
        inputNombreTipoCaso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNombreTipoCasoFocusLost(evt);
            }
        });
        inputNombreTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreTipoCasoActionPerformed(evt);
            }
        });
        inputNombreTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNombreTipoCasoKeyTyped(evt);
            }
        });

        volverABM.setBackground(new java.awt.Color(204, 204, 204));
        volverABM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABM.setForeground(new java.awt.Color(0, 0, 0));
        volverABM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABM.setMnemonic('v');
        volverABM.setText("Volver");
        volverABM.setBorder(null);
        volverABM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverABM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Inicio Vigencia:");

        inputInicioVigencia.setBackground(new java.awt.Color(255, 255, 255));
        inputInicioVigencia.setBorder(null);
        inputInicioVigencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputInicioVigenciaFocusLost(evt);
            }
        });
        inputInicioVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputInicioVigenciaActionPerformed(evt);
            }
        });
        inputInicioVigencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputInicioVigenciaKeyTyped(evt);
            }
        });

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Confirmar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel5.setText("AGREGAR CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Núm. Configuración Tipo Caso:");

        inputNumConfiCaso.setBackground(new java.awt.Color(255, 255, 255));
        inputNumConfiCaso.setBorder(null);
        inputNumConfiCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumConfiCasoActionPerformed(evt);
            }
        });
        inputNumConfiCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNumConfiCasoKeyTyped(evt);
            }
        });

        inputCodTipoCaso1.setBackground(new java.awt.Color(255, 255, 255));
        inputCodTipoCaso1.setBorder(null);
        inputCodTipoCaso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodTipoCaso1FocusLost(evt);
            }
        });
        inputCodTipoCaso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodTipoCaso1ActionPerformed(evt);
            }
        });

        errorMensaje.setBackground(new java.awt.Color(204, 204, 204));
        errorMensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errorMensaje.setForeground(new java.awt.Color(255, 0, 51));
        errorMensaje.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverABM, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputCodTipoCaso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(inputInicioVigencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNombreTipoCaso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNumConfiCaso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumConfiCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodTipoCaso1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNombreTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputInicioVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(errorMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarAgregar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(volverABM)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreTipoCasoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNombreTipoCasoFocusLost

    }//GEN-LAST:event_inputNombreTipoCasoFocusLost

    private void inputNombreTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreTipoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreTipoCasoActionPerformed

    private void inputNombreTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombreTipoCasoKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_inputNombreTipoCasoKeyTyped

    private void volverABMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMActionPerformed

        ABMConfiguracionTipoCaso abmConf = new ABMConfiguracionTipoCaso();
        abmConf.setVisible(true);
        abmConf.tablaConfiguracion("");
        abmConf.setVisible(false);
    }//GEN-LAST:event_volverABMActionPerformed

    private void inputInicioVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInicioVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputInicioVigenciaActionPerformed

    private void inputInicioVigenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputInicioVigenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputInicioVigenciaKeyTyped

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia
        try {
            if (!inputNumConfiCaso.getText().isEmpty()) { 
                if (!inputCodTipoCaso1.getText().isEmpty()) {
                   if (!inputNombreTipoCaso.getText().isEmpty()) {
                        if(!inputNombreTipoCaso.getText().isEmpty()){
                            int validacion = validarFecha(inputNombreTipoCaso.getText());
                            if(validacion==1){
                                DTOAgregarConfiguracion dtoAgregar = new DTOAgregarConfiguracion();
                                dtoAgregar.setNroConfiguracion(Integer.parseInt(inputNumConfiCaso.getText()));
                                dtoAgregar.setCodTipoCaso(Integer.parseInt(inputCodTipoCaso1.getText()));
                                dtoAgregar.setNombreTipoCaso(inputNombreTipoCaso.getText()); 
                                
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");            
                                Date fechaInicio= dateFormat.parse(inputInicioVigencia.getText());
                                dateFormat.applyPattern("yyyy/MM/dd");
                                String fechaBase = dateFormat.format(fechaInicio);
                                Date fechaBaseDatos = dateFormat.parse(fechaBase);
                                
                                System.out.println(fechaBaseDatos);
                             
                                dtoAgregar.setFechaInicioVigencia(fechaBaseDatos);       
                                
                                
                                
                            }else{
                                errorMensaje.setText("Ingrese una fecha valida");
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Por favor ingrese una Fecha de Inicio", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                   }else{
                        JOptionPane.showMessageDialog(this, "Por favor ingrese un Codigo Tipo Caso valido", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                   }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un Codigo Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un Número de Configuración de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_confirmarAgregarActionPerformed

    public void MostrarTipoCasoInput(String codCaso){
        String nombreTCaso = controlador.inputCodTipoCaso(codCaso);     
        if(nombreTCaso == ""){
            JOptionPane.showMessageDialog(this, "Ingrese un Código de Tipo Caso VALIDO", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            inputNombreTipoCaso.setText("");
        }else{
            inputNombreTipoCaso.setText(nombreTCaso);
        }
        
    }
    
    public int validarFecha(String inputNombreTipoCaso){
        //        VALIDACION DE FECHA       
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");            
        Date fechaInicio=null;
        int bandera = 0;
        
        errorMensaje.setText("");
        try {
            
            
            fechaInicio = dateFormat.parse(inputInicioVigencia.getText());
            System.out.println(fechaInicio);
            
            int dia = fechaInicio.getDate();
            int mes = fechaInicio.getMonth();
            int anio = fechaInicio.getYear()+1900;
            
            if(anio>=2020 && anio<=2022){
//                if(mes<=7){
//                    if(mes==2){
//                        if(dia<=28) bandera = 1; else  errorMensaje.setText("Ingrese un dia valido");
//                    }else if(mes%2==0){
//                        if(dia<=30) bandera = 1; else  errorMensaje.setText("Ingrese un dia valido");
//                    }else {
//                        if(dia<=31) bandera = 1; else  errorMensaje.setText("Ingrese un dia valido");
//                    }            
//                }else if(mes>7 && mes<=12){              
//                    if(mes%2==0){
//                        if(dia<=31) bandera = 1; else  errorMensaje.setText("Ingrese un dia valido");                               
//                    }else{
//                        if(dia<=30) bandera = 1;   else  errorMensaje.setText("Ingrese un dia valido");
//                    }  
//                }else{
//                    errorMensaje.setText("Ingrese un mes valido");
//                }
                bandera=1;
            }else{
                errorMensaje.setText("Ingrese un año valido"); 
            }

        } catch (ParseException ex) {
             errorMensaje.setText("Ingrese una fecha valida");
        }
        
        return bandera;
    }
    
    
    private void inputNumConfiCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumConfiCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfiCasoActionPerformed

    private void inputNumConfiCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNumConfiCasoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfiCasoKeyTyped

    private void inputCodTipoCaso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodTipoCaso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodTipoCaso1ActionPerformed

    private void inputCodTipoCaso1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodTipoCaso1FocusLost
        if (!inputCodTipoCaso1.getText().isEmpty()) {
            MostrarTipoCasoInput(inputCodTipoCaso1.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputCodTipoCaso1FocusLost

    private void inputInicioVigenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputInicioVigenciaFocusLost
//        no se usa
    }//GEN-LAST:event_inputInicioVigenciaFocusLost

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
            java.util.logging.Logger.getLogger(AltaConfiguracionTipocaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaConfiguracionTipocaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaConfiguracionTipocaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaConfiguracionTipocaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaConfiguracionTipocaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JLabel errorMensaje;
    private javax.swing.JTextField inputCodTipoCaso1;
    private javax.swing.JTextField inputInicioVigencia;
    private javax.swing.JTextField inputNombreTipoCaso;
    private javax.swing.JTextField inputNumConfiCaso;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton volverABM;
    // End of variables declaration//GEN-END:variables
}
