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
public class Ejercicio7extrawhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
        // El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
        // Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
        
        Scanner sc = new Scanner(System.in);

        int n, num, contador;
        double suma = 0, promedio = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        System.out.print("Ingrese la cantidad de números a procesar: ");
        n = sc.nextInt();
        contador = 1;

        while (contador <= n) {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            suma += num;
            promedio = suma / contador;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            contador++;
        }

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
 
    
    }
