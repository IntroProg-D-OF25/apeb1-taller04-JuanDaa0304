import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int edad;
        double costoxKilovatio, kilovatios_consumidos, planilla_valor, descuento = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo por kilovatio/hora: ");
        costoxKilovatio = teclado.nextDouble();
        System.out.println("Ingresa el número de kilovatios consumidos en el mes: ");
        kilovatios_consumidos = teclado.nextDouble();
        System.out.println("Ingresar su edad: ");
        edad = teclado.nextInt();
        planilla_valor = costoxKilovatio * kilovatios_consumidos;
        if (edad > 65) {
            descuento = planilla_valor * 0.10;
            planilla_valor -= descuento;
        }
        if (descuento > 0) {
        System.out.println("Se hizo el descuento del 10%: $" + descuento);
        }
        System.out.println("El valor total a pagar por la planilla de luz es: $" + planilla_valor);
    }
}

/***
 * debug
 *          SIN DESCUENTO
 * Ingresa el costo por kilovatio/hora: 
7
Ingresa el número de kilovatios consumidos en el mes: 
200
Ingresar su edad: 
64
El valor total a pagar por la planilla de luz es: $1400.0
*           CON DESCUENTO
* Ingresa el costo por kilovatio/hora: 
7
Ingresa el número de kilovatios consumidos en el mes: 
200
Ingresar su edad: 
66
Se hizo el descuento del 10%: $140.0
El valor total a pagar por la planilla de luz es: $1260.0
 */    

