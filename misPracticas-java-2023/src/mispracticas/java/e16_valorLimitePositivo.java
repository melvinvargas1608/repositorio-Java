/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
package mispracticas.java;
import java.util.Scanner;

public class e16_valorLimitePositivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int limiteInicial = 0;
        int suma = 0;
        
        System.out.print("Ingrese un valor limite positivo: ");
        limiteInicial = input.nextInt();
        
        do{
            int num;
            System.out.print("Ingrese numero a sumar: ");
            num = input.nextInt();
            
            suma += num;
            
        }while(suma < limiteInicial);
            
        System.out.println("Total: " + suma);
    }
    
}