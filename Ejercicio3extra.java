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
public class Ejercicio3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
        // Nota: investigar la función equals() de la clase String.
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = input.next().toLowerCase(); // convertimos la letra ingresada a minúscula para facilitar la comparación

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
        System.out.println("La letra ingresada no es una vocal.");
                      
       }
    }
}