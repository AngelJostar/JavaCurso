public class Aritmetica {

    int operando1;
    int operando2;

    public Aritmetica(){

    }
    
    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }
    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado: " + resultado);
    }


    public static void main(String[] args) {
        System.out.println("Ejemplo aritmetica");
        var aritmetica1 = new Aritmetica(5,9);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 10;
        aritmetica1.sumar();
        aritmetica1.restar();
    }
}
