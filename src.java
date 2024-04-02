import java.util.Arrays;
import java.util.Scanner;

public class NombresOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de nombres: ");
        int cantidadNombres = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de ingresar la cantidad

        String[] nombres = new String[cantidadNombres];

        // Solicitar los nombres al usuario
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Ordenar los nombres
        Arrays.sort(nombres);

        // Imprimir los nombres ordenados
        System.out.println("Nombres ordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
