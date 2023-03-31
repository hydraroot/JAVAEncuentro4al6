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
public class Ejercicio14extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
        // Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
        // para averiguar la media de edad de los hijos de todas las familias.
        
        
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        int nFamilias = scanner.nextInt();
        
        int totalHijos = 0;
        int totalEdades = 0;
        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int nHijos = scanner.nextInt();
            totalHijos += nHijos;
            
            for (int j = 1; j <= nHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = scanner.nextInt();
                totalEdades += edad;
            }
        }
        
        double media = (double) totalEdades / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + media);  
        
    }
    
}
