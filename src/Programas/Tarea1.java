//Programa que sume números hasta que el usuario ingrese 0
package Programas;
import java.util.Scanner;
public class Tarea1 {
    public static void main(String[] args){
        //Declarar variables
        Scanner lectura=new Scanner(System.in);
        int suma=0,num;
        //Entrada de datos
        System.out.println("Ingresa números para sumarlos (0 para terminar):");
        num=lectura.nextInt();
        //Proceso de datos
        while (num!=0){
            suma=suma+num;
            num=lectura.nextInt();
        }
        //Salida de datos
        System.out.println("La suma total es: "+suma);
    }
}
