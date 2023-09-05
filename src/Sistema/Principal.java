package Sistema;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;

public class Principal extends javax.swing.JFrame {

    static int valPropHipo = 0;
    static int valSig = 0;
    static int valMuestra = 0;
    static int valExito = 0;
    static String valPlantHipo = "";

    public static int getValPropHipo() {
        return valPropHipo;
    }

    public static void setValPropHipo(int valPropHipo) {
        Principal.valPropHipo = valPropHipo;
    }

    public static int getValSig() {
        return valSig;
    }

    public static void setValSig(int valSig) {
        Principal.valSig = valSig;
    }

    public static int getValMuestra() {
        return valMuestra;
    }

    public static void setValMuestra(int valMuestra) {
        Principal.valMuestra = valMuestra;
    }

    public static int getValExito() {
        return valExito;
    }

    public static void setValExito(int valExito) {
        Principal.valExito = valExito;
    }

    public static String getValPlantHipo() {
        return valPlantHipo;
    }

    public static void setValPlantHipo(String valPlantHipo) {
        Principal.valPlantHipo = valPlantHipo;
    }

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("HipoTest - SNAPSHOT v0.1");

        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/ICONO.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        sliProp.addChangeListener((ChangeEvent e) -> {
            valPropHipo = sliProp.getValue();
            tfiHipo.setText(String.valueOf(getValPropHipo()));
        });

        sliSig.addChangeListener((ChangeEvent e) -> {
            valSig = sliSig.getValue();
            tfiSig.setText(String.valueOf(getValSig()));
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfiSimbolo2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfiSimbolo1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sliSig = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        tfiSig = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfiHipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboPlantHipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spiExito = new javax.swing.JSpinner();
        spiMuestra = new javax.swing.JSpinner();
        sliProp = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        butIngresar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(899, 730));
        setPreferredSize(new java.awt.Dimension(899, 730));
        setSize(new java.awt.Dimension(899, 730));

        jInternalFrame1.setTitle("Desarrollo");
        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Paso 4: Región de rechazo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 370, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("?");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 40, -1));

        tfiSimbolo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfiSimbolo2.setText("?");
        jPanel1.add(tfiSimbolo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("π0");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 43, -1));

        tfiSimbolo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfiSimbolo1.setText("?");
        jPanel1.add(tfiSimbolo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("π0");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 43, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("h1: π");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 43, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Paso 1: Plateo de la hipótesis");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("h0: π");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 43, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Paso 2: Establecer nivel de significancia");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 370, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("α = ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 40, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zcal.jpg"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 110));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Paso 3: Estadístico de prueba");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 20));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Graficos/CASO1-RECHAZO1.jpg"))); // NOI18N
        jLabel25.setText("?");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 290, 110));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Paso 4: Región de rechazo");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 370, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 330, 60));

        jScrollPane1.setViewportView(jPanel1);

        jMenu5.setText("Opciones");

        jMenuItem7.setText("Imprimir");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar2.add(jMenu5);

        jInternalFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar datos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 168, -1));

        jLabel2.setText("Proporción hipotetica:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setText("Planteamiento de hipótesis:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        sliSig.setMaximum(10);
        sliSig.setMinimum(1);
        sliSig.setValue(5);
        jPanel2.add(sliSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 270, -1));

        jLabel4.setText("%");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 20));

        tfiSig.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfiSig.setEnabled(false);
        tfiSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiSigActionPerformed(evt);
            }
        });
        jPanel2.add(tfiSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, -1));

        jLabel8.setText("%");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 30));

        tfiHipo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfiHipo.setEnabled(false);
        tfiHipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiHipoActionPerformed(evt);
            }
        });
        jPanel2.add(tfiHipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 40, -1));

        jLabel3.setText("10%");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel6.setText("0%");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setText("1%");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel9.setText("100%");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel10.setText("Nivel de significancia:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        cboPlantHipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------Seleccione--------------", "h0: π = π0 | h1: π ≠ π0", "h0: π ≤ π0 | h1: π > π0", "h0: π ≥ π0 | h1: π < π0" }));
        jPanel2.add(cboPlantHipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        jLabel11.setText("Tamaño de muestra:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel12.setText("Ocaciones de éxito:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        spiExito.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(spiExito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, -1));

        spiMuestra.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(spiMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, -1));
        jPanel2.add(sliProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 270, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setForeground(new java.awt.Color(0, 204, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        butIngresar.setBackground(new java.awt.Color(255, 255, 255));
        butIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butIngresar.setForeground(new java.awt.Color(255, 255, 255));
        butIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butIngresar.setText("Ejecutar");
        butIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 260, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_IS.png"))); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Nueva operación");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Cerrar sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Editar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_CLEAR, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Borrar datos ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu6.setBackground(new java.awt.Color(221, 221, 221));
        jMenu6.setText("Ejecución");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 204, 0));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play-16.png"))); // NOI18N
        jMenuItem8.setText("Ejecutar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Historial");

        jMenuItem5.setText("Ver historial");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Borrar historial");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ayuda");

        jMenuItem1.setText("Acerca del programa");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel13)))
                .addGap(46, 46, 46)
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "¿Está segur@ de continuar?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!", "", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new IniciarSesion().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Principal().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tfiHipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiHipoActionPerformed
    }//GEN-LAST:event_tfiHipoActionPerformed

    private void tfiSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiSigActionPerformed
    }//GEN-LAST:event_tfiSigActionPerformed

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        valPlantHipo = (String) cboPlantHipo.getSelectedItem();
        valMuestra = (int) spiMuestra.getValue();
        valExito = (int) spiExito.getValue();
        valSig = sliSig.getValue();
        valPropHipo = sliProp.getValue();

    }//GEN-LAST:event_jMenu6MenuSelected

    private void butIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIngresarMouseClicked
        this.setVisible(false);
        new Principal().setVisible(true);
        JOptionPane.showMessageDialog(null, "¡Bienvenid@!", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butIngresarMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butIngresar;
    private javax.swing.JComboBox<String> cboPlantHipo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSlider sliProp;
    private javax.swing.JSlider sliSig;
    private javax.swing.JSpinner spiExito;
    private javax.swing.JSpinner spiMuestra;
    private javax.swing.JTextField tfiHipo;
    private javax.swing.JTextField tfiSig;
    private javax.swing.JLabel tfiSimbolo1;
    private javax.swing.JLabel tfiSimbolo2;
    // End of variables declaration//GEN-END:variables
}
