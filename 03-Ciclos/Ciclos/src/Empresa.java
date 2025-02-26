import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion
        int i=0;
        int numTrabajadores = 0;
        int horasExtras=0;
        int horasTrabajadas=0;
        double salarioTotal=0.0;
        String salida = "";
        numTrabajadores=Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de trabajadores"));

        salida = "Reportes de salarios semanales\n" +
        "Empleado            " + "Horas trabajadas            " + "Horas extra" + "Salario total\n";
        i=1;
        while (i<=numTrabajadores){
            horasTrabajadas=Integer.parseInt
                    (JOptionPane.showInputDialog("numero de horas trabajadas"));

            if (horasTrabajadas<=40){
                salarioTotal=horasTrabajadas*20;
                salida="Empleado " + i + "     " +
                "       " + horasTrabajadas + "       " + horasExtras + "         " + salarioTotal + "\n";
            }else{
                horasExtras=horasTrabajadas-40;
                salarioTotal= 40 * 20 + horasExtras * 25;
                salida="Empleado " + i + "     " +
                        "       " + horasTrabajadas + "       " + horasExtras + "         " + salarioTotal + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
