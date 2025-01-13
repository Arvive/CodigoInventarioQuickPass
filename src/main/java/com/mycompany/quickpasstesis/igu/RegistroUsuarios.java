
package com.mycompany.quickpasstesis.igu;


public class RegistroUsuarios extends javax.swing.JFrame {


    public RegistroUsuarios() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGeneral = new javax.swing.JPanel();
        jLabelRegistroUsuarios = new javax.swing.JLabel();
        jLabelNomUsuarios = new javax.swing.JLabel();
        jLabelContrase = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        cmbRol = new javax.swing.JComboBox<>();
        btnLimpiar1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jpanelCeleste = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGeneral.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabelRegistroUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabelRegistroUsuarios.setText("Registro Usuarios");

        jLabelNomUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNomUsuarios.setText("Nombre de Usuario:");

        jLabelContrase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContrase.setText("Contraseña:");

        jLabelRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRol.setText("Rol:");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        cmbRol.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ADMIN", "USUARIO" }));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });

        btnLimpiar1.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelID.setText("Cédula:");

        txtID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jpanelCeleste.setBackground(new java.awt.Color(102, 153, 255));
        jpanelCeleste.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jpanelCelesteLayout = new javax.swing.GroupLayout(jpanelCeleste);
        jpanelCeleste.setLayout(jpanelCelesteLayout);
        jpanelCelesteLayout.setHorizontalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        jpanelCelesteLayout.setVerticalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelGeneralLayout = new javax.swing.GroupLayout(jPanelGeneral);
        jPanelGeneral.setLayout(jPanelGeneralLayout);
        jPanelGeneralLayout.setHorizontalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabelRegistroUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneralLayout.createSequentialGroup()
                                .addComponent(jLabelContrase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContra))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneralLayout.createSequentialGroup()
                                .addComponent(jLabelNomUsuarios)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneralLayout.createSequentialGroup()
                                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneralLayout.createSequentialGroup()
                                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNombre)
                                            .addComponent(jLabelEmail)
                                            .addComponent(jLabelID))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneralLayout.createSequentialGroup()
                                        .addComponent(jLabelRol)
                                        .addGap(49, 49, 49)
                                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelGeneralLayout.setVerticalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabelNombre))
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelRegistroUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomUsuarios)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrase)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRol)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar1)
                    .addComponent(btnGuardar))
                .addGap(104, 104, 104))
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String usuario = txtUsuario.getText();
        String contra = txtContra.getText();
        String rol = (String) cmbRol.getSelectedItem();

       // control.crearUsuario(usuario,contra,rol);

       // mostrarMensaje("Usuario creado correctamente", "Info", "Creación exitosa");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabelContrase;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomUsuarios;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegistroUsuarios;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jpanelCeleste;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
