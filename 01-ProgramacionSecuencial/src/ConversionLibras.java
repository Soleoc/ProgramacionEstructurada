import javax.swing.*;

public class ConversionLibras {
    public static void main(String[] args) {
        /*
        *Escribir un programa que convierta tres numeros de kilogramos a libras ( 1 libra = 0.454)
        *
        *
        * */

        //DECLARACION CONSTANTE
        final double FACTOR_CONVERSION = 0.454;
        //Declaracion de variables de tres números dobles a convertir
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;

        //Solicitar los tres numeros a calcular

        num1=Double.parseDouble(JOptionPane.showInputDialog("Introduce algún número: "));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Introduce otro número: "));
        num3=Double.parseDouble(JOptionPane.showInputDialog("Introduce un ultimo número: "));

        double c1 = 0.0;
        double c2 = 0.0;
        double c3 = 0.0;
        String salida = "";
        //proceso de conversion
        c1 = num1 / FACTOR_CONVERSION;
        c2 = num2 / FACTOR_CONVERSION;
        c3 = num3 / FACTOR_CONVERSION;

        salida = num1 + "Kg " + "en libras es: " + String.format("%.2f", num1 / FACTOR_CONVERSION) +
                "\n" + num2 + "Kg " + "en libras es: " + String.format("%.2f", num2 / FACTOR_CONVERSION) +
                "\n" + num3 + "Kg " + "en libras es: " + String.format("%.2f", num3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null, salida);


    }
}
