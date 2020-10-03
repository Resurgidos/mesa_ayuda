/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMTipoCaso;

import Controller.ControladorABMTipoCaso;
import DTO.DTOTipoCaso;
import Interfaces.ABMSector.AgregarSector;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import main.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leand
 */
public class ABMTipoCaso extends javax.swing.JFrame {
    DefaultTableModel tablaTipoCaso;
    ControladorABMTipoCaso controlador = new ControladorABMTipoCaso();
    DTOTipoCaso dtoTipoCaso = new DTOTipoCaso();
    
    public ABMTipoCaso() {
        initComponents();
        setLocationRelativeTo(null); 
        setTitle("ABM Tipo Caso");
        
        tablaTipoCaso("");
        tablaTipoCaso.fireTableDataChanged();
//        tablaTipoCaso = new DefaultTableModel();
//        tablaSector.setModel(tablaTipoCaso);
//        tablaTipoCaso.addColumn("Cod.TipoCaso");
//        tablaTipoCaso.addColumn("Nombre TipoCaso");
//        tablaTipoCaso.addColumn("Fin Vigencia TipoCaso");
//        tablaTipoCaso.addColumn("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        botonModificarTipoCaso = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonAddTipoCaso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoCasos = new javax.swing.JTable();
        botonEliminarTipoCaso = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JLabel();
        botonMostrarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setMnemonic('v');
        jButton2.setText("Volver");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonModificarTipoCaso.setMnemonic('m');
        botonModificarTipoCaso.setText("Modificar");
        botonModificarTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarTipoCasoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 153, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TIPO CASO");

        botonAddTipoCaso.setMnemonic('a');
        botonAddTipoCaso.setText("Agregar");
        botonAddTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAddTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddTipoCasoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar");
        jLabel6.setToolTipText("");

        filtro.setBackground(new java.awt.Color(255, 255, 255));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(77, 77, 77)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAddTipoCaso)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAddTipoCaso)
                            .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tablaTipoCasos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaTipoCasos.setBackground(new java.awt.Color(255, 255, 255));
        tablaTipoCasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod Tipo Caso", "Nombre Tipo Caso", "Fecha Fin Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTipoCasos);

        botonEliminarTipoCaso.setMnemonic('b');
        botonEliminarTipoCaso.setText("Dar Baja");
        botonEliminarTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTipoCasoActionPerformed(evt);
            }
        });

        ErrorMensaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ErrorMensaje.setToolTipText("");

        botonMostrarDatos.setMnemonic('d');
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(botonMostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(480, 480, 480)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonEliminarTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonModificarTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(botonMostrarDatos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModificarTipoCaso)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarTipoCaso)
                    .addComponent(jButton2))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void tablaTipoCaso(String cadenaFiltro){
        List<DTOTipoCaso> lista = controlador.FiltradoMostrarDTO(cadenaFiltro);
        List prueba = null;
        tablaTipoCaso = new DefaultTableModel();
        tablaTipoCasos.setModel(tablaTipoCaso);
         tablaTipoCaso.addColumn("Cod.TipoCaso");
         tablaTipoCaso.addColumn("Nombre TipoCaso");
         tablaTipoCaso.addColumn("Fin Vigencia TipoCaso");
//         tablaTipoCasos.getRowSorter().toggleSortOrder(0);

//        tablaTipoCasos.getRowSorter().toggleSortOrder(1);
         tablaTipoCasos.setAutoCreateRowSorter(true);
         tablaTipoCasos.getRowSorter().toggleSortOrder(1);
         for (int i = 0; i < lista.size(); i++) {
            Vector ejemplo = new Vector();
            ejemplo.add(lista.get(i).getCodTipoCaso());
            ejemplo.add(lista.get(i).getNombreTipoCaso());
            ejemplo.add(lista.get(i).getFechaFinVigenciaTipoCaso());
            tablaTipoCaso.addRow( ejemplo); 
        }
         
        
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botón para volver a Menú principal
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonModificarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarTipoCasoActionPerformed
//        Metodo de modificar tipocaso
          int numTabTipoCaso = tablaTipoCasos.getSelectedRow();
          if (numTabTipoCaso == -1){
              ErrorMensaje.setForeground(Color.RED);
              ErrorMensaje.setText("No ha seleccionado ningún tipo caso para modificar");
              
          }else{
              for(int i=0 ; i < tablaTipoCasos.getRowCount(); i++){
                if( tablaTipoCasos.getValueAt(i, 2) != null){
                    ErrorMensaje.setForeground(Color.RED);
                    ErrorMensaje.setText("El Tipo Caso ya esta dado de baja, no se puede modificar");
                }else{
                    if(i==numTabTipoCaso){
                      dtoTipoCaso.setCodTipoCaso((int) tablaTipoCasos.getValueAt(i, 0));
                      dtoTipoCaso.setNombreTipoCaso((String) tablaTipoCasos.getValueAt(i, 1));
                        System.out.println(dtoTipoCaso.getCodTipoCaso());
                        System.out.println(dtoTipoCaso.getNombreTipoCaso());
                      ModificarTipoCaso modificarPantalla = new ModificarTipoCaso(dtoTipoCaso);
                      modificarPantalla.setVisible(true);
                      this.setVisible(false);                     
                    }
                }
                  
              }
          }
    }//GEN-LAST:event_botonModificarTipoCasoActionPerformed

    private void botonAddTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddTipoCasoActionPerformed
        //Botón que llama al método para agregar un nuevo sector, derivandonos a su pantalla
        AgregarTipoCaso agregarTipoCaso = new AgregarTipoCaso();
        agregarTipoCaso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAddTipoCasoActionPerformed

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroKeyTyped

    private void botonEliminarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTipoCasoActionPerformed
        //Eliminar un tipo caso
        int numTabTipoCaso = tablaTipoCasos.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if(numTabTipoCaso == -1){               
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún tipo caso para dar de baja");
       }else{
//            System.out.println(tablaTipoCasos.getRowCount());
            for(int i=0; i<tablaTipoCasos.getRowCount(); i++){ //Recorremos la tabla
                if(numTabTipoCaso==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                    System.out.println("Encontre el numero");
                    System.out.println(tablaTipoCasos.getValueAt(i, 2));
                    if(tablaTipoCasos.getValueAt(i, 2) != null){
                        ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                        ErrorMensaje.setText("El Tipo Caso elegido ya esta dado de baja");
                    }else{  
                        dtoTipoCaso.setCodTipoCaso((int)tablaTipoCasos.getValueAt(i,0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                        System.out.println((int)tablaTipoCasos.getValueAt(i,0));
                         int j = JOptionPane.showConfirmDialog(this, ""
                                + "¿Estas seguro que confirmar la baja? \n\n"
                                + "Cod TipoCaso: " + (int) tablaTipoCasos.getValueAt(i, 0) + "\n"
                                + "Nombre: " + tablaTipoCasos.getValueAt(i, 1) + "\n\n"
                                , "Dar de baja Tipo Caso", JOptionPane.YES_NO_OPTION);
                        if (j == 0) {
                            controlador.bajaTipoCaso(dtoTipoCaso);
                            JOptionPane.showMessageDialog(this, "Tipo Caso dado de baja"); 
                        }
                        tablaTipoCaso("");
                   }
                }
            }   
      }
    }//GEN-LAST:event_botonEliminarTipoCasoActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void filtroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyPressed
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            tablaTipoCaso(filtro.getText());
//        }
    }//GEN-LAST:event_filtroKeyPressed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
//        Ver mas detalles del tipo caso
        int numTabTipoCaso = tablaTipoCasos.getSelectedRow();
          if (numTabTipoCaso == -1){
              ErrorMensaje.setForeground(Color.RED);
              ErrorMensaje.setText("No ha seleccionado ningún tipo caso");  
          }else{
              for(int i=0 ; i < tablaTipoCasos.getRowCount(); i++){             
                    if(i==numTabTipoCaso){
                      dtoTipoCaso.setCodTipoCaso((int) tablaTipoCasos.getValueAt(i, 0));
                      dtoTipoCaso.setNombreTipoCaso((String) tablaTipoCasos.getValueAt(i, 1));
                      dtoTipoCaso.setFechaFinVigenciaTipoCaso((Date) tablaTipoCasos.getValueAt(i, 2));
      
                      VerDatosTipoCasos verDatos = new VerDatosTipoCasos(dtoTipoCaso);
                      verDatos.setVisible(true);
                      this.setVisible(false);                     
                    }                               
              }
          }
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyReleased

         tablaTipoCaso(filtro.getText());
    }//GEN-LAST:event_filtroKeyReleased

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
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMTipoCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMensaje;
    private javax.swing.JButton botonAddTipoCaso;
    private javax.swing.JButton botonEliminarTipoCaso;
    private javax.swing.JButton botonModificarTipoCaso;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JTextField filtro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTipoCasos;
    // End of variables declaration//GEN-END:variables
}
