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
public class PrevisualizarRenglon extends javax.swing.JFrame {

    /**
     * Creates new form PrevisualizarRenglon
     */
    public PrevisualizarRenglon() {
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
        verDescSec = new javax.swing.JTextField();
        labeldescver = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        verCodSec = new javax.swing.JTextField();
        labelnombver = new javax.swing.JLabel();
        verNombSec = new javax.swing.JTextField();
        labelFechaFinver = new javax.swing.JLabel();

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

        verDescSec.setEditable(false);
        verDescSec.setBackground(new java.awt.Color(255, 255, 255));
        verDescSec.setBorder(null);
        verDescSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verDescSecKeyTyped(evt);
            }
        });

        labeldescver.setBackground(new java.awt.Color(0, 0, 0));
        labeldescver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labeldescver.setForeground(new java.awt.Color(0, 0, 0));
        labeldescver.setText("Cod. Tipo Instancia:");

        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(0, 0, 0));
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setContentAreaFilled(false);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojonegro.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS DE RENGLÓN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelTituloMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(labelTituloMostrar)
                .addGap(33, 33, 33))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver.setText("Orden TipoCasoTipoInstancia");

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

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver.setText("Minutos Máxima Resolución:");

        verNombSec.setEditable(false);
        verNombSec.setBackground(new java.awt.Color(255, 255, 255));
        verNombSec.setBorder(null);
        verNombSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombSecKeyTyped(evt);
            }
        });

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setText("Nombre Tipo Instancia :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verFechaFinSec, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verDescSec, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verNombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelcodver)
                                .addComponent(verCodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labeldescver)
                                .addComponent(labelFechaFinver)
                                .addComponent(labelnombver)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(botonContinuar))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verCodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelnombver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verNombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeldescver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verDescSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFechaFinver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verFechaFinSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonContinuar)
                .addContainerGap())
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

    private void verDescSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verDescSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verDescSecKeyTyped

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        //Botón para volver al menú de sector
        ABMSector abm = new ABMSector();
        abm.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void verCodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodSecActionPerformed

    private void verCodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodSecKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verCodSecKeyTyped

    private void verNombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombSecKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verNombSecKeyTyped

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
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrevisualizarRenglon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labeldescver;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JTextField verCodSec;
    private javax.swing.JTextField verDescSec;
    private javax.swing.JTextField verFechaFinSec;
    private javax.swing.JTextField verNombSec;
    // End of variables declaration//GEN-END:variables
}
