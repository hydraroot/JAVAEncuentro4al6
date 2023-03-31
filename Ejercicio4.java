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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
      //  Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
      //  Nota: investigar la función Substring y equals() de Java.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra: ");
        String frase = sc.nextLine();
        if(frase.charAt(0) == 'A') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
         
    }
    
}
