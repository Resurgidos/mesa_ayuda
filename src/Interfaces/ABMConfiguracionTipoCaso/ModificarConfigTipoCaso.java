/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMConfiguracionTipoCaso;

/**
 *
 * @author leand
 */
public class ModificarConfigTipoCaso extends javax.swing.JFrame {

    /**
     * Creates new form ModificarTipoCaso
     */
    public ModificarConfigTipoCaso() {
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

        jPanel1 = new javax.swing.JPanel();
        inputcodTImod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputnombTImod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inputcodSecmod = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        outnombSecmod = new javax.swing.JTextField();
        confirmarAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        inputcodTImod.setEditable(false);
        inputcodTImod.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTImod.setBorder(null);
        inputcodTImod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTImodActionPerformed(evt);
            }
        });
        inputcodTImod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTImodKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cod.Tipo Caso");

        inputnombTImod.setBackground(new java.awt.Color(255, 255, 255));
        inputnombTImod.setBorder(null);
        inputnombTImod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputnombTImodKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Tipo Caso:");

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        jLabel5.setText("MODIFICAR CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        inputcodSecmod.setEditable(false);
        inputcodSecmod.setBackground(new java.awt.Color(255, 255, 255));
        inputcodSecmod.setBorder(null);
        inputcodSecmod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodSecmodFocusLost(evt);
            }
        });
        inputcodSecmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodSecmodActionPerformed(evt);
            }
        });
        inputcodSecmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodSecmodKeyTyped(evt);
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

        outnombSecmod.setEditable(false);
        outnombSecmod.setBackground(new java.awt.Color(255, 255, 255));
        outnombSecmod.setBorder(null);
        outnombSecmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombSecmodActionPerformed(evt);
            }
        });
        outnombSecmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombSecmodKeyTyped(evt);
            }
        });

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Núm. Configuración Tipo Caso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(outnombSecmod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(inputcodSecmod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputnombTImod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputcodTImod, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(inputcodTImod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputnombTImod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputcodSecmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outnombSecmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarAgregar)
                    .addComponent(volverABMAgregar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputcodTImodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTImodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTImodActionPerformed

    private void inputcodTImodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTImodKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTImodKeyTyped

    private void inputnombTImodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputnombTImodKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputnombTImodKeyTyped

    private void inputcodSecmodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodSecmodFocusLost
        // TODO add your handling code here:

        if (!inputcodSecmod.getText().isEmpty()){
            MostrarSectorFil(inputcodSecmod.getText());
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

        ///lost
    }//GEN-LAST:event_inputcodSecmodFocusLost

    private void inputcodSecmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodSecmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodSecmodActionPerformed

    private void inputcodSecmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodSecmodKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_inputcodSecmodKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMTipoInstancia abmTI = new ABMTipoInstancia();
        abmTI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void outnombSecmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombSecmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecmodActionPerformed

    private void outnombSecmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombSecmodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecmodKeyTyped

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia
        DTOTipoInstancia dtoModificar = new DTOTipoInstancia();
        dtoModificar.setCodTipoInstancia(Integer.parseInt(inputcodTImod.getText()));
        dtoModificar.setNombreTipoInstancia(inputnombTImod.getText());
        dtoModificar.setCodSector(Integer.parseInt(inputcodSecmod.getText()));
        dtoModificar.setNombreSector(outnombSecmod.getText());
        dtoModificar.setCodTipoTarea(Integer.parseInt(inputcodTTmod.getText()));
        dtoModificar.setNombreTipoTarea(outnombTTmod.getText());
        control.modificarTipoInstancia(dtoModificar);

        ABMTipoInstancia abmti = new ABMTipoInstancia();
        abmti.tablaTI("");
        JOptionPane.showMessageDialog(null,"El tipoInstancia fue modificado con éxito");
        abmti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmarAgregarActionPerformed

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
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JTextField inputcodSecmod;
    private javax.swing.JTextField inputcodTImod;
    private javax.swing.JTextField inputnombTImod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField outnombSecmod;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables
}
