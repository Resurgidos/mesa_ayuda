/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOModificarConf;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class ModificarConfigTipoCaso extends javax.swing.JFrame {

    /**
     * Creates new form ModificarTipoCaso
     */
    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    
    public ModificarConfigTipoCaso(int codSeleccionado) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Configuración Tipo Caso");
        DTOModificarConf dtoModificar = control.buscarPorNumConfig(codSeleccionado);
        inicializarDatos(dtoModificar);
    }

    private ModificarConfigTipoCaso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void inicializarDatos (DTOModificarConf dtoModificar){
        
        inputNumConfMod.setText(Integer.toString(dtoModificar.getNroConfiguracion()));
        inputCodTipoCasoModif.setText(Integer.toString(dtoModificar.getCodTipoCaso()));
        outNombreTipoCaso.setForeground(Color.GRAY);
        inputNumConfMod.setForeground(Color.GRAY);
        outNombreTipoCaso.setText(dtoModificar.getNombreTipoCaso());
        inputFechaDesdeModif.setDate(dtoModificar.getFechaDesde());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputCodTipoCasoModif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        outNombreTipoCaso = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        inputNumConfMod = new javax.swing.JTextField();
        confirmarModificar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputFechaDesdeModif = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Caso:");

        inputCodTipoCasoModif.setBackground(new java.awt.Color(255, 255, 255));
        inputCodTipoCasoModif.setBorder(null);
        inputCodTipoCasoModif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodTipoCasoModifFocusLost(evt);
            }
        });
        inputCodTipoCasoModif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodTipoCasoModifKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Tipo Caso: (PONER LOGO DE LUPA)");

        outNombreTipoCaso.setEditable(false);
        outNombreTipoCaso.setBackground(new java.awt.Color(255, 255, 255));
        outNombreTipoCaso.setBorder(null);
        outNombreTipoCaso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outNombreTipoCasoFocusLost(evt);
            }
        });
        outNombreTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outNombreTipoCasoActionPerformed(evt);
            }
        });
        outNombreTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outNombreTipoCasoKeyTyped(evt);
            }
        });

        volverABMAgregar.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar.setForeground(new java.awt.Color(0, 0, 0));
        volverABMAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar.setMnemonic('v');
        volverABMAgregar.setText("Volver");
        volverABMAgregar.setBorder(null);
        volverABMAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverABMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Desde:");

        inputNumConfMod.setEditable(false);
        inputNumConfMod.setBackground(new java.awt.Color(255, 255, 255));
        inputNumConfMod.setBorder(null);
        inputNumConfMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumConfModActionPerformed(evt);
            }
        });
        inputNumConfMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNumConfModKeyTyped(evt);
            }
        });

        confirmarModificar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarModificar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarModificar.setMnemonic('c');
        confirmarModificar.setText("Modificar");
        confirmarModificar.setBorder(null);
        confirmarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarModificarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(119, 148, 166));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel17.setText("MODIFICAR CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Núm. Configuración Tipo Caso:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(outNombreTipoCaso)
                            .addComponent(inputCodTipoCasoModif, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(inputNumConfMod, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(inputFechaDesdeModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNumConfMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodTipoCasoModif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outNombreTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFechaDesdeModif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverABMAgregar)
                    .addComponent(confirmarModificar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodTipoCasoModifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodTipoCasoModifKeyTyped

        //Declaramos una variable y asignamos un evento
//        char car = evt.getKeyChar();

        //Condicion
//        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_inputCodTipoCasoModifKeyTyped

    private void outNombreTipoCasoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outNombreTipoCasoFocusLost
//        if (!outNombreTipoCaso.getText().isEmpty()) {
//            MostrarSectorFil(outNombreTipoCaso.getText());
//        }else{JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_outNombreTipoCasoFocusLost

    private void outNombreTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outNombreTipoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombreTipoCasoActionPerformed

    private void outNombreTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outNombreTipoCasoKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_outNombreTipoCasoKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMConfiguracionTipoCaso abmConfig = new ABMConfiguracionTipoCaso();
        abmConfig.setVisible(true);
        abmConfig.tablaConfiguracion("");
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void inputNumConfModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumConfModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfModActionPerformed

    private void inputNumConfModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNumConfModKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfModKeyTyped

    private void confirmarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarModificarActionPerformed
        //Método para modificar una Configuracion tipo caso
        DTOModificarConf dtoModificar = new DTOModificarConf();
        dtoModificar.setNroConfiguracion(Integer.parseInt(inputNumConfMod.getText()));
        dtoModificar.setCodTipoCaso(Integer.parseInt(inputCodTipoCasoModif.getText()));
        dtoModificar.setNombreTipoCaso(outNombreTipoCaso.getText());
        dtoModificar.setFechaDesde(inputFechaDesdeModif.getDate());
        control.modificarConfiguracion(dtoModificar);
        

        ABMConfiguracionTipoCaso abmConfig = new ABMConfiguracionTipoCaso();
        abmConfig.tablaConfiguracion("");
        JOptionPane.showMessageDialog(null,"La Configuración de Tipo Caso fue modificado con éxito");
        abmConfig.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmarModificarActionPerformed

    private void inputCodTipoCasoModifFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodTipoCasoModifFocusLost
        //pierde el foco en el input codigo
        if (!inputCodTipoCasoModif.getText().isEmpty()) {
            MostrarTipoCasoInput(inputCodTipoCasoModif.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputCodTipoCasoModifFocusLost

    private void MostrarTipoCasoInput(String text) {
        String nombreTCaso = control.inputCodTipoCaso(text);     
        if(nombreTCaso == ""){
            JOptionPane.showMessageDialog(this, "Ingrese un Código de Tipo Caso VÁLIDO", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            outNombreTipoCaso.setText("");
        }else{
            outNombreTipoCaso.setForeground(Color.gray);
            outNombreTipoCaso.setText(nombreTCaso);
        }
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
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarConfigTipoCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarModificar;
    private javax.swing.JTextField inputCodTipoCasoModif;
    private com.toedter.calendar.JDateChooser inputFechaDesdeModif;
    private javax.swing.JTextField inputNumConfMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField outNombreTipoCaso;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables

   
}