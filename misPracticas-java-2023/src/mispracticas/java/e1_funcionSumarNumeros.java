package mispracticas.java;
import java.util.Scanner;

public class e1_funcionSumarNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero1, numero2, total;
        
        System.out.print("Digite el primer numero: ");
        numero1 = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        numero2 = input.nextInt();
        
        input.close(); // cierre Scanner
        
        // Llamado de la función
        System.out.println("Total: " + sumarNumeros(numero1, numero2)); // paso parámetros a función
    }
    
    // Creación de función sumarNumeros
    public static int sumarNumeros(int a, int b){
        return a + b;
    }
}
