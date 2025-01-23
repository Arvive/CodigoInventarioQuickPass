/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quickpasstesis.igu;

import com.mycompany.quickpasstesis.logica.Controladora;
import com.mycompany.quickpasstesis.logica.Producto;
import java.math.BigDecimal;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ModificarInventarioForm extends javax.swing.JFrame {
    Controladora control = null;
    int idProducto;
    Producto producto;//variable global

    /**
     * Creates new form ModificarInventario
     */
    public ModificarInventarioForm(int idProducto) {
        control = new Controladora();
        initComponents();
        cargarDatos(idProducto);
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
        jLabelConsecut = new javax.swing.JLabel();
        jLabelNumCaja = new javax.swing.JLabel();
        jLabelPersonRecibe = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        txtNunCaja = new javax.swing.JTextField();
        txtPersonRecibe = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelEstado1 = new javax.swing.JLabel();
        jLabelPersonRecibe1 = new javax.swing.JLabel();
        txtnumSobre = new javax.swing.JTextField();
        jLabelConsecut1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabelConsecut2 = new javax.swing.JLabel();
        jComboBoxOficina = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jpanelCeleste = new javax.swing.JPanel();
        jLaberRegistroQuickPass = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabelObservac = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabelObservac1 = new javax.swing.JLabel();
        txtFechaDevolucion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanelInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabelConsecut.setText("Número de Caja:");

        jLabelNumCaja.setText("Oficina:");

        jLabelPersonRecibe.setText("Persona Recibe");

        jLabelEstado.setText("Estado:");

        txtNunCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNunCajaActionPerformed(evt);
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Devuelto", "Defectuoso" }));
        jComboBoxEstado.setToolTipText("");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Prepago", "Postpago" }));
        jComboBoxTipo.setToolTipText("");

        jLabelEstado1.setText("Tipo Quick Pass:");

        jLabelPersonRecibe1.setText("Sobre Valor:");

        jLabelConsecut1.setText("Serie:");

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        jLabelConsecut2.setText("Categoria:");

        jComboBoxOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Oficina Principal", "San Pedro", "Curridabat" }));

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QuickPass" }));
        jComboBoxCategoria.setToolTipText("");

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelConsecut1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelPersonRecibe1)
                        .addGap(19, 19, 19)
                        .addComponent(txtnumSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelConsecut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumCaja))
                                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtNunCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jComboBoxOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelEstado1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addComponent(jLabelPersonRecibe)
                .addGap(83, 83, 83)
                .addComponent(txtPersonRecibe))
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addComponent(jLabelConsecut2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsecut1)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsecut)
                    .addComponent(txtNunCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumCaja)
                    .addComponent(jComboBoxOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPersonRecibe1)
                    .addComponent(txtnumSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPersonRecibe)
                    .addComponent(txtPersonRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsecut2)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado1))
                .addGap(129, 129, 129))
        );

        jpanelCeleste.setBackground(new java.awt.Color(102, 153, 255));
        jpanelCeleste.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jpanelCelesteLayout = new javax.swing.GroupLayout(jpanelCeleste);
        jpanelCeleste.setLayout(jpanelCelesteLayout);
        jpanelCelesteLayout.setHorizontalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        jpanelCelesteLayout.setVerticalGroup(
            jpanelCelesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        jLaberRegistroQuickPass.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLaberRegistroQuickPass.setText("Modificar Inventario");

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        jLabelObservac.setText("Observaciones:");

        txtObservaciones.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jLabelObservac1.setText("Fecha Devolucion:");

        txtFechaDevolucion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLaberRegistroQuickPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelObservac)
                                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelObservac1)
                                    .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanelCeleste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLaberRegistroQuickPass)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelObservac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObservac1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNunCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNunCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNunCajaActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String numeroSerie = txtSerie.getText();
        String numeroCaja = txtNunCaja.getText();
        String sobreValor = txtnumSobre.getText();
        String persoRecibe = txtPersonRecibe.getText();
        String observaciones = txtObservaciones.getText();
        String fechaDevol = txtFechaDevolucion.getText();
        
        String categoria = (String) jComboBoxCategoria.getSelectedItem(); //cambio
        String estado = (String) jComboBoxEstado.getSelectedItem();
        String oficina = (String) jComboBoxOficina.getSelectedItem();// me falta confis observaciones
        String tipo = (String) jComboBoxTipo.getSelectedItem();
        
        
        control.modificarProducto(producto,numeroSerie, numeroCaja,sobreValor,persoRecibe,// se declara la primera variable globlar
                fechaDevol,categoria, estado, oficina,tipo, observaciones );
        
        mostrarMensaje("Editado Correctamente", "Info", "Editar");
        
       ModuloInventarioForm pantallaInvent = new ModuloInventarioForm();//abre de nuevo la popantalla princ y cierra esta
       pantallaInvent.setVisible(true);
       pantallaInvent.setLocationRelativeTo(null);
       
       this.dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo){
            JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equals("Info")){
            
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }

                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
    
    }
    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void txtFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaDevolucionActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxOficina;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelConsecut;
    private javax.swing.JLabel jLabelConsecut1;
    private javax.swing.JLabel jLabelConsecut2;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstado1;
    private javax.swing.JLabel jLabelNumCaja;
    private javax.swing.JLabel jLabelObservac;
    private javax.swing.JLabel jLabelObservac1;
    private javax.swing.JLabel jLabelPersonRecibe;
    private javax.swing.JLabel jLabelPersonRecibe1;
    private javax.swing.JLabel jLaberRegistroQuickPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jpanelCeleste;
    private javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtNunCaja;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPersonRecibe;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtnumSobre;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idProducto) {
      this.producto = control.traerProducto(idProducto);
      
      txtSerie.setText(producto.getNumeroSerie());
      txtNunCaja.setText(producto.getNumeroCaja());
      txtnumSobre.setText(producto.getNumSobreValor());
      txtPersonRecibe.setText(producto.getPersonRecibe());
      txtObservaciones.setText(producto.getObservaciones());
      
      if (producto.getFechaDevolucion() != null) {// si se rompe revisar aca 
      txtFechaDevolucion.setText(producto.getFechaDevolucion().toString());//fecha ojo aca hay algo mal, revisar 
      //como se hace correctamente
      } else {
        String fechaDevolucion = "Sin fecha"; // O cualquier mensaje por defecto
    // Manejar el caso en que no haya fecha de devolución
}
      
      
      switch (producto.getOficina()){
      
          case "Oficina Principal":
                   jComboBoxOficina.setSelectedIndex(1);
                   break;
          case "San Pedro":
              jComboBoxOficina.setSelectedIndex(2);
              break;
          case "Curridabat":
              jComboBoxOficina.setSelectedIndex(3);
              break;
         default:
              jComboBoxOficina.setSelectedIndex(0);
              break;

      }
  
      
      if (producto.getCategoria().equals("QuickPass")){
      jComboBoxCategoria.setSelectedIndex(0);
      }
      
      switch (producto.getEstado()){
          
          case "Activo":
              jComboBoxEstado.setSelectedIndex(0);
              break;
          case "Inactivo":
              jComboBoxEstado.setSelectedIndex(1);
              break;
           case "Devuelto":
              jComboBoxEstado.setSelectedIndex(2);
              break;
            case "Defectuoso":
              jComboBoxEstado.setSelectedIndex(3);
              break;
                     
      }
       if (producto.getTipoDisp() != null) {
            if (producto.getTipoDisp().equals("Prepago")) {
        jComboBoxTipo.setSelectedIndex(1);
    } else if (producto.getTipoDisp().equals("Postpago")) {
        jComboBoxTipo.setSelectedIndex(2);
    } else {
        // Manejo en caso de que no sea "Prepago" ni "Postpago".
        jComboBoxTipo.setSelectedIndex(0); // Por ejemplo, el índice 0 como valor por defecto.
    }
    } else {
    // Manejo en caso de que producto.getTipoDisp() sea null.
    jComboBoxTipo.setSelectedIndex(0); // También puedes asignar un valor por defecto aquí.
}

    } 

}


    




