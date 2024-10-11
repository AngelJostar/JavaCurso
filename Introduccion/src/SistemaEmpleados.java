import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SISTEMA DE EMPLEADOS");
        var scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        var nombreEmpleado = scanner.nextLine();
        System.out.print("Introduce la edad: ");
        var edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el salario");
        var salario = Double.parseDouble(scanner.nextLine());
        System.out.println("Es jefe del departamento");
        var isJefe = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Felicidades suscribiste al nuevo empleado: \n" + nombreEmpleado + "" + edad + salario + isJefe);


    }
}
