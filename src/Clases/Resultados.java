
package Clases;

import static Formularios.Principal.getValPropHipo;
import static Formularios.Principal.getValSig;
import javax.swing.JLabel;

public class Resultados {
    public static void mostrarZTabla(JLabel tfiSimbolo1, JLabel tfiSimbolo2, JLabel tfih01, JLabel tfih02, JLabel tfiValSignificancia, JLabel tfivalZcal, JLabel tfivalZtab1, JLabel tfivalZtab2, String simbolo1, String simbolo2, double resultadoZTabla1, double resultadoZTabla2, int resZcal, int sig) {
        tfiSimbolo1.setText(simbolo1);
        tfiSimbolo2.setText(simbolo2);

        tfih01.setText(String.valueOf((double) getValPropHipo() / 100));
        tfih02.setText(String.valueOf((double) getValPropHipo() / 100));

        tfiValSignificancia.setText(String.valueOf(getValSig()) + "%");

        tfivalZcal.setText(String.valueOf(resZcal));
        tfivalZtab1.setText(String.valueOf(resultadoZTabla1));
        tfivalZtab2.setText(String.valueOf(resultadoZTabla2));
    }
}