/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.
*/
package mispracticas.java;
import java.util.Scanner;

public class e6_funcionMinusculaMayuscula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String palabra = "";
        
        System.out.print("Escriba una frase o palabra: ");
        palabra = input.nextLine();
        
        input.close();
        
        System.out.println("Minuscula: " + convertirAMinuscula(palabra));
        System.out.println("Mayuscula: " + convertirAMayuscula(palabra));
        
    }
    
    // Creación de función convertirAMinuscula
    public static String convertirAMinuscula(String frase){
        return frase.toLowerCase();
    }
    
    // Creación de función convertirAMayuscula
    public static String convertirAMayuscula(String frase){
        return frase.toUpperCase();
    }
    
    
    
}
