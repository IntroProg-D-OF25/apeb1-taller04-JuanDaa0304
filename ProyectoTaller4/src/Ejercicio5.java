import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
    double costo_CPU, costo_teclado, costo_pantalla, costo_mouse, costo_total;
    Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa costo del CPU: ");
        costo_CPU = teclado.nextDouble();
        System.out.println("Ingresa costo del teclado: ");
        costo_teclado = teclado.nextDouble();
        System.out.println("Ingresa costo de la pantalla: ");
        costo_pantalla = teclado.nextDouble();
        System.out.println("Ingresa costo del mouse: ");
        costo_mouse = teclado.nextDouble();
        costo_total = costo_CPU + costo_teclado + costo_pantalla + costo_mouse;
        System.out.println("El costo de una computadora de escritorio es: " + costo_total);
        
        
    }
}
/***
 * debug
 * Ingresa costo del CPU: 
67
Ingresa costo del teclado: 
20
Ingresa costo de la pantalla: 
50
Ingresa costo del mouse: 
10
El costo de una computadora de escritorio es: 147.0
 */