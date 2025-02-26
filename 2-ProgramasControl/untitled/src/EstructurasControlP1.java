import javax.swing.JOptionPane;

public class EstructurasControlP1 {
    public static void main(String[] args) {
        // Declaración de variables
        String opcion;
        String menu = "a) Juego\n" +
                "b) Frutería\n" +
                "c) Laboratorio\n" +
                "d) Salir\n" +
                "Elige una opción:";

        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
                String pregunta = "¿Colón descubrió América?";
                String respuesta = JOptionPane.showInputDialog(pregunta + "\n" + "a) Sí\nb) No");

                if (respuesta.equalsIgnoreCase("Si")) {
                    respuesta = JOptionPane.showInputDialog("¿La independencia fue en 1810? (Sí/No)");
                    if (respuesta.equalsIgnoreCase("Si")) {
                        JOptionPane.showMessageDialog(null, "Felicidades, has conseguido la respuesta correcta.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, has fallado.");
                    }
                }
                break;

            case "B":
                double cantidadKilos, precio;
                cantidadKilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilos de manzanas"));

                if (cantidadKilos <= 0) {
                    JOptionPane.showMessageDialog(null, "La cantidad de kilos debe ser mayor que cero.");
                    break;
                }

                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de las manzanas"));

                if (precio < 0) {
                    JOptionPane.showMessageDialog(null, "El precio no puede ser negativo.");
                    break;
                }

                double total = cantidadKilos * precio;
                double descuento = 0.0;

                if (cantidadKilos > 2.0 && cantidadKilos <= 5.0) {
                    descuento = total * 0.15; // 15% de descuento
                } else if (cantidadKilos > 5.0 && cantidadKilos <= 10.0) {
                    descuento = total * 0.20; // 20% de descuento
                }

                total -= descuento;
                JOptionPane.showMessageDialog(null, "El total a pagar con descuento es: $" + total);
                break;

            case "C":
                JOptionPane.showMessageDialog(null, "Bienvenido al laboratorio.");
                break;

            case "D":
                JOptionPane.showMessageDialog(null, "Hasta la vista, el programa ha terminado.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
