// Función que resta dos números
package mispracticas.java;
import java.util.Scanner;

public class e2_funcionRestarNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Digite el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = input.nextInt();
        
        input.close(); // cierre Scanner
        
        // Llamado de la función
        System.out.println("Diferencia: " + restarNumeros(num1, num2));
        
    }
    
    // Creación de función restarNumeros
    public static int restarNumeros(int a, int b){
        return a - b;
    }
}
