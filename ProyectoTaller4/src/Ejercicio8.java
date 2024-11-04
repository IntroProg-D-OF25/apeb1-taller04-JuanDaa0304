import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        int edad;
        double costoNetflix, costoYoutubePremium, costoDropbox, costoSpotify, total_mensual;
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
        System.out.println("Se descuenta el 20% si la persona es menor a 30 años " );
        System.out.println("El valor tota a pagar mensual de servicios digitales de una persona es: $" + total_mensual);
    }
}
/***
 * debug
 * Ingresa costo mensual de netflix: 29,99
Ingresa costo mensual de Youtube Premium: 
19,99
Ingresa costo mensual de Dropbox: 
25
Ingresa costo mensual de Spotify: 
24,99
Ingresa edad de la persona: 
25
Se descuenta el 20% si la persona es menor a 30 años 
El valor tota a pagar mensual de servicios digitales de una persona es: $99.96999999999998
 */