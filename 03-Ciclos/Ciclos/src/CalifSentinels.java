import javax.swing.*;

public class CalifSentinels {
    public static void main(String[] args) {
        boolean SENTINEL = true;
        double calif = 0.0;
        int numAprobados = 0;
        int numReprobados = 0;

        JOptionPane.showMessageDialog(null, "Este Programa cuenta el numero de calificaciones" +
                " aprobatorias y reprobatorias" +
                "\nPara terminar introduce una calificacion con -1");
        int x = 1;
        while(SENTINEL){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + x));
            if (calif!=-1){
                if(calif>=7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
                x++;
            }else{
                SENTINEL = false;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero de Aprobados: " + numAprobados +
                "\nEl numero de Reprobados es: " + numReprobados);
    }
}
