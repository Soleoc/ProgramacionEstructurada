/*
*Calcular el resultado de la expresion n = x+y/y-1,
* para los valores de x y y cualesquiera
*
* */

import javax.swing.*;

public class Expresiones {
    public static void main(String[] args) {
// declaracion de variables
double x = 0.0;
double y = 0.0;
double n = 0.0;
String salida = "";

//solicitar datos
        x=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x; "));
        y=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y; "));

        //calcular la expresion
        n = (x+y)/(y-1);

        //salida de programa
        salida = "El resultado de la expresion es " + String.format(("%.2f"), n);

        JOptionPane.showMessageDialog(null, salida);

    }
}
