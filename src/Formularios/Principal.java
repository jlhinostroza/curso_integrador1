package Formularios;

import Calculos.*;
import Clases.*;
import static Clases.definirGrafico.defGrafico;
import org.scilab.forge.jlatexmath.TeXIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Principal extends javax.swing.JFrame {

    String plantHipo = null;
    int propHipo = 0;
    int sig = 0;
    int muestra = 0;
    int exito = 0;

    TeXIcon iconFormulaZcal;
    public String simbolo1 = null;
    public String simbolo2 = null;
    public double resZtab1 = 0;
    public double resZtab2 = 0;
    public double resZcal;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("HipoTest - " + DatosPrograma.version);
        jInternalFrame1.setVisible(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/ICONO.png"));
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel31.setText(DatosPrograma.version);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labProd3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labGrafico = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarConclusiones = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labEcuacion = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        labProd1 = new javax.swing.JLabel();
        labProd2 = new javax.swing.JLabel();
        labProd4 = new javax.swing.JLabel();
        labProd5 = new javax.swing.JLabel();
        labProd6 = new javax.swing.JLabel();
        labPaso1a = new javax.swing.JLabel();
        labPaso1b = new javax.swing.JLabel();
        labPaso2 = new javax.swing.JLabel();
        labResZcal = new javax.swing.JLabel();
        labResZtab1 = new javax.swing.JLabel();
        labZcal = new javax.swing.JLabel();
        labZtab1 = new javax.swing.JLabel();
        labResZtab2 = new javax.swing.JLabel();
        labZtab2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mitGuardar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sliSig = new javax.swing.JSlider();
        tfiSig = new javax.swing.JTextField();
        sliProp = new javax.swing.JSlider();
        tfiHipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboPlantHipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        butIngresar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tpaExito = new javax.swing.JTextField();
        tpaMuestra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitNuevaOp = new javax.swing.JMenuItem();
        mitSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitBorrar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mitEjecutar = new javax.swing.JMenuItem();
        mitMaterial = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mitTablaZ = new javax.swing.JMenuItem();
        mitAcercaProg = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(899, 730));
        setPreferredSize(new java.awt.Dimension(899, 730));
        setSize(new java.awt.Dimension(899, 730));

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Desarrollo");
        jInternalFrame1.setVisible(true);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(903, 1496));
        jScrollPane1.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(897, 1490));
        jPanel1.setPreferredSize(new java.awt.Dimension(897, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Paso 5: Conclusiones ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1250, 370, 20));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Paso 1: Planteo de la hipótesis");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Paso 2: Establecer nivel de significancia");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 370, -1));
        jPanel1.add(labProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 200, 110));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Paso 3: Estadístico de prueba");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 360, 30));

        labGrafico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 960, 490, 250));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Paso 4: Región de rechazo");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 360, 30));

        tarConclusiones.setEditable(false);
        tarConclusiones.setColumns(20);
        tarConclusiones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarConclusiones.setRows(5);
        jScrollPane2.setViewportView(tarConclusiones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1280, 820, 160));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Creado con:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, -1, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_IS.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        labEcuacion.setIcon(iconFormulaZcal);
        labEcuacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Fórmula:"));
        jPanel1.add(labEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, 110));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Procedimiento (Z Tabulada):");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));
        jPanel1.add(labProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 200, 110));
        jPanel1.add(labProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 200, 110));
        jPanel1.add(labProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 200, 110));
        jPanel1.add(labProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 200, 110));
        jPanel1.add(labProd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 200, 110));
        jPanel1.add(labPaso1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 30));
        jPanel1.add(labPaso1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 30));
        jPanel1.add(labPaso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));
        jPanel1.add(labResZcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 160, 40));
        jPanel1.add(labResZtab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 390, 50));
        jPanel1.add(labZcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1000, 150, 40));
        jPanel1.add(labZtab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1100, 150, 40));
        jPanel1.add(labResZtab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 390, 50));
        jPanel1.add(labZtab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1140, 150, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Procedimiento (Z Calculada):");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("3°");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("1°");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("2°");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("7°");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("5°");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("6°");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("4°");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Z Tabulada");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1080, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Z Calulada");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 980, -1, -1));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Tipo de prueba:  Hipótesis");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 210, -1));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Objetivo: Poporción poblacional");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 210, -1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("HipoTest Calculator");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 210, -1));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 210, 20));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONO.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 40, 40));

        jScrollPane1.setViewportView(jPanel1);

        jMenu5.setText("Opciones");

        mitGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitGuardar.setText("Guardar operación (Como PDF)");
        mitGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitGuardarActionPerformed(evt);
            }
        });
        jMenu5.add(mitGuardar);

        jMenuBar2.add(jMenu5);

        jInternalFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar datos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 168, -1));

        jLabel2.setText("Proporción hipotetica:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 170, -1));

        jLabel5.setText("Planteamiento de hipótesis:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        sliSig.setMaximum(10);
        sliSig.setMinimum(1);
        sliSig.setValue(5);
        sliSig.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliSigStateChanged(evt);
            }
        });
        jPanel2.add(sliSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 270, -1));

        tfiSig.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfiSig.setEnabled(false);
        jPanel2.add(tfiSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 50, -1));

        sliProp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliPropStateChanged(evt);
            }
        });
        jPanel2.add(sliProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 270, -1));

        tfiHipo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfiHipo.setEnabled(false);
        jPanel2.add(tfiHipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 50, -1));

        jLabel3.setText("10%");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 30, -1));

        jLabel6.setText("0%");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 30, -1));

        jLabel7.setText("1%");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, -1));

        jLabel9.setText("100%");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 40, -1));

        jLabel10.setText("Nivel de significancia:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 170, 20));

        cboPlantHipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------Seleccione--------------", "h0: π = π0 | h1: π ≠ π0", "h0: π ≤ π0 | h1: π > π0", "h0: π ≥ π0 | h1: π < π0" }));
        jPanel2.add(cboPlantHipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        jLabel11.setText("Tamaño de muestra:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));

        jLabel12.setText("Ocaciones de éxito:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, -1));

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
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 220, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 10));

        tpaExito.setBackground(new java.awt.Color(255, 255, 255));
        tpaExito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tpaExito.setText("0");
        tpaExito.setBorder(null);
        jPanel2.add(tpaExito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, -1));

        tpaMuestra.setBackground(new java.awt.Color(255, 255, 255));
        tpaMuestra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tpaMuestra.setText("0");
        tpaMuestra.setBorder(null);
        jPanel2.add(tpaMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_IS.png"))); // NOI18N

        jMenu1.setText("Archivo");

        mitNuevaOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitNuevaOp.setText("Nueva operación");
        mitNuevaOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitNuevaOpActionPerformed(evt);
            }
        });
        jMenu1.add(mitNuevaOp);

        mitSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitSalir.setText("Salir");
        mitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mitSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        mitBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_CLEAR, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitBorrar.setText("Borrar datos ");
        mitBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitBorrarActionPerformed(evt);
            }
        });
        jMenu2.add(mitBorrar);

        jMenuBar1.add(jMenu2);

        jMenu6.setBackground(new java.awt.Color(221, 221, 221));
        jMenu6.setText("Ejecución");

        mitEjecutar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        mitEjecutar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mitEjecutar.setForeground(new java.awt.Color(0, 204, 0));
        mitEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play-16.png"))); // NOI18N
        mitEjecutar.setText("Ejecutar");
        mitEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEjecutarActionPerformed(evt);
            }
        });
        jMenu6.add(mitEjecutar);

        jMenuBar1.add(jMenu6);

        mitMaterial.setText("Recursos");

        jMenuItem5.setText("Material informativo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mitMaterial.add(jMenuItem5);

        mitTablaZ.setText("Tabla Z");
        mitTablaZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTablaZActionPerformed(evt);
            }
        });
        mitMaterial.add(mitTablaZ);

        jMenuBar1.add(mitMaterial);

        mitAcercaProg.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Acerca del programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mitAcercaProg.add(jMenuItem1);

        jMenuBar1.add(mitAcercaProg);

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
                        .addGap(120, 120, 120)
                        .addComponent(jLabel13)))
                .addGap(30, 30, 30)
                .addComponent(jInternalFrame1)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está segur@ de continuar?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!", "", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_mitSalirActionPerformed

    private void mitBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitBorrarActionPerformed
        jInternalFrame1.setVisible(false);
        cboPlantHipo.setSelectedItem("-------------Seleccione--------------");
        sliProp.setValue(50);
        sliSig.setValue(5);
        tpaMuestra.setText("0");
        tpaExito.setText("0");
    }//GEN-LAST:event_mitBorrarActionPerformed

    private void mitNuevaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitNuevaOpActionPerformed
        new Principal().setVisible(true);
    }//GEN-LAST:event_mitNuevaOpActionPerformed

    private void mitGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitGuardarActionPerformed
        capturarImagenComoPDF(this, jScrollPane1);
    }//GEN-LAST:event_mitGuardarActionPerformed

    public static void capturarImagenComoPDF(Component parentComponent, JScrollPane scrollPane) {
        JFileChooser fileChooser = crearFileChooser();
        int selection = fileChooser.showSaveDialog(parentComponent);

        if (selection == JFileChooser.APPROVE_OPTION) {
            String outputPath = getExtensionPDF(fileChooser.getSelectedFile().getAbsolutePath());

            try {
                Document pdfDocument = new Document(PageSize.A4);
                PdfWriter.getInstance(pdfDocument, new FileOutputStream(outputPath));
                pdfDocument.open();

                BufferedImage image = capturaPantalla(scrollPane.getViewport().getView());
                Image imagenEscalada = escalarImagen(image, pdfDocument);

                pdfDocument.add(imagenEscalada);
                pdfDocument.close();

                JOptionPane.showMessageDialog(parentComponent, "¡Operación guardada!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(parentComponent, "Error al guardar el PDF", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static JFileChooser crearFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Guardar PDF");
        return fileChooser;
    }

    private static String getExtensionPDF(String selectedPath) {
        if (!selectedPath.toLowerCase().endsWith(".pdf")) {
            return selectedPath + ".pdf";
        }
        return selectedPath;
    }

    private static BufferedImage capturaPantalla(Component component) {
        int width = 940;
        int height = 1550;
        BufferedImage imagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        component.paint(imagen.getGraphics());
        return imagen;
    }

    private static Image escalarImagen(BufferedImage image, Document document) throws BadElementException, IOException {
        float escalaX = document.getPageSize().getWidth() / image.getWidth();
        float escalaY = document.getPageSize().getHeight() / image.getHeight();
        Image iTextImagen = Image.getInstance(image, null);
        iTextImagen.scaleAbsolute(image.getWidth() * escalaX, image.getHeight() * escalaY);
        return iTextImagen;
    }

    private void butIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIngresarMouseClicked
        ejecutar();
    }//GEN-LAST:event_butIngresarMouseClicked

    private void mitEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEjecutarActionPerformed
        ejecutar();
    }//GEN-LAST:event_mitEjecutarActionPerformed

    public void ejecutar() {
        try {
            setearValores();
            obtenerValores();
            validarEntradas();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese únicamente valores válidos", "Error de cálculo", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setearValores() {
        Modelo.setValPlantHipo((String) cboPlantHipo.getSelectedItem());
        Modelo.setValPropHipo(sliProp.getValue());
        Modelo.setValSig(sliSig.getValue());
        Modelo.setValMuestra(Integer.parseInt(tpaMuestra.getText()));
        Modelo.setValExito(Integer.parseInt(tpaExito.getText()));
    }

    private void obtenerValores() {
        plantHipo = Modelo.getValPlantHipo();
        propHipo = Modelo.getValPropHipo();
        sig = Modelo.getValSig();
        muestra = Modelo.getValMuestra();
        exito = Modelo.getValExito();
    }

    private void validarEntradas() {

        if (!plantHipo.equals("-------------Seleccione--------------")) {
            if (muestra >= exito) {
                if (muestra > 0 && exito > 0) {
                    realizarCalculos();
                    mostrarResultados();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese valores mayores a 0", "Error de cálculo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las ocaciones de éxito debe ser menor al tamaño de muestra", "Error de cálculo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un planteamiento de hipótesis", "Error de cálculo", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void realizarCalculos() {
        resZcal = Calculo.Zcal(exito, muestra, propHipo);
    }

    private void mostrarResultados() {
        jInternalFrame1.setVisible(false);
        labPaso1a.setIcon(iconFormulaZcal);

        iconFormulaZcal = LaTex_formulas.prod1(exito, muestra, (double) propHipo / 100.0);
        labProd1.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.prod2(exito, muestra, (double) propHipo / 100.0);
        labProd2.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.prod3(exito, muestra, (double) propHipo / 100.0);
        labProd3.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.prod4(exito, muestra, (double) propHipo / 100.0);
        labProd4.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.prod5(exito, muestra, (double) propHipo / 100.0);
        labProd5.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.prod6(exito, muestra, (double) propHipo / 100.0);
        labProd6.setIcon(iconFormulaZcal);
        jInternalFrame1.setVisible(true);

        switch (plantHipo) {
            case "h0: π = π0 | h1: π ≠ π0":
                resZtab1 = TablaZ.Caso1A(sig);
                resZtab2 = TablaZ.Caso1B(sig);
                simbolo1 = "=";
                simbolo2 = "≠";
                iconFormulaZcal = LaTex_formulas.opZtab1((double) sig / 100, resZtab1, 1);
                labResZtab1.setIcon(iconFormulaZcal);
                iconFormulaZcal = LaTex_formulas.opZtab2((double) sig / 100, resZtab2, 1);
                labResZtab2.setIcon(iconFormulaZcal);
                iconFormulaZcal = LaTex_formulas.resZtab1(resZtab1);
                labZtab1.setIcon(iconFormulaZcal);
                iconFormulaZcal = LaTex_formulas.resZtab2(resZtab2);
                labZtab2.setIcon(iconFormulaZcal);

                if (resZtab1 < resZcal && resZcal < resZtab2) {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, no hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado no es igual a " + propHipo + "%."
                            + "\n(Se acepta H0)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab1 = " + resZtab1
                            + "\nZtab2 = " + resZtab2);
                } else {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado es igual a " + propHipo + "%."
                            + "\n(Se acepta H1)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab1 = " + resZtab1
                            + "\nZtab2 = " + resZtab2);
                }
                break;

            case "h0: π ≤ π0 | h1: π > π0":
                resZtab1 = TablaZ.Caso2(sig);
                simbolo1 = "≤";
                simbolo2 = ">";
                iconFormulaZcal = LaTex_formulas.opZtab1((double) sig / 100, TablaZ.Caso2(sig), 2);
                labResZtab1.setIcon(iconFormulaZcal);
                iconFormulaZcal = LaTex_formulas.resZtab1(resZtab1);
                labZtab1.setIcon(iconFormulaZcal);
                labZtab2.setIcon(null);
                labResZtab2.setIcon(null);

                if (resZtab1 > resZcal) {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, no hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado no es mayor a " + propHipo + "%."
                            + "\n(Se acepta H0)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab = " + resZtab1);
                } else {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado es mayor a " + propHipo + "%"
                            + "\n(Se acepta H1)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab = " + resZtab1);
                }
                break;

            case "h0: π ≥ π0 | h1: π < π0":
                resZtab1 = TablaZ.Caso3(sig);
                simbolo1 = "≥";
                simbolo2 = "<";
                iconFormulaZcal = LaTex_formulas.opZtab1((double) sig / 100, TablaZ.Caso3(sig), 3);
                labResZtab1.setIcon(iconFormulaZcal);
                iconFormulaZcal = LaTex_formulas.resZtab1(resZtab1);
                labZtab1.setIcon(iconFormulaZcal);
                labZtab2.setIcon(null);
                labResZtab2.setIcon(null);

                if (resZtab1 < resZcal) {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, no hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado no es menor a " + propHipo + "%."
                            + "\n(Se acepta H0)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab = " + resZtab1);
                } else {
                    tarConclusiones.setText("A un nivel de significancia del " + sig + "%, hay suficiente evidencia estadística para rechazar la hipótesis nula (H0)."
                            + "\nEl porcentaje planteado es menor a " + propHipo + "%."
                            + "\n(Se acepta H1)."
                            + "\n==========="
                            + "\nZcal = " + resZcal
                            + "\nZtab1 = " + resZtab1);
                }
                break;
        }

        iconFormulaZcal = LaTex_formulas.funcZcal("X", "n", "p");
        labEcuacion.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.labPaso1a(simbolo1, (double) propHipo / 100);
        labPaso1a.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.labPaso1b(simbolo2, (double) propHipo / 100);
        labPaso1b.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.labPaso2(sig);
        labPaso2.setIcon(iconFormulaZcal);
        iconFormulaZcal = LaTex_formulas.resZcal(resZcal);
        labResZcal.setIcon(iconFormulaZcal);
        labZcal.setIcon(iconFormulaZcal);

        ImageIcon iconoGraf = new ImageIcon(getClass().getResource("/Imagenes/graficos/" + defGrafico(plantHipo, resZtab1, resZtab2, resZcal)));
        labGrafico.setIcon(iconoGraf);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AcercaPrograma().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1cU5FdxxJCnpFmhQc33ka2ibkNddaTxl3/view?usp=drive_link"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mitTablaZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTablaZActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1LC-L229lWSPCGSxy7vQe_Ab5LeyEn_ly/view?usp=drive_link"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_mitTablaZActionPerformed

    private void sliPropStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliPropStateChanged
        propHipo = sliProp.getValue();
        tfiHipo.setText(String.valueOf(propHipo) + "%");
    }//GEN-LAST:event_sliPropStateChanged

    private void sliSigStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliSigStateChanged
        sig = sliSig.getValue();
        tfiSig.setText(String.valueOf(sig) + "%");
    }//GEN-LAST:event_sliSigStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labEcuacion;
    private javax.swing.JLabel labGrafico;
    private javax.swing.JLabel labPaso1a;
    private javax.swing.JLabel labPaso1b;
    private javax.swing.JLabel labPaso2;
    private javax.swing.JLabel labProd1;
    private javax.swing.JLabel labProd2;
    private javax.swing.JLabel labProd3;
    private javax.swing.JLabel labProd4;
    private javax.swing.JLabel labProd5;
    private javax.swing.JLabel labProd6;
    private javax.swing.JLabel labResZcal;
    private javax.swing.JLabel labResZtab1;
    private javax.swing.JLabel labResZtab2;
    private javax.swing.JLabel labZcal;
    private javax.swing.JLabel labZtab1;
    private javax.swing.JLabel labZtab2;
    private javax.swing.JMenu mitAcercaProg;
    private javax.swing.JMenuItem mitBorrar;
    private javax.swing.JMenuItem mitEjecutar;
    private javax.swing.JMenuItem mitGuardar;
    private javax.swing.JMenu mitMaterial;
    private javax.swing.JMenuItem mitNuevaOp;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitTablaZ;
    private javax.swing.JSlider sliProp;
    private javax.swing.JSlider sliSig;
    private javax.swing.JTextArea tarConclusiones;
    private javax.swing.JTextField tfiHipo;
    private javax.swing.JTextField tfiSig;
    private javax.swing.JTextField tpaExito;
    private javax.swing.JTextField tpaMuestra;
    // End of variables declaration//GEN-END:variables
}
