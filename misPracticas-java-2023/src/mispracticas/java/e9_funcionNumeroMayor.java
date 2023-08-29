// Programa que muestra el mayor de dos números ingresados

package mispracticas.java;
import java.util.Scanner;

public class e9_funcionNumeroMayor {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int num1, num2;
       
        System.out.print("Digite el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = input.nextInt();
        
        input.close();
        
        // Invocació de la función
        System.out.println("El mayor numero digitado es: " + numeroMayor(num1, num2));
    }
    
    // Creación de función numeroMayor
    public static int numeroMayor(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}
