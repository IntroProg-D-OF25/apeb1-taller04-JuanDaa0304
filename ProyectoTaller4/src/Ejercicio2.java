import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        Scanner teclado = new  Scanner (System.in);
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.print("DAME LOS GASTOS DEL H1:");
        gastoHijo1 = teclado.nextDouble();
        System.out.print("DAME LOS GASTOS DEL H2:");
        gastoHijo2 = teclado.nextDouble();
        System.out.print("DAME LOS GASTOS DEL H3:");
        gastoHijo3 = teclado.nextDouble();
        totalGastos = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("GASTOS TOTALES:" + totalGastos);
        
    }
}
