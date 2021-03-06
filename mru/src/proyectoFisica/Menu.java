/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFisica;

/**
 *
 * @author PC
 */
public class Menu extends javax.swing.JFrame {
    static VistaMru ventana=new VistaMru();
    static VistaMcu ventanaMcu=new VistaMcu();
    static VistaMruV ventanaMruV=new VistaMruV();
    static VistaMovParabolico ventanaMP=new VistaMovParabolico();
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btnMRU = new javax.swing.JButton();
        btnMCU = new javax.swing.JButton();
        btnMCUV = new javax.swing.JButton();
        btnMRUV = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMRU.setBackground(new java.awt.Color(204, 255, 255));
        btnMRU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título3.png"))); // NOI18N
        btnMRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRUActionPerformed(evt);
            }
        });
        getContentPane().add(btnMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 130, 60));

        btnMCU.setBackground(new java.awt.Color(204, 255, 255));
        btnMCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título2.png"))); // NOI18N
        btnMCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCUActionPerformed(evt);
            }
        });
        getContentPane().add(btnMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 130, 60));

        btnMCUV.setBackground(new java.awt.Color(204, 255, 255));
        btnMCUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título6.png"))); // NOI18N
        btnMCUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCUVActionPerformed(evt);
            }
        });
        getContentPane().add(btnMCUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 300, 60));

        btnMRUV.setBackground(new java.awt.Color(204, 255, 255));
        btnMRUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título4.png"))); // NOI18N
        btnMRUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRUVActionPerformed(evt);
            }
        });
        getContentPane().add(btnMRUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_icon-icons.com_70975.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 713, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRUActionPerformed
        ventana.show();
    }//GEN-LAST:event_btnMRUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit( 0 ); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCUActionPerformed
        ventanaMcu.show();
    }//GEN-LAST:event_btnMCUActionPerformed

    private void btnMRUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRUVActionPerformed
        ventanaMruV.show();
    }//GEN-LAST:event_btnMRUVActionPerformed

    private void btnMCUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCUVActionPerformed
        ventanaMP.show();
    }//GEN-LAST:event_btnMCUVActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
               ventana.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMCU;
    private javax.swing.JButton btnMCUV;
    private javax.swing.JButton btnMRU;
    private javax.swing.JButton btnMRUV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
