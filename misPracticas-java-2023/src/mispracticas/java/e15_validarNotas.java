/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package mispracticas.java;
import java.util.Scanner;

public class e15_validarNotas {
    
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        int nota;
       
        System.out.print("Ingrese una nota (0 - 10): ");
        nota = input.nextInt();
        
        while(nota < 0 || nota > 10){
            System.out.print("Ingrese una nota valida entre 0 - 10: ");
            nota = input.nextInt(); 
        }
        
        System.out.println(nota + " es una nota valida.");
    }
   
}