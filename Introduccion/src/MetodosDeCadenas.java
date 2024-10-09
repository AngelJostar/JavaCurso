public class MetodosDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        
        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar espacio al inicio y al final
        var cadena2 = " Leo Reyes     ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin empacios = " + cadena2.trim());
    }
}
