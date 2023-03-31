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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario hasta que la suma de los 
       // numeros introducidos supere el limite inicial.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor límite positivo: ");
        int limite = sc.nextInt();
        int suma = 0;
        int numero;
        while(suma <= limite) {
            System.out.println("Ingresa un número: ");
            numero = sc.nextInt();
            suma += numero;
        }
            
    }
    
}
