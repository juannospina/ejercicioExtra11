/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package ejercicioextra11;

import java.util.Scanner;

public class EjercicioExtra11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // se divide por 10 para que el dcimal se vaya desplazando a la izquierda hasta que la division llegue a 0.
        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        
        System.out.println("El número de dígitos es: " + contador);
    }
}
