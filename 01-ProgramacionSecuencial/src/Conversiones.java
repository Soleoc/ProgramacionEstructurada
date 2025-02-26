import javax.swing.*;

public class Conversiones {
    public static void main(String[] args) {
        //Declaracion de variables
        double numPies = 0.0;
        double yardas = 0.0;
        double pulgadas = 0.0;
        double centimetros = 0.0;
        double metros = 0.0;
        String salida = '';
        //Entradas
       numPies =  Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de pies"));
        //Proceso
        yardas = numPies/3.0;
        pulgadas = numPies * 12.0;
        centimetros = pulgadas * 2.54;
        metros = centimetros/100;
        //salida

        salida = "Resultados\n" +
                "las conversiones para " + numPies + "pies son: " +
    }
}
