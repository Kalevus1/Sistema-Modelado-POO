package CapaPresentacion;

import CapaNegocio.Trabajadores;
import CapaNegocio.Persona;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmTrabajadores extends javax.swing.JFrame {
    
    Trabajadores trabajadores = new Trabajadores();
    Persona persona = new Persona();

    public frmTrabajadores() {
        initComponents();
    }
    public void Limpiar (){
        txtId.setText("");
        txtApellidos.setText("");
        txtNombres.setText("");
        txtCorreo.setText("");
        dtFecha.setDate(null);
        txtLugar.setText("");
        txtNum.setText("");
        txtDireccion.setText("");
        txtPuesto.setText("");
        txtHorario.setText("");
        txtSalario.setText("");     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLugar = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnEscribir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Trabajadores");

        jLabel2.setText("Id:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Correo:");

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha Nac:");

        btnEscribir.setText("Escribir");
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        jLabel7.setText("Lugar Nac:");

        jLabel8.setText("Num Telf:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Puesto:");

        jLabel11.setText("Horario:");

        jLabel12.setText("Salario:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(txtId)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres)
                            .addComponent(txtCorreo)
                            .addComponent(txtLugar)
                            .addComponent(txtNum)
                            .addComponent(dtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtPuesto)
                            .addComponent(txtHorario)
                            .addComponent(txtSalario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLeer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEscribir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscribir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        txtId.setText(persona.getId()+"");
        txtApellidos.setText(persona.getApellidos()+"");
        txtNombres.setText(persona.getNombres()+"");
        txtCorreo.setText(persona.getCorreo()+"");
        dtFecha.setDate(persona.getFechaNac());
        txtLugar.setText(persona.getLugarNac()+"");
        txtNum.setText(persona.getNumCel()+"");
        txtDireccion.setText(persona.getDireccion()+"");
        txtPuesto.setText(trabajadores.getPuesto()+"");
        txtHorario.setText(trabajadores.getHorario()+"");
        txtSalario.setText(trabajadores.getSalario()+"");
       
        JOptionPane.showMessageDialog(this,"\nId: " + persona.getId() + "\nApellidos: " + persona.getApellidos()+ 
                "\nNombres: " + persona.getNombres() + "\nCorreo: " + persona.getCorreo() + "\nFecha Nacimiento: " + persona.getFechaNac() + 
                "\nLugar de Nacimiento: " + persona.getLugarNac() + "\nNumero Telefonico: " + persona.getNumCel() + 
                "\nDireccion: " + persona.getDireccion() + "\nPuesto: " + trabajadores.getPuesto() +
                "\nHorario: " + trabajadores.getHorario() + "\nSalario: " + trabajadores.getSalario());
    }//GEN-LAST:event_btnEscribirActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String id = txtId.getText();
        String apellidos = txtApellidos.getText();
        String nombre = txtNombres.getText();
        String correo = txtCorreo.getText();
        Date fechaNac = dtFecha.getDate();
        String lugarNac = txtLugar.getText();
        String numCel = txtNum.getText();
        String direccion = txtDireccion.getText();
        String puesto = txtPuesto.getText();
        String horario = txtHorario.getText();
        String salario = txtSalario.getText();
        
        persona.setId(id);
        persona.setApellidos(apellidos);
        persona.setNombres(nombre);
        persona.setCorreo(correo);
        persona.setFechaNac(fechaNac);
        persona.setLugarNac(lugarNac);
        persona.setNumCel(numCel);
        persona.setDireccion(direccion);
        trabajadores.setPuesto(puesto);
        trabajadores.setHorario(horario);
        trabajadores.setSalario(salario);
        
        Limpiar();
        JOptionPane.showMessageDialog(this,"Los datos se guardaron correctamente");
    }//GEN-LAST:event_btnLeerActionPerformed

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
            java.util.logging.Logger.getLogger(frmTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
