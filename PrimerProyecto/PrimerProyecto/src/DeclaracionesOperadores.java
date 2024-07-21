/**
 * Date: 21/07/2024
 */
public class DeclaracionesOperadores {
    public static void main(String[] args) {

        //Vamos a declarar varias variables que usaremos con los operadores.

        int a,b;

        int suma, resta, multiplicacion, division;

        String nombre, apellido, concatenacion;

        a = 10;
        b = 5;

        //Suma 
        suma = a + b;
        System.out.println(suma);

        //Resta
        resta = a - b;
        System.out.println(resta);

        //Multiplicación
        multiplicacion = a * b;
        System.out.println(multiplicacion);

        //División
        division = a / b;
        System.err.println(division);

        //Concatenación
        nombre = "Carlos";
        apellido = "Pascual";
        concatenacion = nombre + " " + apellido;
        System.out.println(concatenacion);
        
    }
    
}
