import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Leer un tipo int
        var scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = scanner.nextInt();
        System.out.println("edad = " + edad);
        //Leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = scanner.nextDouble();
        System.out.println("altura = " + altura);
        scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("nombre = " + nombre);
        //Conversión de datos
        
        //Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        var enteroString = scanner.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        //Tipo flotante
        System.out.println("Proporcina un valor flotante: ");
        var flotante = Float.parseFloat(scanner.nextLine());
        System.out.println("flotante = " + flotante);
        //Double.parseDouble();
        //Boolean.parseBoolean();

    }
}
