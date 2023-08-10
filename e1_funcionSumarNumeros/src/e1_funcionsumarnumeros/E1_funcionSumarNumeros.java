package e1_funcionsumarnumeros;
import java.util.Scanner;

public class E1_funcionSumarNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese el primer valor: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = input.nextInt();
        
        // Llamado de la función
        System.out.println("Total: " + SumarNumeros(num1, num2));
        
    }
    
    // Función SumarNumeros
    public static int SumarNumeros(int a, int b){
        
        return a + b;
    }
    
}
