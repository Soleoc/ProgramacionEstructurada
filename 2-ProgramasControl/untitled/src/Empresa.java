import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //declaracion de variables
        double saldo=0.0;
        double prestamo = 0.0;
        double equipoComputo = 0.0;
        double mobilirario = 2000.0;
        double compraInsumos = 0.0;
        double insentivosPresonal=0.0;
        String salida;

        //Solicitar saldo
        saldo=Double.parseDouble
                (JOptionPane.showInputDialog("Introduce tu saldo: "));

        if (saldo<0.0){
            prestamo = 10000.0;
        }else if(saldo>0.0 && saldo<20000.0){
            prestamo = (20000.0 - saldo);
        }else {
            prestamo = saldo;
        }

        equipoComputo = 500;
        prestamo-=equipoComputo;
        prestamo-=mobilirario;
        compraInsumos = prestamo/2;
        insentivosPresonal=prestamo/2;

        salida ="Resultados \n" +
                "Compra de Insumos: " + compraInsumos +
                "\nIncentivos de presonal: " + insentivosPresonal +
                "\nEquipo de computo: " + equipoComputo +
                "\n mobiliario: " + mobilirario;


        JOptionPane.showMessageDialog(null, salida);

    }
}
