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
public class AltaConfiguracionTipocaso extends javax.swing.JFrame {

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
        inputnombTI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputcodSec = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        outnombSec = new javax.swing.JTextField();
        confirmarAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputcodTI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputcodTI2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        inputcodTI3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputcodTI4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        inputcodTI1 = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Caso:");

        inputnombTI.setBackground(new java.awt.Color(255, 255, 255));
        inputnombTI.setBorder(null);
        inputnombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputnombTIKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Tipo Caso: (PONER LOGO DE LUPA)");

        inputcodSec.setBackground(new java.awt.Color(255, 255, 255));
        inputcodSec.setBorder(null);
        inputcodSec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodSecFocusLost(evt);
            }
        });
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

        outnombSec.setEditable(false);
        outnombSec.setBackground(new java.awt.Color(255, 255, 255));
        outnombSec.setBorder(null);
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
                .addContainerGap(362, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RENGLÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        inputcodTI.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI.setBorder(null);
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

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Orden TCTI:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Minutos Máxima Iteracion: ");

        inputcodTI2.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI2.setBorder(null);
        inputcodTI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI2ActionPerformed(evt);
            }
        });
        inputcodTI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI2KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Agregar");

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

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cod. Tipo Instancia:");

        inputcodTI3.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI3.setBorder(null);
        inputcodTI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI3ActionPerformed(evt);
            }
        });
        inputcodTI3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI3KeyTyped(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre Tipo Instancia:");

        inputcodTI4.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI4.setBorder(null);
        inputcodTI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI4ActionPerformed(evt);
            }
        });
        inputcodTI4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI4KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(28, 28, 28)
                                    .addComponent(inputcodTI3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(48, 48, 48)
                                    .addComponent(inputcodTI4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputcodTI2)
                                        .addComponent(inputcodTI))))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputcodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(inputcodTI2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(inputcodTI4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(inputcodTI3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        inputcodTI1.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTI1.setBorder(null);
        inputcodTI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI1ActionPerformed(evt);
            }
        });
        inputcodTI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(outnombSec, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputcodSec, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputnombTI, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3)
                    .addComponent(inputcodTI1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputcodTI1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputnombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputcodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outnombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmarAgregar)
                            .addComponent(volverABMAgregar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void inputcodSecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodSecFocusLost
        if (!inputcodSec.getText().isEmpty()) {
            MostrarSectorFil(inputcodSec.getText());
        }else{JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);}

    }//GEN-LAST:event_inputcodSecFocusLost

    private void inputcodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodSecActionPerformed

    private void inputcodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodSecKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_inputcodSecKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMTipoInstancia abmTI = new ABMTipoInstancia();

        abmTI.setVisible(true);
        abmTI.tablaTI("");
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void outnombSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecActionPerformed

    private void outnombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecKeyTyped

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

    private void inputcodTI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI1ActionPerformed

    private void inputcodTI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI1KeyTyped

    private void inputcodTI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI2ActionPerformed

    private void inputcodTI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI2KeyTyped

    private void inputcodTI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI3ActionPerformed

    private void inputcodTI3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI3KeyTyped

    private void inputcodTI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI4ActionPerformed

    private void inputcodTI4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI4KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JTextField inputcodSec;
    private javax.swing.JTextField inputcodTI;
    private javax.swing.JTextField inputcodTI1;
    private javax.swing.JTextField inputcodTI2;
    private javax.swing.JTextField inputcodTI3;
    private javax.swing.JTextField inputcodTI4;
    private javax.swing.JTextField inputnombTI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField outnombSec;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables
}
