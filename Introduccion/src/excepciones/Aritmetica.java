package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0)
            //si usamos la clase Exception, obligamos a usar try chach  cuando se llame al metodo pero debemos agregar throws Exception en esta clase
            throw new RuntimeException("División entre Cero");
        return numerador / denominador;
    }
}
