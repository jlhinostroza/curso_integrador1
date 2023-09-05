package Tabla_Z;

public class TablaZ {

    public double TablaZmenor(int significancia) {
        double[] Menor = {-2.325, -2.055, -1.885, -1.775, -1.645, -1.555, -1.475, -1.405, -1.345, -1.285};
        return Menor[significancia - 1];
    }

    public double TablaZmayor(int significancia) {
        double[] Mayor = {2.325, 2.055, 1.885, 1.775, 1.645, 1.555, 1.475, 1.405, 1.345, 1.285};
        return Mayor[significancia - 1];
    }
}
