package javabases;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Numeros Aleatorios");
        var random = new Random();

        //Generar un numero aleatorio entre 0 y 9
        var nmeroAleatorio = random.nextInt(10);
        System.out.println("nmeroAleatorio entre 0 y 9= " + nmeroAleatorio);

        //Generar un numero aleatorio entre 1 y 10
        nmeroAleatorio = random.nextInt(10) + 1;
        System.out.println("nmeroAleatorio entre 1 y 10 = " + nmeroAleatorio);

        //Generar un nmero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        //simular el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(5) + 1;
        System.out.println("dado = " + dado);
    }
}
