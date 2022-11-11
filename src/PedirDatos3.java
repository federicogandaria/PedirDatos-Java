import java.util.Scanner;

//Realizar un programa el cual solicite su nombre y apellidos,
// también debe capturar nombre y apellidos de su padre y madre.
// Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo],
// soy hijo de [Nombre de la Madre] y [Nombre del Padre].

public class PedirDatos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var nombre = sc.nextLine();

        System.out.println("Escribe tu primer apellido:");
        var apellido1 = sc.nextLine();

        System.out.println("Escribe tu segundo apellido:");
        var apellido2 = sc.nextLine();

        var miNombreCompleto = nombre +" "+ apellido1 + " "+ apellido2;

        System.out.println("Escribe nombre de tu padre:");
        var nombrePadre = sc.nextLine();

        System.out.println("Escribe el primer apellido de tu padre:");
        var apellidoPadre1 = sc.nextLine();

        System.out.println("Escribe el segundo apellido de tu padre:");
        var apellidoPadre2 = sc.nextLine();

        var padreNombreCompleto = nombrePadre +" "+ apellidoPadre1 + " "+ apellidoPadre2;

        System.out.println("Escribe nombre de tu madre");
        var nombreMadre = sc.nextLine();

        System.out.println("Escribe el primer apellido de tu madre:");
        var apellidoMadre1 = sc.nextLine();

        System.out.println("Escribe el segundo apellido de tu madre:");
        var apellidoMadre2 = sc.nextLine();

        var madreNombreCompleto = nombreMadre +" "+ apellidoMadre1 + " "+ apellidoMadre2;

        System.out.println("Yo" + " " + miNombreCompleto+", "+ "soy hijo de " + nombreMadre +" "+"y" +" "+ nombrePadre+ "." );

    }
}
