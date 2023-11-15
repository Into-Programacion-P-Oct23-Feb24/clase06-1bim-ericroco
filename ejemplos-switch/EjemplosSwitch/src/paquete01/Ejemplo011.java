/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        cadena = cadena.toLowerCase();
        
        switch(cadena){
            case "lunes":
                System.out.printf("%s, es el primer dia de la semana", cadena);
                break;
            
            case "martes":
                System.out.printf("%s\n es el segundo dia de la semana", cadena);
                break;
            
            case "miercoles":
                System.out.printf("%s\nes el tercer dia de la semana", cadena);
                break;
                
            case "jueves":
                System.out.printf("%s\nes el cuarto dia de la semana", cadena);
                break;
                   
            case "viernes":
                System.out.printf("%s\nes el quinto dia de la semana", cadena);
                break;
            
            case "sabado":
                System.out.printf("%s\nes el sexto dia de la semana", cadena);
                break;
                
            case "domingo":
                System.out.printf("%s\nes el septimo dia de la semana", cadena);
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
