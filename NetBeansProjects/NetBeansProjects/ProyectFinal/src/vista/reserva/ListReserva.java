/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.reserva;

import controller.IReservaDao;
import controllerImpl.ReservaDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.table.DefaultTableModel;
import model.Reserva;

/**
 *
 * @author USER
 */
public class ListReserva extends javax.swing.JPanel {

    IReservaDao rDao = new ReservaDaoImpl();
    Reserva re = new Reserva();

    public ListReserva() {
        initComponents();
    }

    private void cargarReserva() {
        List<Reserva> lista = rDao.listAll();

        DefaultTableModel tableModel = (DefaultTableModel) TableReserva.getModel();
        tableModel.setNumRows(0);

        for (Reserva r : lista) {

            String estado;
            if (r.getEstado().equals("R")) {
                estado = "Reservado";

            } else {
                estado = "Cancelado";

            }
            Object[] rowData
                    = {
                        r.getIdReserva(),
                        r.getFechaIgreso(),
                        r.getFechaSalida(),
                        r.getCliente().getNombre(),
                        r.getNumeroPiso(),
                        r.getNumeroHabitacion(),
                        r.getCosto(),
                        estado

                    };
             tableModel.addRow(rowData);
        }
        
        TableReserva.setModel (tableModel);
        JOptionPane.showMessageDialog(null, "carga completada:) ", "INFORMATION_MENSSAGE", JOptionPane.INFORMATION_MESSAGE);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReserva = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        btnNuevaReserva = new javax.swing.JButton();
        btnEditarReserva = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setPreferredSize(new java.awt.Dimension(560, 339));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        TableReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Ingreso", "Salida", "Cliente", "Piso", "Habitacion", "Costo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TableReserva);

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/reload.png"))); // NOI18N

        btnNuevaReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/mas.png"))); // NOI18N

        btnEditarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/edit.png"))); // NOI18N

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/delete.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarReserva)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReload)
                    .addComponent(btnNuevaReserva)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarReserva)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableReserva;
    private javax.swing.JButton btnEditarReserva;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaReserva;
    private javax.swing.JButton btnReload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
