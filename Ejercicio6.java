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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //  TODO code application logic here
       //  Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá 
       //  mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
       //  si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
       //  ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa dos números enteros positivos: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int opcion;
        char confirmacion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("La suma de los dos números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta del segundo número con el primero es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división del primer número con el segundo es: " + ((double)num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirmacion = sc.next().charAt(0);
                    if(confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("¡Hasta luego!");
                        break;
                    }
                    else {
                        opcion = 0;
                        break;
                    }
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while(opcion != 5);
    }   
               
  }

