/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelos.Recepcion;
import Modelos.SqlRecepcion;
import Modelos.hs;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author K
 */
public class RegistrarRecepcion extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarRecepcion
     */
    public RegistrarRecepcion() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtrgtUsuarioRCP = new javax.swing.JTextField();
        jtxtrgtPasswordRCP = new javax.swing.JPasswordField();
        jtxtrgtConfirmarPassRCP = new javax.swing.JPasswordField();
        jtxtrgtNombresRCP = new javax.swing.JTextField();
        jtxtrgtApellidosRCP = new javax.swing.JTextField();
        jtxtrgtSedeRCP = new javax.swing.JTextField();
        jtxtrgtCelularRCP = new javax.swing.JTextField();
        jtxtrgtCorreoRCP = new javax.swing.JTextField();
        jbtnRegistrarRCP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR RECEPCION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 260, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>REPETIR CONTRASEÑA:</html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 40));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRES:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 100, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDOS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 70, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SEDE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CELULAR:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CORREO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 60, 30));
        jPanel1.add(jtxtrgtUsuarioRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, 40));
        jPanel1.add(jtxtrgtPasswordRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 40));
        jPanel1.add(jtxtrgtConfirmarPassRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 170, 40));
        jPanel1.add(jtxtrgtNombresRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 170, 40));
        jPanel1.add(jtxtrgtApellidosRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 170, 40));
        jPanel1.add(jtxtrgtSedeRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 170, 40));
        jPanel1.add(jtxtrgtCelularRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 170, 40));
        jPanel1.add(jtxtrgtCorreoRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 170, 40));

        jbtnRegistrarRCP.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarRCP.setText("REGISTRAR");
        jbtnRegistrarRCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarRCPActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarRCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarRCPActionPerformed
        SqlRecepcion msql = new SqlRecepcion();
        Recepcion mod= new Recepcion();
        
        String pass = new String(jtxtrgtPasswordRCP.getPassword());
        String passCon = new String(jtxtrgtConfirmarPassRCP.getPassword());
        if(jtxtrgtUsuarioRCP.getText().equals("")|| pass.equals("")||passCon.equals("")||jtxtrgtNombresRCP.getText().equals("")
                ||jtxtrgtApellidosRCP.getText().equals("")||jtxtrgtSedeRCP.getText().equals("")||jtxtrgtCelularRCP.getText().equals("")
                ||jtxtrgtCorreoRCP.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
        if(pass.equals(passCon)){
            try {
                if(msql.existeRecepcion(jtxtrgtUsuarioRCP.getText())==0)
                {
                    String nuevoPass= hs.sha1(pass);
                    
                    mod.setUsuario_rcp(jtxtrgtUsuarioRCP.getText());
                    mod.setContraseña_rcp(nuevoPass);
                    mod.setNombres_rcp(jtxtrgtNombresRCP.getText());
                    mod.setApellidos_rcp(jtxtrgtApellidosRCP.getText());
                    mod.setSede_rcp(jtxtrgtSedeRCP.getText());
                    mod.setCelular_rcp(jtxtrgtCelularRCP.getText());
                    mod.setCorreo_rcp(jtxtrgtCorreoRCP.getText());
                    mod.setId_tipo_rcp(3);
                    
                    try {
                        if(msql.registrar_rcp(mod)){
                            JOptionPane.showMessageDialog(null, "Registro guardado");
                            limpiar();
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistrarRecepcion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                } 
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarRecepcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseña no coinciden");
        }
      }
    }//GEN-LAST:event_jbtnRegistrarRCPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Iniciar.registrarrcp = null;
    }//GEN-LAST:event_formWindowClosing
    private void limpiar(){
        jtxtrgtUsuarioRCP.setText("");
        jtxtrgtPasswordRCP.setText("");
        jtxtrgtConfirmarPassRCP.setText("");
        jtxtrgtNombresRCP.setText("");
        jtxtrgtApellidosRCP.setText("");
        jtxtrgtSedeRCP.setText("");
        jtxtrgtCelularRCP.setText("");
        jtxtrgtCorreoRCP.setText("");
    }
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
            java.util.logging.Logger.getLogger(RegistrarRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRecepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jbtnRegistrarRCP;
    private javax.swing.JTextField jtxtrgtApellidosRCP;
    private javax.swing.JTextField jtxtrgtCelularRCP;
    private javax.swing.JPasswordField jtxtrgtConfirmarPassRCP;
    private javax.swing.JTextField jtxtrgtCorreoRCP;
    private javax.swing.JTextField jtxtrgtNombresRCP;
    private javax.swing.JPasswordField jtxtrgtPasswordRCP;
    private javax.swing.JTextField jtxtrgtSedeRCP;
    private javax.swing.JTextField jtxtrgtUsuarioRCP;
    // End of variables declaration//GEN-END:variables

}