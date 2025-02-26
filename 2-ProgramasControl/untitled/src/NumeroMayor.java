import javax.swing.JOptionPane;
public class NumeroMayor {
    public static void main(String[] args) {
        //declaracion de variables
        String menu = "";
        int opcion = 0;
        double resultado = 0.0, numero1 = 0.0, numero2 = 0.0;

        menu = "MENU PRINCIPAL\n" +
                "a)Sumar\nb)Restar\n" +
                "c)Multiplicar\n" +
                "d)Dividir\n" +
                "e)Modulo\n" +
                "Elegir una opcion";

        opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero 2"));
        if (numero2 > 0.0) {
            switch (opcion) {
                case 1:
                    //suma
                    resultado = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    break;
                case 2:
                    //resta
                    resultado = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    break;
                case 3:
                    //multiplicacion
                    resultado = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
                    break;
                case 4:
                    //Division
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "La division es: " + resultado);
                    break;
                case 5:
                    //modulo
                    resultado = numero1 % numero2;
                    JOptionPane.showMessageDialog(null, "El modulo es: " + resultado);
                    break;
                default:

            }
        }
        else {

        }
    }
}
