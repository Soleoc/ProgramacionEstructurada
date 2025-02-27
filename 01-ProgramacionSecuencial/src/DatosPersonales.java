import java.util.Scanner;
public class DatosPersonales {
    public static void main(String[] args) {
        int matricula, edad;
        String nombre, apellido1, apellido2, direccion;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce tu matricula ");
        matricula = lectura.nextInt();

        System.out.println("Introduce tu nombre ");
        nombre = lectura.nextLine();

        System.out.println("Introduce tu primer apellido ");
        apellido1 = lectura.nextLine();

        System.out.println("Introduce tu segundo apellido ");
        apellido2 = lectura.nextLine();

        System.out.println("Introduce tu edad");
        edad = lectura.nextInt();

        System.out.println("Introduce tu direccion ");
        direccion = lectura.nextLine();

    System.out.println("" + "" + "" + "" + "");
    }
}
