
package com.mycompany.quickpasstesis.igu;

import com.mycompany.quickpasstesis.logica.Controladora;
import com.mycompany.quickpasstesis.logica.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class InicioSesionForm extends javax.swing.JFrame {
    
    private Controladora controladora;//creado
    /**
     * Creates new form InicioSesion
     */
    public InicioSesionForm() {
        initComponents();
        controladora = new Controladora();
        
      // Agregar listeners para los campos de texto
        jTextFieldUsuario1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuario1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuario1FocusLost(evt);
            }
        });

        jPasswordFieldContra1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContra1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContra1FocusLost(evt);
            }
        });

        // Crear el administrador si no existe
        try {
            controladora.crearAdministradorSiNoExiste();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelGeneral = new javax.swing.JPanel();
        jLabelInicioSesion1 = new javax.swing.JLabel();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelContrase1 = new javax.swing.JLabel();
        jTextFieldUsuario1 = new javax.swing.JTextField();
        jPasswordFieldContra1 = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jpanelCeleste = new javax.swing.JPanel();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jSeparatorContrase = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGeneral.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabelInicioSesion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabelInicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicioSesion1.setText("Inicio de Sesión");

        jLabelUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario1.setText("Usuario:");

        jLabelContrase1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelContrase1.setText("Contraseña:");

        jTextFieldUsuario1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextFieldUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUsuario1.setText("Ingrese su nombre de usuario");
        jTextFieldUsuario1.setBorder(null);
        jTextFieldUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuario1ActionPerformed(evt);
            }
        });

        jPasswordFieldContra1.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jPasswordFieldContra1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordFieldContra1.setText("jPasswordField1");
        jPasswordFieldContra1.setBorder(null);

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jSeparatorUsuario.setForeground(new java.awt.Color(153, 153, 153));

        jSeparatorContrase.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanelGeneralLayout = new javax.swing.GroupLayout(jPanelGeneral);
        jPanelGeneral.setLayout(jPanelGeneralLayout);
        jPanelGeneralLayout.setHorizontalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabelInicioSesion1))
                            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelContrase1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelUsuario1)
                                    .addComponent(jTextFieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordFieldContra1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorContrase, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelGeneralLayout.setVerticalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelInicioSesion1)
                .addGap(85, 85, 85)
                .addComponent(jLabelUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelContrase1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldContra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorContrase, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         String usuario = jTextFieldUsuario1.getText();
    String contrasena = String.valueOf(jPasswordFieldContra1.getPassword());
    
    if (validarUsuario(usuario, contrasena)) {
            // Si las credenciales son válidas, se abre la pantalla principal
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");

            // Obtener el usuario autenticado
            Usuario usuarioSesion = controladora.autenticarUsuario(usuario, contrasena);

            // Abrir la pantalla principal y pasar el usuario en sesión
            PantallaPrincipalForm pantallaPrincipal = new PantallaPrincipalForm(usuarioSesion);
            pantallaPrincipal.setLocationRelativeTo(null);
            pantallaPrincipal.setVisible(true);
            this.setVisible(false);  // Ocultar la pantalla de inicio de sesión
        } else {
            // Si las credenciales son incorrectas, se muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextFieldUsuario1.setText("");//limpiar los campos
        jPasswordFieldContra1.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jTextFieldUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuario1ActionPerformed
private void jTextFieldUsuario1FocusGained(java.awt.event.FocusEvent evt) {
    // Limpiar el texto del campo usuario cuando el usuario hace clic
    if (jTextFieldUsuario1.getText().equals("Ingrese su nombre de usuario")) {
        jTextFieldUsuario1.setText(""); // Limpiar el texto
        jTextFieldUsuario1.setForeground(Color.BLACK); // Cambiar el color del texto a negro
        jTextFieldUsuario1.setFont(new Font ("Segoe UI",Font.PLAIN,12));
    }
}

private void jPasswordFieldContra1FocusGained(java.awt.event.FocusEvent evt) {
    // Limpiar el texto del campo contraseña cuando el usuario hace clic
    if (String.valueOf(jPasswordFieldContra1.getPassword()).equals("jPasswordField1")) {
        jPasswordFieldContra1.setText(""); // Limpiar el texto
        jPasswordFieldContra1.setForeground(Color.BLACK); // Cambiar el color del texto a negro
    }
}

// Restablecer texto predeterminado cuando el campo pierde el foco
private void jTextFieldUsuario1FocusLost(java.awt.event.FocusEvent evt) {
    if (jTextFieldUsuario1.getText().isEmpty()) {
        jTextFieldUsuario1.setText("Ingrese su nombre de usuario"); // Texto por defecto
        jTextFieldUsuario1.setForeground(Color.GRAY); // Volver el color gris
    }
}

private void jPasswordFieldContra1FocusLost(java.awt.event.FocusEvent evt) {
     if (String.valueOf(jPasswordFieldContra1.getPassword()).isEmpty()) {
        jPasswordFieldContra1.setText("jPasswordField1"); // Texto por defecto
        jPasswordFieldContra1.setForeground(Color.GRAY); // Volver el color gris
    }
}
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabelContrase1;
    private javax.swing.JLabel jLabelInicioSesion1;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPasswordField jPasswordFieldContra1;
    private javax.swing.JSeparator jSeparatorContrase;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JTextField jTextFieldUsuario1;
    private javax.swing.JPanel jpanelCeleste;
    // End of variables declaration//GEN-END:variables

    private boolean validarUsuario(String idUsuario, String contrasena) {
        Usuario usuarioValido = controladora.autenticarUsuario(idUsuario, contrasena);
        return usuarioValido != null;
    }
}
