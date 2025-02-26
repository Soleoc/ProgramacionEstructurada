import javax.swing.*;

public class CalificacionesSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        double calif = 0.0;
        int numAprobados = 0;
        int numReprobados = 0;

        JOptionPane.showInputDialog(null, "Este programa cuenta el numero de calificaciones" +
                " aprobatorias y reprobatioras" +
                "\nPara terminar introduce una calificacion con -1");

        int x=1;
        while(calif!=SENTINEL){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + x));

            if (calif!=SENTINEL){
                if(calif>-7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
                x++;
            }
        }
    }
}
