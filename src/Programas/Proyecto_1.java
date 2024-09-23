package Programas;
import java.util.Scanner;
public class Proyecto_1 {
    public static void main(String[] args){
        //Declarar variables
        Scanner lector = new Scanner(System.in);
        boolean esDiaInvalido=true;
        int dia=0;
        //Entrada de datos
        
        //Proceso de datos
        while(esDiaInvalido) {
            System.out.print("Ingrese día de la semana (1-7): ");
            dia=lector.nextInt();
            lector.nextLine();
            esDiaInvalido=(dia<1||dia>7);
        }
        //Salida de datos
        System.out.println("Dia ingresado: "+dia);
    }
}
