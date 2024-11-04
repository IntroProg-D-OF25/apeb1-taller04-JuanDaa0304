import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
      int min_mes;
      double costo_x_minuto, valor_total;
      Scanner teclado = new Scanner (System.in);
        System.out.println("Ingreso del costo x minuto: ");
        costo_x_minuto = teclado.nextDouble();
        System.out.println("Ingreso numero de minutos x mes: ");
        min_mes = teclado.nextInt();
        valor_total = min_mes * costo_x_minuto;
        System.out.println("El valor de la planilla de telefono x mes es: "+ valor_total);
        
    }
}

/***
 * debug
 * Ingreso del costo x minuto: 
1,5
Ingreso numero de minutos x mes: 
20
El valor de la planilla de telefono x mes es: 30.0
 */
