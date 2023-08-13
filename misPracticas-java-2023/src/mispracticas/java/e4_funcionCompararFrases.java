// Programa que compara si dos cadenas son iguales. Devuelve true si son iguales, de lo contrario false.
package mispracticas.java;
import java.util.Scanner;

public class e4_funcionCompararFrases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String cadena1, cadena2;
        
        System.out.print("Escriba la primer cadena: ");
        cadena1 = input.nextLine();
        System.out.print("Escriba la segunda cadena: ");
        cadena2 = input.nextLine();
        
        input.close();
        
        // Invovando a la función compararFrases
        System.out.println(compararFrases(cadena1, cadena2));
        
    }
    
    // creación de función compararFrases
    public static boolean compararFrases(String frase1, String frase2){
        
        return frase1.equals(frase2);
    }   
}