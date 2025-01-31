
package com.mycompany.quickpasstesis.igu;

import com.mycompany.quickpasstesis.logica.Controladora;
import com.mycompany.quickpasstesis.logica.Usuario;

import com.mycompany.quickpasstesis.persistencia.exceptions.PreexistingEntityException;
import javax.swing.JOptionPane;


public class RegistroUsuariosForm extends javax.swing.JFrame {
    
    private Controladora controladora = new Controladora();
    private Usuario usuarioSesion;


    public RegistroUsuariosForm(Usuario usuarioSesion) {
        initComponents();
        this.usuarioSesion = usuarioSesion;
        cargarRoles();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGeneral = new javax.swing.JPanel();
        jLabelRegistroUsuarios = new javax.swing.JLabel();
        jLabelContrase = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
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

        jLabelContrase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContrase.setText("Contraseña:");

        jLabelRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRol.setText("Rol:");

        txtContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        cmbRol.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ADMINISTRADOR", "USUARIO" }));
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
        jLabelNombre.setText("Nombre Completo:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelID.setText("Número ID:");

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
                        .addComponent(jLabelRegistroUsuarios))
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelID)
                            .addComponent(jLabelContrase)
                            .addComponent(jLabelRol))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContra)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                            .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbRol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 58, Short.MAX_VALUE)
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
                    .addComponent(jLabelContrase)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRol)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 518, Short.MAX_VALUE)
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

        String idUsuario = txtID.getText();
        String nombreComp = txtNombre.getText();
        String email = txtEmail.getText();
        String contrasena = new String(txtContra.getPassword());
        String rolSelec = (String) cmbRol.getSelectedItem();
        
        if ("-".equals(rolSelec)) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un rol válido.");
        return;
        }
        
        Usuario.TipoRol rol = Usuario.TipoRol.valueOf(rolSelec);
        
        // Validar que solo los administradores puedan crear otros administradores
        if (rol == Usuario.TipoRol.ADMINISTRADOR && 
            (usuarioSesion == null || usuarioSesion.getTipoRol() != Usuario.TipoRol.ADMINISTRADOR)) {
            JOptionPane.showMessageDialog(this, "Acceso denegado: Solo los administradores pueden crear otros administradores.");
            return;
        }

        // Crear el nuevo usuario
        Usuario nuevoUsuario = new Usuario(idUsuario, nombreComp, rol, email, contrasena);

        try {
            // Guardar el usuario usando la Controladora
            controladora.crearUsuario(nuevoUsuario, usuarioSesion);
            JOptionPane.showMessageDialog(this, "Usuario guardado con éxito.");
        } catch (PreexistingEntityException e) {
            JOptionPane.showMessageDialog(this, "Error: El usuario ya existe.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el usuario: " + ex.getMessage());
        }
       
        
        
       // control.crearUsuario(usuario,contra,rol);

       // mostrarMensaje("Usuario creado correctamente", "Info", "Creación exitosa");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        txtNombre.setText("");
        txtID.setText("");
        txtEmail.setText("");
        txtContra.setText("");
        cmbRol.setSelectedIndex(0);
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
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegistroUsuarios;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jpanelCeleste;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

private void cargarRoles() {
        // Limpia los elementos anteriores y agrega los valores del enum
        cmbRol.removeAllItems();
        cmbRol.addItem("-");
        for (Usuario.TipoRol rol : Usuario.TipoRol.values()) {
            cmbRol.addItem(rol.name());
        }
    }


}
