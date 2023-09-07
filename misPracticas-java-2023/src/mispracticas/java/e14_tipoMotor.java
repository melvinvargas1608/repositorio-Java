/*
Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”
*/
package mispracticas.java;
import java.util.Scanner;

public class e14_tipoMotor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tiMotor;
        
        System.out.print("Digite numero entre 1 - 4: ");
        tiMotor = input.nextInt();
        
        // Invocar a la función
        System.out.println(tipoMotor(tiMotor));
    }
    
    // Crear función tipoMotor
    public static String tipoMotor(int tMotor){
        String mensaje;
        if(tMotor == 1){
            mensaje = "La bomba es una bomba de agua";
        }else if(tMotor == 2){
            mensaje = "La bomba es una bomba de gasolina";
        }else if(tMotor == 3){
            mensaje = "La bomba es una bomba de hormigón";
        }else if(tMotor == 4){
            mensaje = "La bomba es una bomba de pasta alimenticia";
        }else{
            mensaje = "No existe un valor válido para tipo de bomba";
        }
        
        return mensaje;
    }
    
}
