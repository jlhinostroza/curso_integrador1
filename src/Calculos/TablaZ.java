package Calculos;

public class TablaZ {

    public static double Caso3 (int significancia) {
        double[] izq = {-2.325, -2.055, -1.885, -1.775, -1.645, -1.555, -1.475, -1.405, -1.345, -1.285};
        return izq[significancia - 1];
    }

    public static double Caso2 (int significancia) {
        double[] der = {2.325, 2.055, 1.885, 1.775, 1.645, 1.555, 1.475, 1.405, 1.345, 1.285};
        return der[significancia - 1];
    }
    
    public static double Caso1A (int significancia) {
        double[] izq = {-2.585, -2.325, -2.17, -2.055, -1.96, -1.885, -1.815, -1.745, -1.695, -1.645};
        return izq[significancia - 1];
    }
    
    public static double Caso1B (int significancia) {
        double[] der = {2.585, 2.325, 2.17, 2.055, 1.96, 1.885, 1.815, 1.745, 1.695, 1.645};
        return der[significancia - 1];
    }
}
