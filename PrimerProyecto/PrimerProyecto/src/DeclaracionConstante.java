

public class DeclaracionConstante {
    public static void main(String[] args) {
        final int a = 8;

        System.out.println(a);


        //El siguiente código dará un error y no nos va a permitir ejecutar el código.

        // a = 14;
        

        //Creamos un pequeño conversor de medidas

        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm / apulgadas;

        System.out.println(resultado);




    }
}
