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
public class Ejercicio8extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
        // la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
        // Nota: recordar el uso de la sentencia break.
        
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros = 0, cantidadPares = 0, cantidadImpares = 0;
        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            int numero = entrada.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            cantidadNumeros++;
            if (numero % 5 == 0) {
                break;
            }
            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }
        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    
    }
    
}
