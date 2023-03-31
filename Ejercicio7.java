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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        // este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
        // tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
        // Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos 
        // (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        // Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
        // Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

        Scanner sc = new Scanner(System.in);
        String input = "";
        int correctInputs = 0, incorrectInputs = 0;

        while (!input.equals("&&&&&")) {
            System.out.print("Ingrese una cadena: ");
            input = sc.nextLine();

            if (input.equals("&&&&&")) {
                System.out.println("Fin del envío de datos.");
            } else if (input.length() == 5 && input.substring(0, 1).equals("X") && input.substring(4, 5).equals("O")) {
                System.out.println("Cadena correcta: " + input);
                correctInputs++;
            } else {
                System.out.println("Cadena incorrecta: " + input);
                incorrectInputs++;
            }
        }

        System.out.println("\nInforme final:");
        System.out.println("Cantidad de lecturas correctas: " + correctInputs);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectInputs);
    }      
    }

