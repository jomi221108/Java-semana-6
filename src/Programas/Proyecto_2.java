package Programas;
public class Proyecto_2 {
    public static void main(String[] args){
        //Declarar variables
        int i=0;
        int conteo=0;
        int suma=0;
        //Entrada de datos
        
        //Proceso de datos
        System.out.println("Números pares menores a 20");
        while (i<20){
            if(i%2==0){
                conteo=conteo+1;
                suma=suma+i;
                System.out.print(i+", ");
            }
            i=i+1;
        }
        //Salida de datos
        System.out.println("Conteo: "+conteo);
        System.out.println("Suma: "+suma);
    }
}
