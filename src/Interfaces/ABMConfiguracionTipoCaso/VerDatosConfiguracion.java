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
public class VerDatosConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form VerDatosConfiguracion
     */
    public VerDatosConfiguracion() {
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
        verFechaFinSec = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        verCodTI = new javax.swing.JTextField();
        labelcodver2 = new javax.swing.JLabel();
        labelnombver = new javax.swing.JLabel();
        verCodSec = new javax.swing.JTextField();
        verNombTI = new javax.swing.JTextField();
        labelnombver2 = new javax.swing.JLabel();
        labelFechaFinver = new javax.swing.JLabel();
        verNombSec = new javax.swing.JTextField();
        verFechaFinTI = new javax.swing.JTextField();
        labelFechaFinver2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        confirmarAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        verFechaFinSec.setEditable(false);
        verFechaFinSec.setBackground(new java.awt.Color(255, 255, 255));
        verFechaFinSec.setBorder(null);
        verFechaFinSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinSecKeyTyped(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(204, 204, 204));
        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(0, 0, 0));
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelTituloMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(labelTituloMostrar)
                .addGap(29, 29, 29))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver.setText("Núm. Configuración Tipo Caso:");

        verCodTI.setEditable(false);
        verCodTI.setBackground(new java.awt.Color(255, 255, 255));
        verCodTI.setBorder(null);
        verCodTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodTIActionPerformed(evt);
            }
        });
        verCodTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodTIKeyTyped(evt);
            }
        });

        labelcodver2.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver2.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver2.setText("Fecha Inicio Vigencia");

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver.setText("Cod. Tipo Caso:");

        verCodSec.setEditable(false);
        verCodSec.setBackground(new java.awt.Color(255, 255, 255));
        verCodSec.setBorder(null);
        verCodSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodSecActionPerformed(evt);
            }
        });
        verCodSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodSecKeyTyped(evt);
            }
        });

        verNombTI.setEditable(false);
        verNombTI.setBackground(new java.awt.Color(255, 255, 255));
        verNombTI.setBorder(null);
        verNombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombTIKeyTyped(evt);
            }
        });

        labelnombver2.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver2.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver2.setText("Fecha Fin Vigencia");

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setText("Nombre Tipo Caso :");

        verNombSec.setEditable(false);
        verNombSec.setBackground(new java.awt.Color(255, 255, 255));
        verNombSec.setBorder(null);
        verNombSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombSecKeyTyped(evt);
            }
        });

        verFechaFinTI.setEditable(false);
        verFechaFinTI.setBackground(new java.awt.Color(255, 255, 255));
        verFechaFinTI.setBorder(null);
        verFechaFinTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinTIKeyTyped(evt);
            }
        });

        labelFechaFinver2.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver2.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver2.setText("Fecha Verificación:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RENGLÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Orden TCTI", "Minutos Max", "Cod. Tipo Instancia", "Nomb. Tipo Instancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Verificar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verCodTI, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(labelcodver)
                    .addComponent(labelnombver)
                    .addComponent(labelFechaFinver)
                    .addComponent(verFechaFinTI)
                    .addComponent(labelcodver2)
                    .addComponent(labelnombver2)
                    .addComponent(labelFechaFinver2)
                    .addComponent(verFechaFinSec, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(verNombSec)
                    .addComponent(verCodSec)
                    .addComponent(verNombTI)
                    .addComponent(botonContinuar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(verCodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelnombver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verNombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(labelFechaFinver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verFechaFinTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(labelcodver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verCodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelnombver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verNombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFechaFinver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verFechaFinSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonContinuar)
                    .addComponent(confirmarAgregar))
                .addGap(12, 12, 12))
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

    private void verFechaFinSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinSecKeyTyped

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        //Botón para volver al menú de sector
        ABMTipoInstancia abm = new ABMTipoInstancia();
        abm.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void verCodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTIActionPerformed

    private void verCodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verCodTIKeyTyped

    private void verCodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodSecActionPerformed

    private void verCodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodSecKeyTyped

    private void verNombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verNombTIKeyTyped

    private void verNombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verNombSecKeyTyped

    private void verFechaFinTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinTIKeyTyped

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia
        try {
            if (!inputcodTI.getText().isEmpty()) { //Para que no sea vacio código
                if (!inputnombTI.getText().isEmpty()) {//Para que el nombre del TI no este vacio
                    if (!inputcodSec.getText().isEmpty()) { //Para que no sea vacio el cod de sector
                        if (!inputcodTT.getText().isEmpty()) { //Para que el cod de Tarea no sea vacio
                            do{
                                DTOTipoInstancia dtoAgregar = new DTOTipoInstancia();
                                dtoAgregar.setCodTipoInstancia(Integer.parseInt(inputcodTI.getText()));
                                dtoAgregar.setNombreTipoInstancia(inputnombTI.getText());
                                dtoAgregar.setCodSector(Integer.parseInt(inputcodSec.getText()));
                                dtoAgregar.setNombreSector(outnombSec.getText());
                                dtoAgregar.setCodTipoTarea(Integer.parseInt(inputcodTT.getText()));
                                dtoAgregar.setNombreTipoTarea(outnombTT.getText());
                                control.agregarTipoInstancia(dtoAgregar);

                                if(dtoTI.getVerificarError()== 0){//si el mensaje de error del dto es 0(no hubo error) grabamos los datos
                                    ABMTipoInstancia volver = new ABMTipoInstancia(); //Oculto la pagina para dar de alta volviendo al menu de Sector
                                    JOptionPane.showMessageDialog(this, "El Tipo Instancia fue creado con éxito");
                                    volver.setVisible(true);
                                    volver.tablaTI("");
                                    this.setVisible(false);
                                }else{
                                    JOptionPane.showMessageDialog(this,dtoTI.getErrorMensaje());
                                    System.out.println("acá esta el error, en registro de sector en validar");
                                    dtoTI.setVerificarError(0);
                                } }while(dtoTI.getVerificarError() != 0);

                                //y un chatch en el caso que no se pueda crear el Tipo Instancia
                            } else {
                                JOptionPane.showMessageDialog(this, "Por favor ingrese el código del Tipo de Tarea", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Por favor ingrese el código del sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese el código del Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
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
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelFechaFinver2;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labelcodver2;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JLabel labelnombver2;
    private javax.swing.JTextField verCodSec;
    private javax.swing.JTextField verCodTI;
    private javax.swing.JTextField verFechaFinSec;
    private javax.swing.JTextField verFechaFinTI;
    private javax.swing.JTextField verNombSec;
    private javax.swing.JTextField verNombTI;
    // End of variables declaration//GEN-END:variables
}
