// Calcular el imc de una persona adulta.
 
package mispracticas.java;
import java.util.Scanner;

public class e11_funcionIMC {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double peso, estatura;
        
        System.out.print("Ingrese su estatura en metros; ");
        estatura = input.nextDouble();
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = input.nextDouble();
        
        input.close();
        
        // Invocar a la función
        System.out.println("IMC: " + imc(peso, estatura));
    }
    
    // Crear función imc
    public static String imc(double p, double e){
       double IMC = p / (e * e);
       String obs;
       
       if(IMC < 18.5){
           obs = "Bajo peso";
       }else if(IMC > 18.5 && IMC < 24.9){
           obs = "Peso saludable";
       }else if(IMC > 25 && IMC < 29.9){
           obs = "Sobrepeso";
       }else{
           obs = "Obesidad";
       }
        return obs;
    }
    
}