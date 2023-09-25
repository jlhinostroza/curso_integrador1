


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Agregar Imagen y Texto a PDF");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JButton botonAgregarImagenTexto = new JButton("Agregar Imagen y Texto a PDF");
        frame.add(botonAgregarImagenTexto, BorderLayout.CENTER);

        frame.setVisible(true);

        botonAgregarImagenTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int resultado = fileChooser.showSaveDialog(null);

                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File archivoPDF = fileChooser.getSelectedFile();
                    String texto = obtenerTextoDesdeJTextArea();

                    agregarImagenYTextoAPDF(archivoPDF, texto);
                }
            }
        });
    }

    public static String obtenerTextoDesdeJTextArea() {
        // Aquí obtienes el texto del JTextArea que necesitas
        JTextArea tarConclusiones = new JTextArea();
        return tarConclusiones.getText();
    }

    public static void agregarImagenYTextoAPDF(File archivoPDF, String texto) {
        try {
            // Crear un documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(archivoPDF));
            document.open();

            
            // Agregar el texto obtenido desde el JTextArea al documento PDF
            Paragraph paragraph = new Paragraph(texto);
            document.add(paragraph);

            // Cerrar el documento
            document.close();

            JOptionPane.showMessageDialog(null, "Imagen y texto agregados al PDF y guardados en " + archivoPDF.getAbsolutePath());
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}


