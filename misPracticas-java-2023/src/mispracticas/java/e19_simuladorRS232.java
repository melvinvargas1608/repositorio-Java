/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
package mispracticas.java;
import java.util.Scanner;

public class e19_simuladorRS232 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String frase;
        String FDE = "&&&&&";
        
        System.out.print("Digite la palabra o frase: ");
        frase = input.nextLine();
        
        while(frase != FDE){
            int contador;
            if(frase.substring(0, 1).equals("X" && frase.substring(1, -1).equals("O"))){
                contador += 1;
            }else{
                
            }
        }
    }
    
}
