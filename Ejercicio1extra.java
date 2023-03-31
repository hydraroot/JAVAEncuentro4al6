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
public class Ejercicio1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
        // si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un tiempo en minutos: ");
        int minutos = sc.nextInt();

        int dias = minutos / 1440;  // 1440 es el número de minutos en un día
        int horas = (minutos % 1440) / 60;  // El resto de minutos dividido entre 60 da la cantidad de horas restantes

        System.out.println(minutos + " minutos son equivalentes a " + dias + " días y " + horas + " horas.");
    }
      
   }  
        
        

