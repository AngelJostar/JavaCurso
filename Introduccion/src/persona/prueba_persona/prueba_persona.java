package persona.prueba_persona;

import persona.Persona;

public class prueba_persona {
    public static void main(String[] args) {
        var persona = new Persona("Luis Angel", "Rojas Espinoza");
        System.out.println("El nombre del administrador es: " + persona.getNombre() + " " + persona.getApellido());
        persona.setNombre("Itzel Azucena");
        persona.setApellido("Delgado Díaz");
        System.out.println("El nuevo administrador es: " + persona.getNombre() + " " + persona.getApellido());
    }
}
