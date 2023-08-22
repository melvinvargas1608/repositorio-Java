/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package mispracticas.java;
import java.util.Scanner;

public class e10_funcionParImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero1;
        
        System.out.print("Digite un numero: ");
        numero1 = input.nextInt();
        
        input.close();
        
        //Invocar a la función
        System.out.println(parImpar(numero1));
        
    }
    
    //Creación de función parImpar
    public static String parImpar(int num){
        String mnsj = "";
        if(num % 2 == 0){
            mnsj = "El numero digitado es par.";
        }else{
            mnsj = "El numero digitado es impar";
        }
        
        return mnsj;
    }
}