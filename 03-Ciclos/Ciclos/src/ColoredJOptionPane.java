import javax.swing.*;
import java.awt.*;

public class ColoredJOptionPane {
    public static void main(String[] args) {
        // Crear un JLabel con el texto que deseas mostrar
        JLabel label = new JLabel("¡Hola, Mundo!");
        label.setForeground(Color.WHITE); // Cambiar el color del texto a blanco

        // Crear un JPanel y establecer el color de fondo
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(Color.BLACK); // Cambiar el color de fondo a azul
        panel.add(label);

        // Mostrar el JPanel en un JOptionPane
        JOptionPane.showMessageDialog(null, panel, "Mensaje de Color", JOptionPane.INFORMATION_MESSAGE);
    }
}