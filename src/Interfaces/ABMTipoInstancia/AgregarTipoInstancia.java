package Interfaces.ABMTipoInstancia;

import Controller.ControladorABMTipoInstancia;
import DTO.DTOTipoInstancia;
import com.sun.glass.events.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;


public class AgregarTipoInstancia extends javax.swing.JFrame {
DTOTipoInstancia dtoTI = new DTOTipoInstancia();
ControladorABMTipoInstancia control = new ControladorABMTipoInstancia();


    public AgregarTipoInstancia() {
      // inputcodTT.requestFocus();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Tipo Instancia");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputcodTI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputnombTI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputcodSec = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputcodTT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        outnombSec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        outnombTT = new javax.swing.JTextField();
        buscarSectorAgregar = new javax.swing.JButton();
        buscarTTAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 153, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Agregar Tipo Instancia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(37, 37, 37))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cod. Tipo Instancia:");

        inputcodTI.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTIActionPerformed(evt);
            }
        });
        inputcodTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTIKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Instancia:");

        inputnombTI.setBackground(new java.awt.Color(255, 255, 255));
        inputnombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputnombTIKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Sector:");

        inputcodSec.setBackground(new java.awt.Color(255, 255, 255));
        inputcodSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodSecActionPerformed(evt);
            }
        });
        inputcodSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodSecKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cod. Tipo Tarea:");

        inputcodTT.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTTActionPerformed(evt);
            }
        });
        inputcodTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTTKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Sector:");

        outnombSec.setEditable(false);
        outnombSec.setBackground(new java.awt.Color(255, 255, 255));
        outnombSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombSecActionPerformed(evt);
            }
        });
        outnombSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombSecKeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre Tipo Tarea:");

        outnombTT.setEditable(false);
        outnombTT.setBackground(new java.awt.Color(255, 255, 255));
        outnombTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombTTActionPerformed(evt);
            }
        });
        outnombTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombTTKeyTyped(evt);
            }
        });

        buscarSectorAgregar.setBackground(new java.awt.Color(204, 204, 204));
        buscarSectorAgregar.setText("Buscar");
        buscarSectorAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSectorAgregarActionPerformed(evt);
            }
        });

        buscarTTAgregar.setBackground(new java.awt.Color(204, 204, 204));
        buscarTTAgregar.setText("Buscar");
        buscarTTAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTTAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outnombSec)
                            .addComponent(inputcodTT)
                            .addComponent(outnombTT)
                            .addComponent(inputcodSec)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputnombTI))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(inputcodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarSectorAgregar)
                    .addComponent(buscarTTAgregar))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputcodTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputnombTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputcodSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarSectorAgregar))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outnombSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputcodTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(buscarTTAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(outnombTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Metodo para agregar un sector
       dtoTI.setCodSector(Integer.parseInt(inputcodSec.getText()));
       control.filtroAgregar(dtoTI);
       List<DTOTipoInstancia> list = control.filtroAgregar(dtoTI);
        for (int i = 0; i < list.size(); i++) {
            outnombSec.setText(list.get(i).getNombreSector());
            
        }
           
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputcodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTIActionPerformed

    private void inputcodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTIKeyTyped

    private void inputnombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputnombTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_inputnombTIKeyTyped

    private void inputcodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodSecKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_inputcodSecKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón para volver al menú de sector
        ABMTipoInstancia abmTI = new ABMTipoInstancia();
        abmTI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputcodTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTTKeyTyped

    private void outnombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecKeyTyped

    private void inputcodTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTTActionPerformed

    private void outnombTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTActionPerformed

    private void outnombTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTKeyTyped

    private void outnombSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecActionPerformed

    private void inputcodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodSecActionPerformed

    private void buscarSectorAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSectorAgregarActionPerformed
        //Método para buscar sector por codigo
        
    }//GEN-LAST:event_buscarSectorAgregarActionPerformed

    private void buscarTTAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTTAgregarActionPerformed
        //Método para buscar Tipo Tarea filtrado
       dtoTI.setCodTipoTarea(Integer.parseInt(inputcodTT.getText()));
       control.filtroAgregar(dtoTI);
       outnombTT.setText(dtoTI.getNombreTipoTarea());
       
    }//GEN-LAST:event_buscarTTAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarSectorAgregar;
    private javax.swing.JButton buscarTTAgregar;
    private javax.swing.JTextField inputcodSec;
    private javax.swing.JTextField inputcodTI;
    private javax.swing.JTextField inputcodTT;
    private javax.swing.JTextField inputnombTI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField outnombSec;
    private javax.swing.JTextField outnombTT;
    // End of variables declaration//GEN-END:variables
}
