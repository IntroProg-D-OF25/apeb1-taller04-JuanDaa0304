import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int edad;
        double costoxKilovatio, kilovatios_consumidos, planilla_valor ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo por kilovatio/hora: ");
        costoxKilovatio = teclado.nextDouble();
        System.out.println("Ingresa el número de kilovatios consumidos en el mes: ");
        kilovatios_consumidos = teclado.nextDouble();
        System.out.println("Ingresar su edad: ");
        edad = teclado.nextInt();
        planilla_valor = costoxKilovatio * kilovatios_consumidos;
        System.out.println("Se hace descuento del 10% si es mayor a 65 años de edad: ");
        System.out.println("El valor total a pagar por la planilla de luz es: $" + planilla_valor);
    }
}

/***
 * debug
 * Ingresa el costo por kilovatio/hora: 
7
Ingresa el número de kilovatios consumidos en el mes: 
250
Ingresar su edad: 
35
Se hace descuento del 10% si es mayor a 65 años de edad: 
El valor total a pagar por la planilla de luz es: $1750.0
 */    

