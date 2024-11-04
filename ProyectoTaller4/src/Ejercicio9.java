import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double Area_tri_rect, base_cuadrado, altura_rect, area_total;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa valor de la base del cuadrado: ");
        base_cuadrado = teclado.nextDouble();
        System.out.println("Ingresa valor de la altura del rectangulo: ");
        altura_rect = teclado.nextDouble();
        Area_tri_rect = ((base_cuadrado * altura_rect) * 3);
        base_cuadrado = (base_cuadrado * base_cuadrado);
        altura_rect = (base_cuadrado * altura_rect);
        area_total = (Area_tri_rect + base_cuadrado + altura_rect);
        System.out.println("El area total es: " + area_total);
        
    }
}
/***
 * debug
 * Ingresa valor de la base del cuadrado: 
4
Ingresa valor de la altura del rectangulo: 
5
El area total es: 156.0
 */