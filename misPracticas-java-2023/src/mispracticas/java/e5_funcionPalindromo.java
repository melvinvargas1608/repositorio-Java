// Crear un programa que retorne true si una frase es palindromos,, de lo contrario retorna false.
package mispracticas.java;
import java.util.Scanner;

public class e5_funcionPalindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String miFrase;
        
        System.out.print("Escriba la una palabra: ");
        miFrase = input.nextLine().toLowerCase(); // convertir a minusculas la frase ingresada
        
        System.out.println(palindromo(miFrase));
        
    }
    
    // Crear función palindromo
    public static boolean palindromo(String cadena){
        String fraseInvertida = "";
        
        for(int i = cadena.length()-1; i >= 0; i--){
        
            fraseInvertida += cadena.charAt(i);
        }
        return cadena.equals(fraseInvertida);
    }
    
}