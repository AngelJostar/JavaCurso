package animales;

public class Perro extends Animal {
    public void hacerSonido(){
        System.out.println("Guau Guau");
    }

    @Override
    public void dormir(){
        System.out.println("Duermo 9 horas al dias");
        super.dormir();
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("Ejemplo de herencia");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}