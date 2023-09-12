/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package mispracticas.java;
import java.util.Scanner;
        
public class e17_menuOperaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaración de variables
        int x, y, select;
        String respuesta;
        
        // Entradas
        System.out.print("Digite el primer numero: ");
        x = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        y = input.nextInt();
        
        do {
            // Menu de opciones
            System.out.println("\n");
            System.out.println(" ***** MENU ***** ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Total: " + (x + y));
                    break;
                case 2:
                    System.out.println("Residuo: " + (x - y));
                    break;
                case 3:
                    System.out.println("Producto: " + (x * y));
                    break;
                case 4:
                    System.out.println("Cociente: " + (x / y));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)?");
                    respuesta = input.next();
                    if (respuesta.toUpperCase().equals("S")) {
                        break;
                    }
                default: 
                    System.out.println("Opción incorrecta.");
            }
        } while (select != 5);

        input.close();
    }
    
}
