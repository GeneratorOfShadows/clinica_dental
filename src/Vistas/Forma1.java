/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Diego
 */
public class Forma1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Forma1() {
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

        medico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTablaMedico = new javax.swing.JTable();
        jbtnCerrarForma1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medico.setBackground(new java.awt.Color(153, 255, 255));
        medico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA MEDICOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        medico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblTablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "CODIGO", "NOMBRE", "APELLIDO", "CORREO", "CELULAR", "SEDE", "ESPECIALIZACION", "HONORARIOS"
            }
        ));
        jScrollPane1.setViewportView(jtblTablaMedico);

        medico.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 950, 400));

        jbtnCerrarForma1.setText("CERRAR");
        jbtnCerrarForma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarForma1ActionPerformed(evt);
            }
        });
        medico.add(jbtnCerrarForma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 120, 30));

        getContentPane().add(medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1010, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarForma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarForma1ActionPerformed
        this.dispose();      
    }//GEN-LAST:event_jbtnCerrarForma1ActionPerformed

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
            java.util.logging.Logger.getLogger(Forma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCerrarForma1;
    public javax.swing.JTable jtblTablaMedico;
    private javax.swing.JPanel medico;
    // End of variables declaration//GEN-END:variables
}