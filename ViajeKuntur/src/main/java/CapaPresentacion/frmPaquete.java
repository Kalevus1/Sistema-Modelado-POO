package CapaPresentacion;

import CapaNegocio.Paquete;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmPaquete extends javax.swing.JFrame {
    
    Paquete paquete = new Paquete();
    
    public frmPaquete() {
        initComponents();
    }
    public void Limpiar (){
        txtDestino.setText("");
        txtCodigo.setText("");
        txtDescripcion.setText("");
        dtFecha.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEscribir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        dtFecha = new com.toedter.calendar.JDateChooser();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Codigo:");

        jLabel4.setText("Descripcion:");

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        jLabel1.setText("Paquete");

        btnEscribir.setText("Escribir");
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        jLabel2.setText("Destino:");

        jLabel5.setText("Fecha:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDestino)
                    .addComponent(dtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLeer, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEscribir, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnSalir))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEscribir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalir))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLeer)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String destino = txtDestino.getText();
        String cod = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();
        Date fecha = dtFecha.getDate();
        
        paquete.getDestino(destino);
        paquete.getCod(cod);
        paquete.getDescripcion(descripcion);
        paquete.getFecha(fecha);
        
        Limpiar();
        JOptionPane.showMessageDialog(this,"Los datos se guardaron correctamente");
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        txtDestino.setText(paquete.getDestino()+"");
        txtCodigo.setText(paquete.getCod()+"");
        txtDescripcion.setText(paquete.getDescripcion()+"");
        dtFecha.setDate(paquete.getFecha());
        
        JOptionPane.showMessageDialog(this,"\nDestino: " + paquete.getDestino() + "\nCodigo: " + paquete.getCod() + 
                "\nDescripcion: " + paquete.getDescripcion() + "\nFecha: " + paquete.getFecha());
    }//GEN-LAST:event_btnEscribirActionPerformed

    public static void main(String args[]) {
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDestino;
    // End of variables declaration//GEN-END:variables
}
