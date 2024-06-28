/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BO.TrasladoBO;
import BO.VehiculoBO;
import DTOs.TrasladoDTO;
import DTOs.VehiculoDTO;
import Excepciones.BOException;
import dtos.EmpleadoDTO;
import excepciones.FachadaException;
import excepciones.NegocioException;
import fachada.VehiculoFCD;
import interfaces.IEmpleadoBO;
import interfaz.IVehiculoFCD;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import negocio.EmpleadoBO;

/**
 *
 * @author diana
 */
public class Traslado2 extends javax.swing.JFrame {

    // Instancia de JLabel
    private JLabel lblEmpleadoDatos;
    //instancia de mi form traslado
    Traslado formT;
    private IVehiculoFCD vehiculo;
    private TrasladoBO fachada;
    
    
    /**
     * Creates new form Traslado2
     */
    public Traslado2() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(780, 580);
        this.vehiculo = new VehiculoFCD();
        try{
       
        // Inicializar JLabel
        lblEmpleadoDatos = new JLabel();
        lblEmpleadoDatos.setForeground(Color.WHITE);
        jPanel1.add(lblEmpleadoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));
        lblEmpleadoDatos.setVisible(false);
        btnDisponibilidad.enable(false);

        vehiculo.llenarCBX(boxVehiculo);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public Traslado2(Traslado formTr) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(780, 580);
        this.formT = formTr;
        btnDisponibilidad.setEnabled(false);

    }
    
    public void traslado() {
    // Validaciones de los campos obligatorios
    if (txtPrestamo.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo 'Motivo de Préstamo' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtDestino.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo 'Destino' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (boxVehiculo.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un 'Vehículo'.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cbxCarroceria.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar el estado de 'Carrocería'.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cbxCombustible.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar el nivel de 'Combustible'.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cbxLlantas.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar el estado de las 'Llantas'.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cbxVehiculo.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar el estado del 'Vehículo'.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear una instancia de TrasladoDTO y llenar sus campos
    TrasladoDTO trasladoDTO = new TrasladoDTO();
    trasladoDTO.setMotivo(txtPrestamo.getText().trim());
    // Suponiendo que tienes una fecha de salida y regreso en algún lugar, como un JDateChooser o similar
//    trasladoDTO.setFechaHoraSalida(/* Obtener fecha de salida del componente correspondiente */);
//    trasladoDTO.setFechaHoraRegreso(/* Obtener fecha de regreso del componente correspondiente */);
    trasladoDTO.setDisponibilidad(true); // O el valor que corresponda
    // Suponiendo que VehiculoDTO ya está definido y tienes un método para obtenerlo
    VehiculoDTO vehiculoDTO = obtenerVehiculoSeleccionado(); // Define este método para obtener el VehiculoDTO seleccionado
    trasladoDTO.setVehiculo(vehiculoDTO);
    trasladoDTO.setEstadoVehiculo(cbxVehiculo.getSelectedItem().toString());
    trasladoDTO.setLlantas(cbxLlantas.getSelectedItem().toString());
    trasladoDTO.setCarroceria(cbxCarroceria.getSelectedItem().toString());
    trasladoDTO.setCombustible(Integer.parseInt(cbxCombustible.getSelectedItem().toString()));
    
    // Crear una instancia de TrasladoFCD y solicitar el traslado
    TrasladoFCD trasladoFCD = new TrasladoFCD();
    try {
        trasladoFCD.solicitarTraslado(trasladoDTO);
        JOptionPane.showMessageDialog(this, "Traslado solicitado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (fachadaException e) {
        JOptionPane.showMessageDialog(this, "Error al solicitar el traslado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private VehiculoDTO obtenerVehiculoSeleccionado() {
    // Implementa este método para obtener el VehiculoDTO seleccionado en boxVehiculo
    return new VehiculoDTO(/* Parámetros necesarios */);
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
        jLabel2 = new javax.swing.JLabel();
        txtPrestamo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDisponibilidad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxVehiculo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxCarroceria = new javax.swing.JComboBox<>();
        cbxCombustible = new javax.swing.JComboBox<>();
        cbxLlantas = new javax.swing.JComboBox<>();
        cbxVehiculo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motivo de Prestamo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Traslado de Alumnos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btnDisponibilidad.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnDisponibilidad.setText("Confirmar Traslado");
        btnDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehiculo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        boxVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(boxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 190, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos de empleado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Correo:");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 180, 30));

        btnComprobar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnComprobar.setText("Comprobar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        lblID1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblID1.setForeground(new java.awt.Color(255, 255, 255));
        lblID1.setText("Destino:");
        jPanel1.add(lblID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carroceria:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Llantas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Combustible:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado de vehiculo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        cbxCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Regular ", "Dañada", " " }));
        jPanel1.add(cbxCarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 30));

        cbxCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25%", "50%", "75%", "100%" }));
        jPanel1.add(cbxCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 160, 30));

        cbxLlantas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aire bajo", "Desgastado", "Buen estado", " " }));
        jPanel1.add(cbxLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 30));

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dañado", "Sin daños", "Sin combustible", " " }));
        jPanel1.add(cbxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 160, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Folio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadActionPerformed
        
        // Crear el mensaje de confirmación
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Motivo de Préstamo: ").append(txtPrestamo.getText()).append("\n");
        mensaje.append("Destino: ").append(txtDestino.getText()).append("\n");
        mensaje.append("Vehículo: ").append(boxVehiculo.getSelectedItem().toString()).append("\n");
        mensaje.append("Carrocería: ").append(cbxCarroceria.getSelectedItem().toString()).append("\n");
        mensaje.append("Combustible: ").append(cbxCombustible.getSelectedItem().toString()).append("\n");
        mensaje.append("Llantas: ").append(cbxLlantas.getSelectedItem().toString()).append("\n");
        mensaje.append("Estado del vehículo: ").append(cbxVehiculo.getSelectedItem().toString()).append("\n");

        // Mostrar el mensaje en un JOptionPane con botones "Cancelar" y "Solicitar"
        int opcion = JOptionPane.showOptionDialog(this,
                mensaje.toString(),
                "Confirmar Traslado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[]{"Solicitar", "Cancelar"},
                "Solicitar");

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                // Aquí puedes agregar el código para manejar la solicitud del traslado
               
                fachada.agregar(new TrasladoDTO());
                // Generar PDF
                //TrasladoPDFController controller = new TrasladoPDFController();
                // String pdfFileName = "TicketTrasladoAlumnos.pdf";
                // controller.generarPDF(mensaje.toString(), pdfFileName);
                // Mostrar mensaje de éxito
                // JOptionPane.showMessageDialog(this, "Traslado agregado con éxito y PDF generado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Abrir el PDF generado
                // abrirPDF(pdfFileName);
            } catch (BOException ex) {
                Logger.getLogger(Traslado2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // El usuario seleccionó "Cancelar" o cerró el diálogo
            JOptionPane.showMessageDialog(this, "Operación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDisponibilidadActionPerformed

    private void boxVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxVehiculoActionPerformed
        try {
            // TODO add your handling code here:
            IVehiculoFCD vehiculos = new VehiculoFCD();
            
            vehiculos.llenarCBX(cbxVehiculo);
        } catch (FachadaException ex) {
            Logger.getLogger(Traslado2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boxVehiculoActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed

        btnDisponibilidad.setEnabled(false);

        String empleadoId = txtID.getText();
        IEmpleadoBO empleadoBO = new EmpleadoBO();

        try {
            int id = Integer.parseInt(empleadoId);
            EmpleadoDTO empleadoDTO = empleadoBO.buscarEmpleado(id);

            // Verificar si el tipo de empleado es "empleado"
            if ("empleado".equalsIgnoreCase(empleadoDTO.getTipo())) {
                // Si el empleado fue encontrado y es de tipo "empleado", muestra un mensaje
                JOptionPane.showMessageDialog(this, "Empleado encontrado: " + empleadoDTO.getCorreo(), "Información", JOptionPane.INFORMATION_MESSAGE);
                btnDisponibilidad.setEnabled(true);
            } else {
                // Si el empleado no es de tipo "empleado", muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un empleado", "Error", JOptionPane.ERROR_MESSAGE);
                btnDisponibilidad.setEnabled(false);

            }
        } catch (NumberFormatException e) {
            // Si el texto ingresado no es un número válido
            JOptionPane.showMessageDialog(this, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
            btnDisponibilidad.setEnabled(false);

        } catch (NegocioException e) {
            // Si hubo un error al buscar el empleado (incluyendo si no fue encontrado)
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            btnDisponibilidad.setEnabled(false);

        }
    }//GEN-LAST:event_btnComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traslado2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxVehiculo;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnDisponibilidad;
    private javax.swing.JComboBox<String> cbxCarroceria;
    private javax.swing.JComboBox<String> cbxCombustible;
    private javax.swing.JComboBox<String> cbxLlantas;
    private javax.swing.JComboBox<String> cbxVehiculo;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
