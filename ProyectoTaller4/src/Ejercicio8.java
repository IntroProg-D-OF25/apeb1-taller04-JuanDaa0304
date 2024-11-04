import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        int edad;
        double costoNetflix, costoYoutubePremium, costoDropbox, costoSpotify, total_mensual, descuento = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa costo mensual de netflix: ");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingresa costo mensual de Youtube Premium: ");
        costoYoutubePremium = teclado.nextDouble();
        System.out.println("Ingresa costo mensual de Dropbox: ");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingresa costo mensual de Spotify: ");
        costoSpotify = teclado.nextDouble();
        System.out.println("Ingresa edad de la persona: ");
        edad = teclado.nextInt();
        total_mensual = costoNetflix + costoYoutubePremium + costoDropbox + costoSpotify;
        if (edad < 30 ) {
        descuento = total_mensual * 0.20;
        total_mensual -= descuento;
        }
        if (descuento > 0) {
         System.out.println("Se hizo el descuento del 20%: $" + descuento);
        }
        System.out.println("El valor tota a pagar mensual de servicios digitales de una persona es: $" + total_mensual);
    }
}
/***
 * debug
 *          CON DESCUENTO
 * Ingresa costo mensual de netflix: 30
Ingresa costo mensual de Youtube Premium: 
20
Ingresa costo mensual de Dropbox: 
24,99
Ingresa costo mensual de Spotify: 
27,99
Ingresa edad de la persona: 
25
Se hizo el descuento del 20%: $20.596
El valor tota a pagar mensual de servicios digitales de una persona es: $82.38399999999999
*          SIN DESCUENTO
* Ingresa costo mensual de netflix: 30
Ingresa costo mensual de Youtube Premium: 
20
Ingresa costo mensual de Dropbox: 
24,99
Ingresa costo mensual de Spotify: 
27,99
Ingresa edad de la persona: 
35
El valor tota a pagar mensual de servicios digitales de una persona es: $102.97999999999999
 */