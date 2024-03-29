/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import Modelos.Recepcion;
import Modelos.SqlRecepcion;
import Modelos.hs;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author K
 */
public class LoginRecepcion extends javax.swing.JFrame {

    /**
     * Creates new form LoginRecepcion
     */
    public LoginRecepcion() {
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
        jtxtlogUsuarioRCP = new javax.swing.JTextField();
        jbtnIngresarRCP = new javax.swing.JButton();
        jtxtlogPasswordRCP = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION RECEPCION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, 30));
        jPanel1.add(jtxtlogUsuarioRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 170, 30));

        jbtnIngresarRCP.setBackground(new java.awt.Color(255, 255, 255));
        jbtnIngresarRCP.setText("INGRESAR");
        jbtnIngresarRCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarRCPActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresarRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 150, 50));
        jPanel1.add(jtxtlogPasswordRCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imag11.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIngresarRCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarRCPActionPerformed
        SqlRecepcion msql= new SqlRecepcion();
        Recepcion mod=new Recepcion();
        Date date = new Date();
        DateFormat fechahora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String pass = new String(jtxtlogPasswordRCP.getPassword());
        
        if(!jtxtlogUsuarioRCP.getText().equals("")&& !pass.equals("")){
            String nuevoPass=hs.sha1(pass);
            mod.setUsuario_rcp(jtxtlogUsuarioRCP.getText());
            mod.setContraseña_rcp(nuevoPass);
            mod.setFecha_rcp(fechahora.format(date).toString());
            
            try {
                if(msql.loginRecepcion(mod)){
                    Iniciar.loginrcp = null;
                    this.dispose();
                    
                    InicioRecepcion iniciorcp= new InicioRecepcion();
                    iniciorcp.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginRecepcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtnIngresarRCPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Iniciar.loginrcp = null;
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(LoginRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRecepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnIngresarRCP;
    private javax.swing.JPasswordField jtxtlogPasswordRCP;
    private javax.swing.JTextField jtxtlogUsuarioRCP;
    // End of variables declaration//GEN-END:variables
}
