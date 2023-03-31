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
public class Ejercicio11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
        // Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
        // Nota: recordar que las variables de tipo entero truncan los números o resultados.
        
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = input.nextInt();
        int contador = 0;
        while(numero != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
       
        
    }
    
}
