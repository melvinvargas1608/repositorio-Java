/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número.
*/
package mispracticas.java;
import java.util.Scanner;

public class e8_funcionDobleTripleRaiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double miNumero;
        
        System.out.print("Digite el numero: ");
        miNumero = input.nextDouble();

        input.close();
        
        // Invocación de las funciones
        System.out.println("Numero elevado a la dos: " + alCuadrado(miNumero));
        System.out.println("Numero elevado a la tres: " + alCubo(miNumero));
        System.out.println("Raiz cuadrada: " + raizCuadrada(miNumero));
    }
    
    // Creación de función alCuadrado
    public static double alCuadrado(double num){
        return Math.pow(num, 2);
    }
    
    // Creación de función alCubo
    public static double alCubo(double num){
        return Math.pow(num, 3);
    }
    
    // Creación de función raizCuadrada
    public static double raizCuadrada(double num){
        return Math.sqrt(num);
    }
}
