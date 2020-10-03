
package Interfaces.ABMTipoInstancia;

import Controller.ControladorABMTipoInstancia;
import DTO.DTOTipoInstancia;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Menu;

public class ABMTipoInstancia extends javax.swing.JFrame {
    DefaultTableModel tablaTI;
    ControladorABMTipoInstancia controlTI = new ControladorABMTipoInstancia();
    DTOTipoInstancia dtoTI = new DTOTipoInstancia();
    
    
    public ABMTipoInstancia() {
        initComponents();
        setLocationRelativeTo(null); //Este método me permite poder centrar la ventana en la pantalla
        setTitle("ABM Tipo Instancia");
        tablaTI("");
        tablaTI.fireTableDataChanged();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AgregarTI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoInstancia = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        ModificarTI = new javax.swing.JButton();
        BajaTI = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JTextField();
        botonMostrarDatos = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SECTOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TIPO INSTANCIA");

        filBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filBusquedaActionPerformed(evt);
            }
        });
        filBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filBusquedaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar");

        AgregarTI.setBackground(new java.awt.Color(204, 204, 204));
        AgregarTI.setMnemonic('a');
        AgregarTI.setText("Agregar");
        AgregarTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(filBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarTI)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarTI)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tablaTipoInstancia = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaTipoInstancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod. Tipo Instancia", "Nombre Tipo Instancia", "Nombre Sector", "Nombre Tipo Tarea", "Fecha Fin Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTipoInstancia);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setMnemonic('v');
        jButton3.setText("Volver");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ModificarTI.setBackground(new java.awt.Color(204, 204, 204));
        ModificarTI.setText("Modificar");
        ModificarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTIActionPerformed(evt);
            }
        });

        BajaTI.setBackground(new java.awt.Color(204, 204, 204));
        BajaTI.setMnemonic('b');
        BajaTI.setText("Dar baja");
        BajaTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BajaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaTIActionPerformed(evt);
            }
        });

        ErrorMensaje.setEditable(false);
        ErrorMensaje.setBackground(new java.awt.Color(204, 204, 204));
        ErrorMensaje.setBorder(null);

        botonMostrarDatos.setBackground(new java.awt.Color(204, 204, 204));
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BajaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificarTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMostrarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ErrorMensaje)
                    .addComponent(ModificarTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BajaTI)
                    .addComponent(jButton3))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tablaTI(String nombreTI){ //Método de la tabla que se muestra en la interfaz
        List<DTOTipoInstancia> lista = controlTI.filtroTI(nombreTI);
        tablaTI = new DefaultTableModel();
        tablaTipoInstancia.setModel(tablaTI);
        tablaTI.addColumn("Cod. Tipo Instancia");  //Cada una  de las sentencias es una columna en la tabla modelo que instanciamos
        tablaTI.addColumn("Nombre Tipo Instancia");//que Luego esta tabla le setteamos para mostrar en modelo de la interfaz
        tablaTI.addColumn("Nombre Sector");
        tablaTI.addColumn("Nombre Tipo Tarea");
        tablaTI.addColumn("Fecha Fin Vigencia");
        
        tablaTipoInstancia.setAutoCreateRowSorter(true);
        tablaTipoInstancia.getRowSorter().toggleSortOrder(1);
    
        for (int i = 0; i < lista.size(); i++) {
            Vector fil = new Vector();
            fil.add(lista.get(i).getCodTipoInstancia());
            fil.add(lista.get(i).getNombreTipoInstancia());
            fil.add(lista.get(i).getNombreSector());
            fil.add(lista.get(i).getNombreTipoTarea());
            fil.add(lista.get(i).getFechaHoraFinVigenciaTI());
            tablaTI.addRow(fil);
            
          }
    } 
    private void filBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filBusquedaActionPerformed

    private void AgregarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTIActionPerformed
        //Metodo para agregar un Tipo instancia
        AgregarTipoInstancia agregar = new AgregarTipoInstancia();
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarTIActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Método para volver
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModificarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTIActionPerformed
        //Método para modificar
         int numTabTI = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabTI
       if(numTabTI == -1){
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún sector para modificar");
       } else{
            for(int i=0; i<tablaTipoInstancia.getRowCount(); i++){ //Recorremos la tabla
                if(tablaTipoInstancia.getValueAt(i, 4) != null){ 
                    ErrorMensaje.setForeground(Color.RED);
                    ErrorMensaje.setText("El Tipo instancia esta dado de baja, no se puede modificar");
                }else{
                if(numTabTI==i){ //comparamos de que el numero almacenado en numTabTI sea igual al numero del arreglo

                   
                    dtoTI.setCodTipoInstancia((int)tablaTI.getValueAt(i, 0));
                    dtoTI.setNombreTipoInstancia((String) tablaTI.getValueAt(i, 1));
                    
                    
                    
                    controlTI.filtradoSector(tablaTI.getValueAt(i, 2).toString());
                    dtoTI.setNombreSector(tablaTI.getValueAt(i, 2).toString());
                    
                   
                    String sec = tablaTI.getValueAt(i, 2).toString();
                    List<DTOTipoInstancia> listamod = controlTI.filtradoSector(sec);
                    for (int j = 0; j < listamod.size(); j++) {
                    DTOTipoInstancia tI = (DTOTipoInstancia) listamod.get(j);
                        dtoTI.setCodSector(tI.getCodSector());
                    }
                    controlTI.filtradoTT(tablaTI.getValueAt(i, 3).toString());
                    String tt = tablaTI.getValueAt(i, 3).toString();
                    List<DTOTipoInstancia> lista = controlTI.filtradoTT(tt);
                    for (int j = 0; j < lista.size(); j++) {
                    DTOTipoInstancia tI = (DTOTipoInstancia) lista.get(j);
                    dtoTI.setCodTipoTarea(tI.getCodTipoTarea());
           
                    }
                    dtoTI.setNombreTipoTarea(tablaTI.getValueAt(i, 3).toString());
                    

                    System.out.println(dtoTI.getNombreSector());
                    ModificarTipoInstancia mod = new ModificarTipoInstancia(dtoTI);
                    mod.setVisible(true);
                    this.setVisible(false);
                }


         }
            }
            }
    }//GEN-LAST:event_ModificarTIActionPerformed
   
        
    
    private void BajaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaTIActionPerformed
        //Método para eliminar
        int numTabSec = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if(numTabSec == -1){               
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún TipoInstancia para dar de baja");
       
       }else{
        for(int i=0; i<tablaTipoInstancia.getRowCount(); i++){ //Recorremos la tabla
            if(numTabSec==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                if(tablaTipoInstancia.getValueAt(i, 4) != null){
                    ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                    ErrorMensaje.setText("El sector elegido ya esta dado de baja");
                }else{
                dtoTI.setCodTipoInstancia((int)tablaTipoInstancia.getValueAt(i,0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                int j = JOptionPane.showConfirmDialog(this, "¿Estas seguro que confirmar la baja?", "Dar de baja Sector", JOptionPane.YES_NO_OPTION);
                    if (j == 0) {
                        controlTI.bajaTipoInstancia(dtoTI);
                        JOptionPane.showMessageDialog(this, "Sector Dado de baja"); 
                           }
                        tablaTI("");
               }
            }
        }   
      }
    }//GEN-LAST:event_BajaTIActionPerformed

    private void filBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        tablaTI(filBusqueda.getText());
    }
    }//GEN-LAST:event_filBusquedaKeyPressed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
        //Método Mostrar datos de Sector
        int numTabSec = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if(numTabSec == -1){
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún TipoInstancia para mostrar");
        } else{
            for(int i=0; i<tablaTipoInstancia.getRowCount(); i++){ //Recorremos la tabla

                if(numTabSec==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo

                    System.out.println(tablaTI.getValueAt(i, 0));
                    System.out.println(tablaTI.getValueAt(i, 1));

                    dtoTI.setCodTipoInstancia((int) tablaTI.getValueAt(i, 0)); //Asigna codigo de tipo Instancia a dto
                    dtoTI.setNombreTipoInstancia((String)tablaTI.getValueAt(i, 1));//Asigna nombre de tipo Instancia a dto
                    dtoTI.setFechaHoraFinVigenciaTI((Date)tablaTI.getValueAt(i, 4));//Asigna fecha fin de TipoInstancia a dto
                    
                    //Inicio busqueda de sector
                    controlTI.filtradoSector(tablaTI.getValueAt(i, 2).toString());
                    String sec = tablaTI.getValueAt(i, 2).toString();
                    List<DTOTipoInstancia> listamod = controlTI.filtradoSector(sec);
                    for (int j = 0; j < listamod.size(); j++) {
                    DTOTipoInstancia tI = (DTOTipoInstancia) listamod.get(j);
                        dtoTI.setCodSector(tI.getCodSector()); //Asigna codigo de Sector a dto
                        dtoTI.setFechaFinVigenciaSector(tI.getFechaFinVigenciaSector());//Asigna fecha fin de sector a dto
                    }
                    dtoTI.setNombreSector(tablaTI.getValueAt(i, 2).toString());//Asigna nombre a sector
                    dtoTI.setNombreTipoTarea(tablaTI.getValueAt(i, 3).toString());//Asigna nombre a Tipo Tarea
                    //Inicio busqueda de TipoTarea
                    
                        controlTI.filtradoTT(tablaTI.getValueAt(i, 3).toString());
                        String tt = tablaTI.getValueAt(i, 3).toString();
                        List<DTOTipoInstancia> lista = controlTI.filtradoTT(tt);
                        for (int l = 0; l < lista.size(); l++) {
                        DTOTipoInstancia tI = (DTOTipoInstancia) lista.get(l);
                        dtoTI.setCodTipoTarea(tI.getCodTipoTarea());//Asigna codigo de tipo Tarea a dto
                        dtoTI.setFechaFinVigenciaTT(tI.getFechaFinVigenciaTT());  //Asigna fecha fin de Tipo Tarea a dto     
                        
                        }
                    
                   
                    VerDatosTipoInstancia mostrar = new VerDatosTipoInstancia(dtoTI);
                    mostrar.setVisible(true);

                }

            }
        }

    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void filBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaKeyReleased
          tablaTI(filBusqueda.getText());
    }//GEN-LAST:event_filBusquedaKeyReleased

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTI;
    private javax.swing.JButton BajaTI;
    private javax.swing.JTextField ErrorMensaje;
    private javax.swing.JButton ModificarTI;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JTextField filBusqueda;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTipoInstancia;
    // End of variables declaration//GEN-END:variables
}
