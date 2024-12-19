package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        System.out.println("Ejemplo aritmetica");
        var aritmetica1 = new Aritmetica(5,9);
        System.out.println("Atributo Operando 1: " + aritmetica1.getOperando1());
        System.out.println("Atributo Operando 2: " + aritmetica1.getOperando2());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 10;
        aritmetica1.sumar();
        aritmetica1.restar();
    }

}
