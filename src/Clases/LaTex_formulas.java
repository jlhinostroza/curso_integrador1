package Clases;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class LaTex_formulas {
    
    public static TeXIcon labPaso1a(String simbolo1, double pi0) {
        String latexFormula = "H_0: π " + simbolo1 + " " + pi0;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon labPaso1b(String simbolo2, double pi0) {
        String latexFormula = "H_1: π " + simbolo2 + " " + pi0;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon labPaso2(int significancia) {
        String latexFormula = "α = " + significancia + "\\%";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    
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
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + (double) Math.round(p * 1000) / 1000 + " - " + (double) Math.round(P * 1000) / 1000 + "}{\\sqrt{\\frac{" + (double) Math.round(P * 1000) / 1000 + "(" + (double) Math.round(piRes * 1000) / 1000 + ")}{" + n + "}}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod3(int x, int n, double P) {
        double p = (double) x/n;
        double piRes = 1 - P;
        double numerador = p - P;
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + (double) Math.round(numerador * 1000) / 1000 + "}{\\sqrt{\\frac{" + (double) Math.round(P * 1000) / 1000 + "(" + (double) Math.round(piRes * 1000) / 1000 + ")}{" + n + "}}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod4(int x, int n, double P) {
        double p = (double) x/n;
        double piRes = 1 - P;
        double numerador = p - P;
        double denRes = piRes * P;
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + (double) Math.round(numerador * 1000) / 1000 + "}{\\sqrt{\\frac{" + (double) Math.round(denRes * 1000) / 1000 + "}{"+ n +"}}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod5(int x, int n, double P) {
        double p = (double) x/n;
        double piRes = 1 - P;
        double numerador = p - P;
        double denRes = piRes * P;
        double denFraccion = denRes / n;
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + (double) Math.round(numerador * 1000) / 1000 + "}{\\sqrt{" + (double) Math.round(denFraccion * 1000) / 1000 +"}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon prod6(int x, int n, double P) {
        double p = (double) x/n;
        double piRes = 1 - P;
        double numerador = p - P;
        double denominadorFraccion = P * piRes;
        double denominador = Math.sqrt(denominadorFraccion / n);
        String latexFormula = "Z_{\\text{cal}} = \\frac{" + (double) Math.round(numerador * 1000) / 1000 + "}{"+ (double) Math.round(denominador * 1000) / 1000 +"}";
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon resZcal(double resZcal) {
        String latexFormula = "Z_{\\text{cal}} = " + resZcal;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon opZtab1(double significancia, double resZtab1, int caso) {
        double ZaCal = 0;
        switch(caso){
            case 1:
                ZaCal = significancia/2;
                break;
            case 2:
                ZaCal = 1 - significancia;
                break;
            case 3:
                ZaCal = significancia;
                break;
            default:
                break;
        }
        String latexFormula = "Z_{\\text{tab1}} = Z_{\\text{(" + ZaCal +")}} = " + resZtab1;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon opZtab2(double significancia, double resZtab2, int caso) {
        double ZaCal = 1 - (significancia/2);
        String latexFormula = "Z_{\\text{tab2}} = Z_{\\text{(" + ZaCal +")}} = " + resZtab2;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon resZtab1(double resZtab1) {
        String latexFormula = "Z_{\\text{tab1}} = " + resZtab1;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon resZtab2(double resZtab2) {
        String latexFormula = "Z_{\\text{tab2}} = " + resZtab2;
        TeXIcon icono = setIcono(latexFormula);
        return icono;
    }
    
    public static TeXIcon setIcono(String x){
        TeXFormula formula = new TeXFormula(x);
        TeXIcon iconFormulaZcal = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);
        return iconFormulaZcal;
    }
}
