/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
*/
package mispracticas.java;
import java.util.Scanner;
        
public class e13_validaLetraA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String palabra;
        
        System.out.print("Digite una palabra: ");
        palabra = input.nextLine();
        
        // Invocar a la función
        System.out.println(validarLetraA(palabra));
    }
    
    // Crear función validarLetraA
    public static String validarLetraA(String palabra){
        String mensaje;
        
        if(palabra.toUpperCase().substring(0, 1).equals("A")){
           mensaje = "CORRECTO"; 
        }else{
            mensaje = "INCORRECTO";
        }
        return mensaje;
    }
    
}