/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package mispracticas.java;
import java.util.Scanner;

public class e7_funcionCentigradosAFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double gCentigrados;
        
        System.out.print("Digite la cantidad de grados centigrados a convertir: ");
        gCentigrados = input.nextDouble();
        
        input.close();;
        
        // Invocación de la función centigradosAFahrenheit 
        System.out.println("Grados Fahrenheit: " + centigradosAFahrenheit(gCentigrados));
        
    }
    
    // Creación de función centigradosAFahrenheit
    public static double centigradosAFahrenheit(double gradosC){
        double gradosF = 0;
        
        gradosF = 32 + (9 * gradosC / 5);
        
        return gradosF;
    }
    
}
