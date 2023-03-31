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
public class Ejercicio5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try ( // TODO code application logic here
// Una obra social tiene tres clases de socios:
// Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
// Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
// Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
// Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) 
// y determine el importe en efectivo a pagar por dicho socio.
  
                
                
            Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el tipo de socio (A, B o C): ");
            String tipoSocio = sc.nextLine();
            
            System.out.print("Ingrese el costo del tratamiento: ");
            double costoTratamiento = sc.nextDouble();
            
            double importeAPagar;
            
            switch (tipoSocio) {
                case "A":
                    importeAPagar = costoTratamiento * 0.5;
                    break;
                case "B":
                    importeAPagar = costoTratamiento * 0.65;
                    break;
                default:
                    importeAPagar = costoTratamiento;
                    break;
            }
            
            System.out.println("El importe a pagar es: $" + importeAPagar);
        }
        
               
    }
    
}
