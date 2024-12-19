package javabases;

import java.util.Scanner;

public class LeerLinea {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre");
        var linea = scanner.nextLine();
        System.out.println("Tu nombre es: " + linea);
    }
}
