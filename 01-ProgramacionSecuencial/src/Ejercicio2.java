/*
* Calcular y muestra el cuadrado de cada entero 1-9
*
* */

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double entero1 = 0.0;
        String salida = "";

        //Calcular el cuadrado de algun entero
        salida = Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero entero: ")), 2);


    }
}
