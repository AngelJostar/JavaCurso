package temasAvanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");


        for (String elemento: miLista){
            System.out.println("elemento = " + elemento);
        }

        //Funciones lambda (Función anonima de un codigo muy compacto)
        
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        } );

        //Metodos de referencia, Sintaxis lambda

        miLista.forEach(System.out::println);

        //Nos evitar hacer miLista.add

        List<String> nombres = Arrays.asList("Pedro", "Ivonne");
        nombres.forEach(System.out::println);

    }
}
