// Crear una función que invierta una cadena
package mispracticas.java;
import java.util.Scanner;

public class e3_funcionInvertirFrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String miFrase = "";
        
        System.out.print("Ingrese una frase: ");
        miFrase = input.nextLine();
        
        input.close();
        
        // Llamado de la función invertirFrase
        System.out.println(invertirFrase(miFrase));  
    }
    
    // Creación de función invertirFrase
    public static String invertirFrase(String frase){
        String fraseInvertida = "";
        
        for(int i = frase.length()-1; i >= 0; i--){
            fraseInvertida += frase.charAt(i); // se ira acumulando cada caracter en la variable fraseInvertida
        }
        
        return fraseInvertida;
    }
}
