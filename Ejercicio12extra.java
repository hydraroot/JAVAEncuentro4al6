/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaencuentro4a6;

/**
 *
 * @author wds65
 */
public class Ejercicio12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
        // con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
        // 0-0-0
        // 0-0-1
        // 0-0-2
        // 0-0-E
        // 0-0-4
        // 0-1-2
        // 0-1-E
   for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String strI = Integer.toString(i);
                    String strJ = Integer.toString(j);
                    String strK = Integer.toString(k);
                    if (strI.equals("3")) {
                        strI = "E";
                    }
                    if (strJ.equals("3")) {
                        strJ = "E";
                    }
                    if (strK.equals("3")) {
                        strK = "E";
                    }
                    System.out.println(strI + "-" + strJ + "-" + strK);
            }
          }
        }
      }
    }        