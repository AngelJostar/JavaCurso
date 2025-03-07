package temasAvanzados;

import java.io.Serializable;

//Implementar la interfaz serializale permite mandar información y guardar en la red o disco duro
public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("karla");
        persona.setApellido("Lara");
        System.out.println("Persona = " + persona);
        System.out.println(persona.toString());
    }
}

class Persona implements Serializable {
        private String nombre;
        private String apellido;

        public Persona(){}

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

