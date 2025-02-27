import javax.swing.*;

public class Expresiones {
    public static void main(String[] args) {
       // double e1 = 2+5*3.0/2+5.0*(2+2);

       // double a= 1, b= 2, x= 3, z= 4;
       // double r2 = Math.pow((Math.sqrt(Math.pow(a-b, 2))/(4*x)),z -1);

        double r = 0;
        double r2 = 0;
        double a=0, y=0, z=0, x=0, b=0;
        String salida = "";

        a= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
        y= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y: "));
        z= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de z: "));
        x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
        b= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b: "));

        r= Math.pow(a + Math.pow(y, z+1)/(x-1),2);
        r2 = Math.pow((Math.sqrt(Math.pow(a-b, 2))/(4*x)),z -1);

        salida = "El resultado  de la expresion 1: " + r +
                "\nEl resultado  de la expresion 2: ";
        JOptionPane.showMessageDialog(null, salida);
        System.out.println();
    }
}
