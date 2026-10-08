/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.reserva;

import controller.IReservaDao;
import controllerImpl.ReservaDaoImpl;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author tpp
 */
public class EditReserva extends javax.swing.JFrame {

    int idReserva;
    public EditReserva(int idReserva) {
        this.idReserva = idReserva;
        initComponents();
        System.out.println("idreserva:" +idReserva);
        SearchReserva(idReserva);
    }

    public void SearchReserva(int idreserva) {

        IReservaDao rDAO = new ReservaDaoImpl();

        Reserva r = rDAO.searchById(idreserva);

        try {
            LabelDni.setText(r.getCliente().getDni());
            LabelNombre.setText(r.getCliente().getNombre());
            LabelEmail.setText(r.getCliente().getEmail());
            LabelIdCliente.setText(String.valueOf(r.getCliente().getIdcliente()));
            txtHabitacion.setText(String.valueOf(r.getNumeroHabitacion()));
            System.out.println("piso"+r.getNumeroPiso());
            System.out.println("Precio"+r.getCosto());
            jSpinnerPsio.setValue(Integer.valueOf(r.getNumeroPiso()));
            LabelPrecio.setText(String.valueOf(r.getCosto()));
            String estado;
            if (r.getEstado().equals("R")) {
                estado = "Reservado";
            } else {
                estado = "Cancelado";
            }
            cmbEstado.setSelectedItem(estado);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaIngreso = dateFormat.parse(r.getFechaIngreso());
            Date fechaSalida = dateFormat.parse(r.getFechaSalida());
            DCFechaIngreso.setDate(fechaIngreso);
            DCFechaSalida.setDate(fechaSalida);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al convertir las fechas.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelDni = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelIdCliente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        DCFechaIngreso = new com.toedter.calendar.JDateChooser();
        DCFechaSalida = new com.toedter.calendar.JDateChooser();
        jSpinnerPsio = new javax.swing.JSpinner();
        txtHabitacion = new javax.swing.JTextField();
        btnCalcularPrecio = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnActualizarReserva = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        btnSendEmail1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Dni:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        LabelDni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDni.setText("****DNI****");

        LabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelNombre.setText("****Nombres******");

        LabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEmail.setText("****Email******");

        LabelIdCliente.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(LabelDni))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelEmail)))
                .addGap(111, 111, 111)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(LabelNombre))
                    .addComponent(LabelIdCliente))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(LabelDni)
                    .addComponent(LabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelEmail)
                    .addComponent(LabelIdCliente))
                .addGap(31, 31, 31))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Piso:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Salida:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Ingreso:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Habitación:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("S/.");

        LabelPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnCalcularPrecio.setBackground(new java.awt.Color(255, 102, 0));
        btnCalcularPrecio.setText("calcular");
        btnCalcularPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPrecioActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado :");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Reservado", "Cancelado", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DCFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerPsio)
                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DCFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelPrecio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularPrecio)
                        .addGap(10, 10, 10)))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(2, 2, 2))
                            .addComponent(btnCalcularPrecio))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(LabelPrecio)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DCFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jSpinnerPsio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnActualizarReserva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarReserva.setText("Actualizar la reserva");
        btnActualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservaActionPerformed(evt);
            }
        });

        btnCancelarReserva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarReserva.setText("Cancelar");
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        btnSendEmail1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSendEmail1.setText("EnviarCorreo");
        btnSendEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmail1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizarReserva)
                        .addGap(52, 52, 52)
                        .addComponent(btnSendEmail1)
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelarReserva)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarReserva)
                    .addComponent(btnSendEmail1)
                    .addComponent(btnCancelarReserva))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPrecioActionPerformed

        if (DCFechaIngreso.getDate() != null && DCFechaSalida.getDate() != null) {

            Date fechaIngreso = DCFechaIngreso.getDate();
            Date fechaSalida = DCFechaSalida.getDate();

            // Formatear las fechas
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIngresoFormateada = sdf.format(fechaIngreso);
            String fechaSalidaFormateada = sdf.format(fechaSalida);

            // Mostrar las fechas formateadas
            System.out.println("Fecha de Ingreso: " + fechaIngresoFormateada);
            System.out.println("Fecha de Salida: " + fechaSalidaFormateada);

            // Convertir Date a LocalDate
            LocalDate localFechaIngreso = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localFechaSalida = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Calcular el número de días entre las fechas
            long diasEstadia = ChronoUnit.DAYS.between(localFechaIngreso, localFechaSalida);

            // Calcular el precio total
            final double precioPorDia = 60;
            double precioTotal = diasEstadia * precioPorDia;

            // Mostrar el resultado
            System.out.println("Número de días de estadía: " + diasEstadia);
            System.out.println("Precio total: S/" + precioTotal);

            LabelPrecio.setText(String.valueOf(precioTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar la fecha de Ingreso y salida ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularPrecioActionPerformed

    private void btnActualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservaActionPerformed
        if ("****DNI****".equals(LabelDni.getText())) {
            JOptionPane.showMessageDialog(null, "Debes selecionar aun cliente :( ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

        }else if("".equals(LabelPrecio.getText())){
            JOptionPane.showMessageDialog(null, "Debes calcular el precio :( ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }else {
            IReservaDao rDao = new ReservaDaoImpl();
            Reserva r = new Reserva();
            Cliente c = new Cliente();
            Date fechaIngreso = DCFechaIngreso.getDate();
            Date fechaSalida = DCFechaSalida.getDate();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIngresoF = sdf.format(fechaIngreso);
            String fechaSalidaF = sdf.format(fechaSalida);
            r.setFechaIngreso(fechaIngresoF);
            r.setFechaSalida(fechaSalidaF);
            double costo = Double.parseDouble(LabelPrecio.getText());
            r.setCosto(costo);
            r.setNumeroPiso(jSpinnerPsio.getValue().toString());
            r.setNumeroHabitacion(Integer.parseInt(txtHabitacion.getText()));
            c.setIdcliente(Integer.parseInt(LabelIdCliente.getText()));
            r.setCliente(c);
             r.setEstado((String) cmbEstado.getSelectedItem());
            r.setIdReserva(idReserva);
            
            boolean result = rDao.update(r);

            if (result) {
                JOptionPane.showMessageDialog(null, "Reserva actualizada exitosamente !!! ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Actualizacion fallida de reserva Fallido :(", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);

            }

        }
    }//GEN-LAST:event_btnActualizarReservaActionPerformed

    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void btnSendEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendEmail1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCFechaIngreso;
    private com.toedter.calendar.JDateChooser DCFechaSalida;
    private javax.swing.JLabel LabelDni;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelIdCliente;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JButton btnActualizarReserva;
    private javax.swing.JButton btnCalcularPrecio;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnSendEmail1;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinnerPsio;
    private javax.swing.JTextField txtHabitacion;
    // End of variables declaration//GEN-END:variables
}
