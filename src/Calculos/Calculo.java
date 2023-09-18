package Calculos;

public class Calculo {

    public static double Zcal(int x, int n, int P) {
        double pPor = (double) P / 100;
        double pMuestralObservada = (double) x / n;
        double desviacionEstandar = Math.sqrt((pPor * (1 - pPor)) / n);
        double Zcal = (pMuestralObservada - pPor) / desviacionEstandar;
        return Math.round(Zcal*1000.0) / 1000.0;
    }
}
