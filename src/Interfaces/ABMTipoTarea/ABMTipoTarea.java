package Interfaces.ABMTipoTarea;
import main.Menu;
import Controller.ControladorABMTipoTarea;
import DTO.DTOTipoTarea;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ABMTipoTarea extends javax.swing.JFrame {
    
    DefaultTableModel tablaTipoTarea;
    ControladorABMTipoTarea controlador = new ControladorABMTipoTarea();
    DTOTipoTarea dtotipotareamodificar = new DTOTipoTarea();
    //private Object ErrorMensaje;
    
    public ABMTipoTarea() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ABM Tipo Tarea");
        tablaTipoTarea("");
        tablaTipoTarea.fireTableDataChanged();
    }
    
    @SuppressWarnings("unchecked")
    
    public void tablaTipoTarea(String cadenaFiltro){
        List<DTOTipoTarea> lista = controlador.FiltradoMostrarDTO(cadenaFiltro);
        List prueba = null; 
        tablaTipoTarea = new DefaultTableModel();
        TipoTareaTabla.setModel(tablaTipoTarea);
        tablaTipoTarea.addColumn("Codigo Tipo Tarea");
        tablaTipoTarea.addColumn("Nombre Tipo Tarea");
        tablaTipoTarea.addColumn("Descripcion");
        tablaTipoTarea.addColumn("Fin Vigencia");
        
        TipoTareaTabla.setAutoCreateRowSorter(true);
        TipoTareaTabla.getRowSorter().toggleSortOrder(1);
       
        for (int i = 0; i < lista.size(); i++) {
            Vector ejemplo = new Vector();
            ejemplo.add(lista.get(i).getCodTipoTarea());
            ejemplo.add(lista.get(i).getNombreTipoTarea());
            ejemplo.add(lista.get(i).getDescripcionTipoTarea());
            ejemplo.add(lista.get(i).getFechaHoraFinVigenciaTipoTarea());
            tablaTipoTarea.addRow( ejemplo);
        }   
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        MensajeError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TipoTareaTabla = new javax.swing.JTable();
        BotonVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        BotonModificar.setMnemonic('m');
        BotonModificar.setText("Modificar");
        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TIPO TAREA");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar");
        jLabel2.setToolTipText("");

        Filtro.setBackground(new java.awt.Color(204, 204, 204));
        Filtro.setForeground(new java.awt.Color(0, 0, 0));
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });
        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltroKeyTyped(evt);
            }
        });

        BotonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BotonAgregar.setMnemonic('a');
        BotonAgregar.setText("Agregar");
        BotonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAgregar)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BotonAgregar))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BotonEliminar.setMnemonic('b');
        BotonEliminar.setText("Dar Baja");
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        MensajeError.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        TipoTareaTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TipoTareaTabla.setBackground(new java.awt.Color(255, 255, 255));
        TipoTareaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Tipo Tarea", "Nombre Tipo Tarea", "Descripcion", "Fecha fin vigencia"
            }
        ));
        jScrollPane1.setViewportView(TipoTareaTabla);

        BotonVolver.setMnemonic('v');
        BotonVolver.setText("Volver");
        BotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        jButton1.setMnemonic('d');
        jButton1.setText("Mostrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(BotonVolver)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonVolver)
                    .addComponent(BotonEliminar))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        //Botón para volver a Menú principal
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

       int numTabtita = TipoTareaTabla.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       if(numTabtita == -1){
           MensajeError.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           MensajeError.setText("No ha seleccionado ningún tipo tarea para modificar");
       } else{
            for(int i=0; i<TipoTareaTabla.getRowCount(); i++){ //Recorremos la tabla
                if(TipoTareaTabla.getValueAt(i, 3) != null){
                    MensajeError.setForeground(Color.RED);
                    MensajeError.setText("Tipo Tarea esta dado de baja, no se puede modificar");
                }else{
                if(numTabtita==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo

                    System.out.println(tablaTipoTarea.getValueAt(i, 0));
                    System.out.println(tablaTipoTarea.getValueAt(i, 1));

                    dtotipotareamodificar.setCodTipoTarea((int) tablaTipoTarea.getValueAt(i, 0));
                    dtotipotareamodificar.setNombreTipoTarea((String)tablaTipoTarea.getValueAt(i, 1));
                    dtotipotareamodificar.setDescripcionTipoTarea((String) tablaTipoTarea.getValueAt(i, 2));

                    System.out.println(dtotipotareamodificar.getCodTipoTarea());
                    ModificarTipoTarea mod = new ModificarTipoTarea(dtotipotareamodificar);
                    mod.setVisible(true);
                    this.setVisible(false);
                }
        }
      }
     }

    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed

        AgregarTipoTarea agregSector = new AgregarTipoTarea();
        agregSector.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    
    private void FiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyTyped
       
    }//GEN-LAST:event_FiltroKeyTyped

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        int numTabtita = TipoTareaTabla.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if(numTabtita == -1){               
           MensajeError.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           MensajeError.setText("No ha seleccionado ningún tipo tarea para dar de baja");
       
       }else{
        for(int i=0; i<TipoTareaTabla.getRowCount(); i++){ //Recorremos la tabla
            if(numTabtita==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                if(TipoTareaTabla.getValueAt(i, 3) != null){
                    MensajeError.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                    MensajeError.setText("Tipo Tarea elegido ya esta dado de baja");
                }else{
                    dtotipotareamodificar.setCodTipoTarea((int)TipoTareaTabla.getValueAt(i,0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                    int j = JOptionPane.showConfirmDialog(this, ""
                                + "¿Estas seguro que confirmar la baja? \n\n"
                                + "Cod Tipo Tarea: " + (int) TipoTareaTabla.getValueAt(i, 0) + "\n"
                                + "Nombre: " + TipoTareaTabla.getValueAt(i, 1) + "\n"
                                + "Descripción: " + TipoTareaTabla.getValueAt(i, 2) + "\n\n"
                                , "Dar de baja Tipo Caso", JOptionPane.YES_NO_OPTION);
                    if (j == 0) {
                        controlador.bajaTipoTarea(dtotipotareamodificar);
                        JOptionPane.showMessageDialog(this, "Tipo Tarea Dado de baja"); 
                    }
                    tablaTipoTarea("");
               }
            }
        }   
      }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroActionPerformed

    private void FiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){ //Para que al presionar enter me busque por filtro
        tablaTipoTarea(Filtro.getText());
    }
    }//GEN-LAST:event_FiltroKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

       //Método datos de Tipo Tarea
       int numTabTT = TipoTareaTabla.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       if(numTabTT == -1){
           MensajeError.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           MensajeError.setText("No ha seleccionado ningún sector para mostrar");
       } else{
            for(int i=0; i<TipoTareaTabla.getRowCount(); i++){ //Recorremos la tabla
                
                if(numTabTT==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo

                    System.out.println(tablaTipoTarea.getValueAt(i, 0));
                    System.out.println(tablaTipoTarea.getValueAt(i, 1));

                    dtotipotareamodificar.setCodTipoTarea((int) tablaTipoTarea.getValueAt(i, 0));
                    dtotipotareamodificar.setNombreTipoTarea((String)tablaTipoTarea.getValueAt(i, 1));
                    dtotipotareamodificar.setDescripcionTipoTarea((String) tablaTipoTarea.getValueAt(i, 2));
                    dtotipotareamodificar.setFechaHoraFinVigenciaTipoTarea((Date)tablaTipoTarea.getValueAt(i, 3));
                    
                    System.out.println(dtotipotareamodificar.getCodTipoTarea());
                    VerDatosTipoTarea mostrar = new VerDatosTipoTarea(dtotipotareamodificar);
                    mostrar.setVisible(true);
                    
                }

            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyReleased
        // Filtra cuando voy escribiendo
         tablaTipoTarea(Filtro.getText());
    }//GEN-LAST:event_FiltroKeyReleased

    
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMTipoTarea().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField Filtro;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JTable TipoTareaTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
