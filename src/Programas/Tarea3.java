//Encuentra el factorial de un número
package Programas;
import java.util.Scanner;
public class Tarea3 {
    public static void main(String[] args){
        //Declarar variables
        int i=1,f=1,num;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese el número para calcular el factorial:");
        num=lectura.nextInt();
        //Proceso de datos
        while (i<=num){
            f=f*i;
            i++;
        }
        //Salida de datos
        System.out.println("El factorial de "+num+" es: "+f);
    }
}
