package Clases;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class LaTex_formulas {
    
    public static TeXIcon funcZcal(String x, String n, String P) {
        String latexFormula = "Z_{\\text{cal}} = \\frac{\\frac{" + x + "}{" + n + "} - " + P + "}{\\sqrt{\\frac{" + P + "(1-" + P + ")}{" + n + "}}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod1(int x, int n, double P) {
        String latexFormula = "Z_{\\text{cal}} = \\frac{\\frac{" + x + "}{" + n + "} - " + P + "}{\\sqrt{\\frac{" + P + "(1-" + P + ")}{" + n + "}}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod2(int x, int n, double P) {
        double p = (double) x/n;
        double piRes = 1 - P;
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + p + " - " + P + "}{\\sqrt{\\frac{" + P + "(" + piRes + ")}{" + n + "}}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    
    
    
    
    public static TeXIcon setIcono(String x){
        TeXFormula formula = new TeXFormula(x);
        TeXIcon iconFormulaZcal = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);
        return iconFormulaZcal;
    }
}
