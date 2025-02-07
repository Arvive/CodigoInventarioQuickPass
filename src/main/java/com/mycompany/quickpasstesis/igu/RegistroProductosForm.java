/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quickpasstesis.igu;

import com.mycompany.quickpasstesis.logica.Controladora;
import com.mycompany.quickpasstesis.logica.Producto;
import java.math.BigDecimal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class RegistroProductosForm extends javax.swing.JFrame {
    private ModuloInventarioForm moduloInventarioForm;
    Controladora control = new Controladora();

    /**
     * Creates new form RegistroUsuarios
     */
    public RegistroProductosForm(ModuloInventarioForm moduloInventarioForm) {
       this.moduloInventarioForm = moduloInventarioForm;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
          // Hacer los campos no editables y establecer el valor por defecto
    txtPrecio.setEditable(false); // Hacer el campo no editable
    txtPrecio.setText("1");       // Establecer el valor por defecto

    txtCantidad.setEditable(false); // Hacer el campo no editable
    txtCantidad.setText("35");       // Establecer el valor por defecto
        
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
        jPanelInfo = new javax.swing.JPanel();
        jLabelnumSerie = new javax.swing.JLabel();
        txtnumSerie = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelNumCaja = new javax.swing.JLabel();
        txtNumCaja = new javax.swing.JTextField();
        jLabelOficina = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jComboBoxOficina = new javax.swing.JComboBox<>();
        jLabelObservac = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jComboBoxcategoria = new javax.swing.JComboBox<>();
        jpanelCeleste = new javax.swing.JPanel();
        jLaberRegistroQuickPass = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanelInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabelnumSerie.setText("Número Serie:");

        txtnumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumSerieActionPerformed(evt);
            }
        });

        jLabelCategoria.setText("Categoria Producto:");

        jLabelNumCaja.setText("Número de Caja:");

        jLabelOficina.setText("Oficina:");

        jLabelPrecio.setText("Precio Dispositivo:");

        jLabelEstado.setText("Estado:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Devuelto", "Defectuoso", "Asignado" }));
        jComboBoxEstado.setToolTipText("");

        jLabelCantidad.setText("Cantidad:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jComboBoxOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Oficina Principal", "San Pedro", "Curridabat" }));

        jLabelObservac.setText("Observaciones:");

        txtObservaciones.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jComboBoxcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QuickPass" }));

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelnumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecio)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOficina)
                            .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservac)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBoxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelnumSerie))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(txtnumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumCaja)
                    .addComponent(txtNumCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOficina)
                    .addComponent(jComboBoxOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelEstado)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelObservac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpanelCeleste.setBackground(new java.awt.Color(102, 153, 255));
        jpanelCeleste.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jpanelCelesteLayout = new javax.swing.GroupLayout(jpanelCeleste);
        jpanelCeleste.setLayout(jpanelCelesteLayout);
        jpanelCelesteLayout.setHorizontalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jpanelCelesteLayout.setVerticalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLaberRegistroQuickPass.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLaberRegistroQuickPass.setText("Registro Quick Pass");

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardarRegistro.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRegistro.setText("Guardar");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLaberRegistroQuickPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLaberRegistroQuickPass)
                .addGap(18, 18, 18)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardarRegistro))
                .addContainerGap())
            .addComponent(jpanelCeleste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    txtnumSerie.setText("");
    txtNumCaja.setText("");
    txtCantidad.setText("");
    txtObservaciones.setText("");
    txtPrecio.setText("");
    jComboBoxEstado.setSelectedIndex(0);
    jComboBoxOficina.setSelectedIndex(0);
    jComboBoxcategoria.setSelectedIndex(0);
    
    
    
    
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        String numeroSerie = txtnumSerie.getText();
        String numeroCaja = txtNumCaja.getText();
        int cantidad = 1;
        BigDecimal precio = new BigDecimal ("35");
        
        String categoria = (String) jComboBoxcategoria.getSelectedItem(); //cambio
        String estado = (String) jComboBoxEstado.getSelectedItem();
        String oficina = (String) jComboBoxOficina.getSelectedItem();// me falta confis observaciones
       
        String observaciones = txtObservaciones.getText();
        control.guardar(numeroSerie, numeroCaja,cantidad,precio,categoria, estado, oficina, observaciones );
        
        JOptionPane optionPane = new JOptionPane("Producto creado correctamente");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Creacion Producto");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                
                this.dispose();//hace quefuncione la carga al guardar en tabla,pero hay que registrar uno a 1
                
                if (moduloInventarioForm != null) {
        moduloInventarioForm.actualizarContadores();
    }
                        
       
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtnumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumSerieActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxOficina;
    private javax.swing.JComboBox<String> jComboBoxcategoria;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumCaja;
    private javax.swing.JLabel jLabelObservac;
    private javax.swing.JLabel jLabelOficina;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelnumSerie;
    private javax.swing.JLabel jLaberRegistroQuickPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jpanelCeleste;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNumCaja;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtnumSerie;
    // End of variables declaration//GEN-END:variables

    
}
