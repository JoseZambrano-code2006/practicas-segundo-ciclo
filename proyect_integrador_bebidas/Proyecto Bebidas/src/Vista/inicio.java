
package Vista;

import VistaAlmacen.verAlmacen;
import java.awt.BorderLayout;

public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Almbtn = new javax.swing.JButton();
        Venderbtn1 = new javax.swing.JButton();
        Clientesbtn = new javax.swing.JButton();
        Ventasbtn = new javax.swing.JButton();
        Detallesbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("***********************");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Opciones");

        Almbtn.setBackground(new java.awt.Color(204, 204, 255));
        Almbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Almbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/alm.png"))); // NOI18N
        Almbtn.setText("Ver Almacenamiento");
        Almbtn.setBorder(null);
        Almbtn.setBorderPainted(false);
        Almbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmbtnActionPerformed(evt);
            }
        });

        Venderbtn1.setBackground(new java.awt.Color(204, 204, 255));
        Venderbtn1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Venderbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/shopping.png"))); // NOI18N
        Venderbtn1.setText("Vender");
        Venderbtn1.setBorder(null);
        Venderbtn1.setBorderPainted(false);
        Venderbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Venderbtn1ActionPerformed(evt);
            }
        });

        Clientesbtn.setBackground(new java.awt.Color(204, 204, 255));
        Clientesbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Clientesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/cliente.png"))); // NOI18N
        Clientesbtn.setText("Clientes");
        Clientesbtn.setBorder(null);
        Clientesbtn.setBorderPainted(false);
        Clientesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesbtnActionPerformed(evt);
            }
        });

        Ventasbtn.setBackground(new java.awt.Color(204, 204, 255));
        Ventasbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Ventasbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/list.png"))); // NOI18N
        Ventasbtn.setText("Ventas");
        Ventasbtn.setBorder(null);
        Ventasbtn.setBorderPainted(false);
        Ventasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasbtnActionPerformed(evt);
            }
        });

        Detallesbtn.setBackground(new java.awt.Color(204, 204, 255));
        Detallesbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Detallesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/detalles.png"))); // NOI18N
        Detallesbtn.setText("Detalles de Venta");
        Detallesbtn.setBorder(null);
        Detallesbtn.setBorderPainted(false);
        Detallesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Almbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Detallesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Venderbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clientesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ventasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(82, 82, 82))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(Venderbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Almbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clientesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ventasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Detallesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 630));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(102, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/logob.png"))); // NOI18N
        jLabel8.setText("Sistema de Gestion de ventas de Bebidas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmbtnActionPerformed

    private void Venderbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Venderbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Venderbtn1ActionPerformed

    private void ClientesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesbtnActionPerformed

    private void VentasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasbtnActionPerformed

    private void DetallesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetallesbtnActionPerformed

 
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Almbtn;
    private javax.swing.JButton Clientesbtn;
    private javax.swing.JButton Detallesbtn;
    private javax.swing.JButton Venderbtn1;
    private javax.swing.JButton Ventasbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
