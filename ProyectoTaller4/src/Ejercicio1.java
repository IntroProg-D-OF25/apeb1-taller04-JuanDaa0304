
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES - DATOS DE ENTRADA Y SALIDA
            double baseTriag, altoTriang, areaTriag;
            Scanner teclado = new Scanner(System.in); //Para leer valores desde consola
            //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
            //BLOQUE DE LECTURA DE DATOS DE ENTRADA
            System.out.println("DAME LA BASE DEl T. :");
            baseTriag = teclado.nextDouble();
            System.out.println("DAME LA ALTURA DEL T. :");
            altoTriang = teclado.nextDouble();
            //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
            areaTriag = (baseTriag * altoTriang) / 2;
            //BLOQUE DE SALIDA DE RESULTADOS
            System.out.println("AREA DEL T. =" + areaTriag);
            
    }
    
}

/***
 * debug:
 * DAME LA BASE DEl T. :
4
DAME LA ALTURA DEL T. :
4
AREA DEL T. =8.0
 */ 