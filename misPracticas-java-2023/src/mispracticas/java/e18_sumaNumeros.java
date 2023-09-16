/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package mispracticas.java;

import java.util.Scanner;

public class e18_sumaNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int suma = 0;
        int numero;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero: ");
            numero = input.nextInt();
            if(numero > 0){
                suma += numero;
            }else if(numero == 0){
                System.out.println("Se capturó en numero 0");
                break;
            }
        }
        
        System.out.println("La suma de los numeros positivos es: " + suma);

    }

}
