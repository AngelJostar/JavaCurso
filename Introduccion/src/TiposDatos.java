public class TiposDatos {
    public static void main(String[] args) {
        //Entero (su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2134213453;
        System.out.println("tipoInt = " + tipoInt);
        //Podemos agregar una L al final para indicar que es tipo long
        long tipoLong = 988324343032435132L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto flontate (valor default 0.0)

        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.135D;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (valor default '\u0000')

        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        //Booleano valor default (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object (Referencia)
        String nombre = null; //valor default
        System.out.println("nombre = " + nombre);
    }
}
