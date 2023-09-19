
package Clases;

public class Validaciones {
    public static void validarEntradas(String plantHipo, int sig, int propHipo, int muestra, int exito) {
        if (plantHipo.equals("-------------Seleccione--------------")) {
            throw new IllegalArgumentException("Ingrese un planteamiento de hipótesis válido");
        }
        if (muestra <= 0 || exito <= 0) {
            throw new IllegalArgumentException("Ingrese valores mayores a 0");
        }
        if (exito > muestra) {
            throw new IllegalArgumentException("Las ocurrencias de éxito deben ser menores o iguales al tamaño de muestra");
        }
    }
}