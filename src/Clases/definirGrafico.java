package Clases;

public class definirGrafico {

    public static String defGrafico(String valPlantHipo, double Ztab1, double Ztab2, double Zcal) {
        String rutImagen = null;
        switch (valPlantHipo) {
            case "h0: π = π0 | h1: π ≠ π0":
                if (Ztab1 < Zcal && Zcal < Ztab2) {
                    rutImagen = "CASO1-ACEPTO.png";
                } else if (Ztab1 > Zcal) {
                    rutImagen = "CASO1-RECHAZO1.png";
                } else if (Ztab2 < Zcal) {
                    rutImagen = "CASO1-RECHAZO2.png";
                }
                break;
            case "h0: π ≤ π0 | h1: π > π0":
                if (Ztab1 > Zcal) {
                    rutImagen = "CASO2-ACEPTO.png";
                } else {
                    rutImagen = "CASO2-RECHAZO.png";
                }
                break;
            case "h0: π ≥ π0 | h1: π < π0":
                if (Ztab1 < Zcal) {
                    rutImagen = "CASO3-ACEPTO.png";
                } else {
                    rutImagen = "CASO3-RECHAZO.png";
                }
                break;
        }
        return rutImagen;
    }
}
