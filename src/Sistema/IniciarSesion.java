package Sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("HipoTest - SNAPSHOT v0.1");

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/ICONO.png"));
        setIconImage(icono.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfiUsuario1 = new javax.swing.JTextField();
        tfiContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        butIngresar = new javax.swing.JLabel();
        butRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        labLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_IS.png"))); // NOI18N
        jPanel1.add(labLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 203, 69));

        jLabel2.setText("Código de usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        tfiUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        tfiUsuario1.setBorder(null);
        tfiUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(tfiUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 20));

        tfiContrasena.setBackground(new java.awt.Color(255, 255, 255));
        tfiContrasena.setBorder(null);
        tfiContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(tfiContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 250, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 250, 20));

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));
        jPanel2.setForeground(new java.awt.Color(0, 204, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        butIngresar.setBackground(new java.awt.Color(255, 255, 255));
        butIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butIngresar.setForeground(new java.awt.Color(255, 255, 255));
        butIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butIngresar.setText("Ingresar");
        butIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 250, 40));

        butRegistrar.setForeground(new java.awt.Color(0, 51, 255));
        butRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butRegistrar.setText("<html><u>Si no te encuentras registrado, da click aquí</u></html>");
        butRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(butRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 250, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfiUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiUsuario1ActionPerformed

    private void tfiContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiContrasenaActionPerformed

    private void butIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIngresarMouseClicked
        this.setVisible(false);
        new Principal().setVisible(true);
        JOptionPane.showMessageDialog(null, "¡Bienvenid@!", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butIngresar;
    private javax.swing.JLabel butRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labLogo;
    private javax.swing.JPasswordField tfiContrasena;
    private javax.swing.JTextField tfiUsuario1;
    // End of variables declaration//GEN-END:variables
}
