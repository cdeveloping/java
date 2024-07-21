/**
 * File: Variables
 * Date: 21/07/2024
 * Version: 1.0
 * Author: Guillermo Ayllon
 * 
 * Last Update: 21/07/2024
 * Last Version: 
 */

public class Variables {
    public static void main(String[] args) {
        
        //Declaramos una primera variable
        byte edad; //Usamos byte para optimizar los recursos del equipo

        //Inicializamos la variable
        edad = 35;

        //Salida por consola del valor que contiene la variable edad
        System.err.println(edad);

        /*
         * Como edad es una variable podemos ir cambiando su valor durante el tiempo de ejecución según necesitemos
         */

         edad = 65;

         System.err.println(edad);


    }
}
