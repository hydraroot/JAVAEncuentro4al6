/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaencuentro4a6;

import java.util.Scanner;

/**
 *
 * @author wds657
 */
public class Ejercicio10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
        // El programa debe indicar al usuario si su respuesta es o no correcta. 
        // En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
        // Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
        
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11); // Genera un número aleatorio entre 0 y 10
        int num2 = (int) (Math.random() * 11); // Genera otro número aleatorio entre 0 y 10
        int resultado = num1 * num2; // Calcula el resultado de la multiplicación
        int respuesta;
        
        System.out.printf("Adivina el resultado de la multiplicación entre %d y %d: ", num1, num2);
        
        do {
            respuesta = sc.nextInt();
            
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto, intenta de nuevo.");
            }
        } while (respuesta != resultado);
        
        sc.close();
        
        
    }
    
}
