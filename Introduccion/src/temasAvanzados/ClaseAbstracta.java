package temasAvanzados;

public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
        figuraGeometrica.numeroLados();
    }
}

//Clase abstracta
abstract class FiguraGeometrica{ //No se puede instanciar
    public abstract void dibujar();

    public void numeroLados(){
        System.out.println("Tengo muchos lados");
    }
}

class Rectangulo extends  FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se dibujo un rectangulo ...");
    }

}

class Circulo extends FiguraGeometrica{

    @Override
    public void  dibujar(){
        System.out.println("Se dibujo un circulo");
    }

    @Override
    public void numeroLados(){
        System.out.println("No tengo lados");
    }
}