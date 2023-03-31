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
public class Ejercicio6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
        // Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
        // y el promedio de estaturas en general.
           
                
            Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de personas: ");
            int N = sc.nextInt();
            
            int contador1 = 0;
            int contador2 = 0;
            double acumulador = 0;
            
            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese la altura de la persona sin puntos " + i + ": ");
                double altura = sc.nextDouble();
                
                if (altura < 1.60) {
                    contador1++;
                }
                
                contador2++;
                acumulador += altura;
            }
            
            double promedio1 = 0;
            double promedio2 = 0;
            
            if (contador1 > 0) {
                promedio1 = acumulador / contador1;
            }
            
            promedio2 = acumulador / contador2;
            
            System.out.println("El promedio de estaturas por debajo de 1.60 mts. es: " + promedio1);
            System.out.println("El promedio de estaturas en general es: " + promedio2);
       }
    }
 }
