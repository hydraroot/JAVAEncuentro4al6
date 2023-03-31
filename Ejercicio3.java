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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        // Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
        // se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra de 8 caracteres: ");
        String frase = sc.nextLine();
        if(frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
