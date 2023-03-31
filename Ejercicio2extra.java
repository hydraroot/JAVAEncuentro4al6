/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaencuentro4a6;

/**
 *
 * @author wds657
 */
public class Ejercicio2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, 
        // realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
        // Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        int temp = B;
        B = C;
        C = A;
        A = D;
        D = temp;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + C + ", B: " + D + ", C: " + B + ", D: " + A);

        System.out.println("Valores finales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
        
    }
