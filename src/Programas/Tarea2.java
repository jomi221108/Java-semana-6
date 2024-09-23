//Muestra los primeros "x" números
package Programas;
import java.util.Scanner;
public class Tarea2 {
    public static void main(String[] args){
        //Declarar variables
        int i=0,x;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese el número máximo a mostrar:");
        x=lectura.nextInt();
        //Proceso de datos
        while (i<=x){
            System.out.println(i);
            i++;
        }
        //Salida de datos
        
    }
}
