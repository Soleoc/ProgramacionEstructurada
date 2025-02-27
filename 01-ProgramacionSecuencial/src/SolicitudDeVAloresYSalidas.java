import java.util.Scanner;

public class SolicitudDeVAloresYSalidas {
    public static void main(String[] args) {
        String nombre;
        int edad;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce tu nombre ");
        nombre = lectura.nextLine();

        System.out.println("Introduce tu edad " + nombre);
        edad = lectura.nextInt();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad " + nombre + " es " + edad);
        

    }
}
