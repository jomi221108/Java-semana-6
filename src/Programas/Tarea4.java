//Adivina el n�mero que pienso
package Programas;
import java.util.Scanner;
public class Tarea4 {
    public static void main(String[] args){
        //Declarar variables
        int num,intento=0,i=1;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Jugador A: Ingrese el n�mero que el jugador B adivinar� (menor que 10):");
        num=lectura.nextInt();
        //Proceso de datos
        while (intento!=num){
            System.out.print("Intenta de nuevo: ");
            intento = lectura.nextInt();
        }
        //Salida de datos
        System.out.println("�Adivinaste el n�mero secreto!");
    }
}
