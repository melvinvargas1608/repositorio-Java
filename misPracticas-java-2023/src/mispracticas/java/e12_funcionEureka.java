/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */
package mispracticas.java;
import java.util.Scanner;

public class e12_funcionEureka {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String palabra;
        
        System.out.print("Por favor ingrese una frase o palabra: ");
        palabra = input.nextLine();
        
        // Invocación de la función
        System.out.println(funcionEureka(palabra));
    }
    
    // Creación de funcionEureka
    public static String funcionEureka(String frase){
        String mensaje;
        if(frase.equals("eureka")){
            mensaje = "Correcto";
        }else{
            mensaje = "Incorrecto";
        }
        
        return mensaje;
    }
    
}