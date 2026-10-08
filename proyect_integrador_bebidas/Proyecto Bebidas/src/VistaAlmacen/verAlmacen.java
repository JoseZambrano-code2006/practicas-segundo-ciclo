
package VistaAlmacen;

import controller.IBebidaDao;
import controllerImpl.BebidaDaoImpl;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bebida;


public class verAlmacen extends javax.swing.JPanel {
    IBebidaDao bDao = new BebidaDaoImpl();   
    Bebida be = new Bebida(); 
     
    public verAlmacen() {
        initComponents();
        cargarBebida();
      // ActualizarBebida();
        
    }
    private void cargarBebida(){
        
        List<Bebida> lista = bDao.listar();

        DefaultTableModel tableModel = (DefaultTableModel) tblBebida.getModel();
        tableModel.setNumRows(0);

        for (Bebida b : lista) {
            String Disponible;
            if (b.getTipo().equals("R")) {
                Disponible = "Disponible";
            } else {
                Disponible = "Agotado";
            }
            Object[] rowData
                    = {
                        b.getIdBebida(),
                        b.getCodigo(),
                        b.getNombre(),
                        b.getTipo(),
                        b.getPrecio(),
                        b.getCanidadDisposible(),
                        Disponible
                    };
            tableModel.addRow(rowData);
        }
        tblBebida.setModel(tableModel);
        JOptionPane.showMessageDialog(null, "Carga Completada :) ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

    
    }
    
    private void ActualizarBebida(){
       List<Bebida> lista = bDao.listar(); 
       
        DefaultTableModel tableModel = (DefaultTableModel) tblBebida.getModel();
        tableModel.setNumRows(0);
        
        
        //metodo para ver si hay bebidas Disponibles
        for(Bebida b : lista){
          String Disponible;
         
          if(b.getTipo().equals("R")){
          String tamaño;
          
                    
          }
        
        
        }
        
       
       
}
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebida = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(540, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 450));

        tblBebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo", "Nombre", "Tipo", "Tamaño", "Precio", "Disponible"
            }
        ));
        jScrollPane1.setViewportView(tblBebida);

        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/reload.png"))); // NOI18N
        BtnActualizar.setText("Actualizar");

        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/mas.png"))); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/delete.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/edit.png"))); // NOI18N
        BtnEditar.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BtnActualizar)
                .addGap(18, 18, 18)
                .addComponent(BtnAgregar)
                .addGap(69, 69, 69)
                .addComponent(BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
    AgregarBebida agregar = new AgregarBebida();
        agregar.setSize(700, 500);
        agregar.setLocation(0, 0);
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);

    
    }//GEN-LAST:event_BtnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBebida;
    // End of variables declaration//GEN-END:variables
}
