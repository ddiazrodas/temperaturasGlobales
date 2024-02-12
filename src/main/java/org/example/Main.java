package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Pablo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = { {-2, 33}, {-3, 32}, {-8, 27}, {4,37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35} };
        int tempMax = 0;
        int tempMen = 0;
        int posCiudadMax = 0;
        int posCiudadMen = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (temperaturas[i][j] > tempMax) {
                    tempMax = temperaturas[i][j];
                    posCiudadMax = i;
                }
                if (temperaturas[i][j] < tempMen) {
                    tempMen = temperaturas[i][j];
                    posCiudadMen = i;
                }
            }
        }
        System.out.println("La ciudad con mayor temperatura es: " + ciudades[posCiudadMax] + " con " + tempMax);
        System.out.println("La ciudad con menor temperatura es: " + ciudades[posCiudadMen] + " con " + tempMen);
    }
}