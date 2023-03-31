/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaencuentro4a6;

import java.util.Scanner;

/**
 *
 * @author wds65
 */
public class Ejercicio13extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
        // Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
        // 1
        // 12
        // 123
     Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = scanner.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
                
        }
      }
    }
    

    
