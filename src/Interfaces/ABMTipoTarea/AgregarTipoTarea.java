package Interfaces.ABMTipoTarea;
import Controller.ControladorABMTipoTarea;
import DTO.DTOTipoTarea;
//import java.awt.event.KeyEvent;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;



public class AgregarTipoTarea extends javax.swing.JFrame {

    ControladorABMTipoTarea control = new ControladorABMTipoTarea();
    DTOTipoTarea dtotipotarea = new DTOTipoTarea();
    public AgregarTipoTarea() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Tipo Tarea");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        camponombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campodes = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campocodigo = new javax.swing.JTextField();
        volver = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre TipoTarea:");

        camponombre.setBackground(new java.awt.Color(255, 255, 255));
        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });
        camponombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                camponombreKeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Descripción TipoTarea:");

        campodes.setBackground(new java.awt.Color(255, 255, 255));
        campodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campodesActionPerformed(evt);
            }
        });

        confirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmar.setForeground(new java.awt.Color(0, 0, 0));
        confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/confirmar.png"))); // NOI18N
        confirmar.setMnemonic('c');
        confirmar.setText("Confirmar");
        confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 153, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGREGAR2.png"))); // NOI18N
        jLabel5.setText("AGREGAR TIPO TAREA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(92, 92, 92))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(44, 44, 44))
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Codigo Tipo Tarea:");

        campocodigo.setBackground(new java.awt.Color(255, 255, 255));
        campocodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocodigoActionPerformed(evt);
            }
        });
        campocodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campocodigoKeyTyped(evt);
            }
        });

        volver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 0, 0));
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        volver.setMnemonic('v');
        volver.setText("Volver");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addGap(89, 89, 89)
                        .addComponent(volver)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campodes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campocodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campocodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(confirmar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        ABMTipoTarea abmtipotarea = new ABMTipoTarea ();
        abmtipotarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
       Validar();
       
    }//GEN-LAST:event_confirmarActionPerformed

    private void campocodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocodigoActionPerformed
    
    }//GEN-LAST:event_campocodigoActionPerformed

    
    private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombreActionPerformed
        
    }//GEN-LAST:event_camponombreActionPerformed
    
    private void campodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campodesActionPerformed

    }//GEN-LAST:event_campodesActionPerformed

    private void campocodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campocodigoKeyTyped

        char car = evt.getKeyChar();
       if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_campocodigoKeyTyped

    private void camponombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camponombreKeyTyped
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_camponombreKeyTyped

     
    
     
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTipoTarea().setVisible(true);
            }
        });
    }
    private void Validar() {
        try {
            if (!campocodigo.getText().isEmpty()) { //Para que no sea vacio código 
                if (!camponombre.getText().isEmpty()) { //Para que no sea vacio el nombre
                    do{
                        dtotipotarea.setCodTipoTarea(Integer.parseInt(campocodigo.getText())); //Asigno los inputs a las variables de instancia 
                        dtotipotarea.setNombreTipoTarea(camponombre.getText());
                        dtotipotarea.setDescripcionTipoTarea(campodes.getText()); 
                        control.agregarTipoTarea(dtotipotarea); //Envia los datos de la pantalla al controlador
                        
                        if(dtotipotarea.getVerificarError()== 0){//si el mensaje de error del dto es ""(no hubo error) grabamos los datos
                        ABMTipoTarea volver = new ABMTipoTarea(); //Oculto la pagina para dar de alta volviendo al menu de Sector                                                                                                                    
                        JOptionPane.showMessageDialog(this, "Tipo Tarea fue creado con éxito");
                        volver.setVisible(true);
                        volver.tablaTipoTarea("");
                        this.setVisible(false);
                        }else{
                           JOptionPane.showMessageDialog(this,dtotipotarea.getMensajeError());
                            //System.out.println("acá esta el error, en registro de sector en validar");
                           dtotipotarea.setVerificarError(0);
                       } }while(dtotipotarea.getVerificarError() != 0);
                        //Aca setteo el sector al controller
                      
            //y un chatch en el caso que no se pueda crear el sector
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre de Tipo Tarea", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese el codigo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campocodigo;
    private javax.swing.JTextField campodes;
    private javax.swing.JTextField camponombre;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
