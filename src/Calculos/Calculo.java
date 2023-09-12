package Calculos;

public class Calculo {

    public static double Zcal(int x, int n, double P) {
        double pMuestralObservada = (double) x / n;
        double desviacionEstandar = Math.sqrt((P * (1 - P)) / n);
        double Zcal = (pMuestralObservada - P) / desviacionEstandar;

        return Zcal;
    }
}
