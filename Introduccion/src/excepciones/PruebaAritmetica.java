package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        //El bloque finally siempre se va a ejecutar independientemente exista un error o no
        finally {
            System.out.println("Se reviso la división entre cero");
        }



    }
}
