package CapaPresentacion;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnPaquetes = new javax.swing.JMenuItem();
        mnPedido = new javax.swing.JMenuItem();
        mnComprobante = new javax.swing.JMenu();
        mnFactura = new javax.swing.JMenuItem();
        mnBoleta = new javax.swing.JMenuItem();
        mnClientes = new javax.swing.JMenu();
        mnJuridicos = new javax.swing.JMenuItem();
        mnNaturales = new javax.swing.JMenuItem();
        mnTrabajadores = new javax.swing.JMenuItem();
        mnProveedores = new javax.swing.JMenuItem();
        mnProceso = new javax.swing.JMenu();
        mnMantenimiento = new javax.swing.JMenu();
        mnAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMenu1.setText("Herramientas");

        mnPaquetes.setText("Paquetes");
        mnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPaquetesActionPerformed(evt);
            }
        });
        jMenu1.add(mnPaquetes);

        mnPedido.setText("Pedido");
        mnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(mnPedido);

        mnComprobante.setText("Comprobante");

        mnFactura.setText("Factura");
        mnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFacturaActionPerformed(evt);
            }
        });
        mnComprobante.add(mnFactura);

        mnBoleta.setText("Boleta");
        mnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBoletaActionPerformed(evt);
            }
        });
        mnComprobante.add(mnBoleta);

        jMenu1.add(mnComprobante);

        mnClientes.setText("Clientes");

        mnJuridicos.setText("Juridicos");
        mnJuridicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJuridicosActionPerformed(evt);
            }
        });
        mnClientes.add(mnJuridicos);

        mnNaturales.setText("Naturales");
        mnNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNaturalesActionPerformed(evt);
            }
        });
        mnClientes.add(mnNaturales);

        jMenu1.add(mnClientes);

        mnTrabajadores.setText("Trabajadores");
        mnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTrabajadoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnTrabajadores);

        mnProveedores.setText("Proveedores");
        mnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnProveedores);

        jMenuBar1.add(jMenu1);

        mnProceso.setText("Proceso");
        jMenuBar1.add(mnProceso);

        mnMantenimiento.setText("Mantenimiento");
        jMenuBar1.add(mnMantenimiento);

        mnAyuda.setText("Ayuda");
        jMenuBar1.add(mnAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPaquetesActionPerformed
        frmPaquete frm = new frmPaquete();
        frm.setVisible(true);
    }//GEN-LAST:event_mnPaquetesActionPerformed

    private void mnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidoActionPerformed
        frmPedido frm = new frmPedido();
        frm.setVisible(true);
    }//GEN-LAST:event_mnPedidoActionPerformed

    private void mnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFacturaActionPerformed
        frmDetalleFactura frm = new frmDetalleFactura();
        frm.setVisible(true);
    }//GEN-LAST:event_mnFacturaActionPerformed

    private void mnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBoletaActionPerformed
        frmDetalleBoleta frm = new frmDetalleBoleta();
        frm.setVisible(true);
    }//GEN-LAST:event_mnBoletaActionPerformed

    private void mnJuridicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJuridicosActionPerformed
        frmJuridica frm = new frmJuridica();
        frm.setVisible(true);
    }//GEN-LAST:event_mnJuridicosActionPerformed

    private void mnNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNaturalesActionPerformed
        frmNatural frm = new frmNatural();
        frm.setVisible(true);
    }//GEN-LAST:event_mnNaturalesActionPerformed

    private void mnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTrabajadoresActionPerformed
        frmTrabajadores frm = new frmTrabajadores();
        frm.setVisible(true);
    }//GEN-LAST:event_mnTrabajadoresActionPerformed

    private void mnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProveedoresActionPerformed
        frmProveedor frm = new frmProveedor();
        frm.setVisible(true);
    }//GEN-LAST:event_mnProveedoresActionPerformed
       
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAyuda;
    private javax.swing.JMenuItem mnBoleta;
    private javax.swing.JMenu mnClientes;
    private javax.swing.JMenu mnComprobante;
    private javax.swing.JMenuItem mnFactura;
    private javax.swing.JMenuItem mnJuridicos;
    private javax.swing.JMenu mnMantenimiento;
    private javax.swing.JMenuItem mnNaturales;
    private javax.swing.JMenuItem mnPaquetes;
    private javax.swing.JMenuItem mnPedido;
    private javax.swing.JMenu mnProceso;
    private javax.swing.JMenuItem mnProveedores;
    private javax.swing.JMenuItem mnTrabajadores;
    // End of variables declaration//GEN-END:variables
}
