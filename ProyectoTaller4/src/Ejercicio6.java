import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int Num_Pagos = 12;
        double monto_prestamo, interes_mensual, pago_mensual;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa monto del prestamo: ");
        monto_prestamo = teclado.nextDouble();
        System.out.println("Ingresa interes mensual: ");
        interes_mensual = teclado.nextDouble()/100;
        pago_mensual = (monto_prestamo * interes_mensual) / (1 - Math.pow(1 + interes_mensual, - Num_Pagos));
        System.out.println("El pago mensual del prestamo es: "+ pago_mensual);
    }
}

/***
 * debug
 * Ingresa monto del prestamo: 
650
Ingresa interes mensual: 
5
El pago mensual del prestamo es: 73.33651651352997
 */