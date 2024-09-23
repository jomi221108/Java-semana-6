//Adivina el número que pienso
package Programas;
import java.util.Scanner;
public class Tarea4 {
    public static void main(String[] args){
        //Declarar variables
        int num,intento=0,i=1;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Jugador A: Ingrese el número que el jugador B adivinará (menor que 10):");
        num=lectura.nextInt();
        //Proceso de datos
        while (intento!=num){
            System.out.print("Intenta de nuevo: ");
            intento = lectura.nextInt();
        }
        //Salida de datos
        System.out.println("¡Adivinaste el número secreto!");
    }
}
