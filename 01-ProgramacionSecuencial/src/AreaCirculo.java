import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        double Area = 0;
        final double Pi = 3.1416;
        double r = 0;

        r= Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo: "));

        Area= Pi*Math.pow(r,2);

        JOptionPane.showMessageDialog(null, "El valor del radio es :" + Area);


    }
}
