import java.util.Scanner;

//Realizar un programa el cual solicite el nombre de su mascota,
// edad de la mascota, el tipo de mascota y su nombre completo.
// Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es
// un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años y [Nombre Completo] es actualmente su dueño(a).

public class PedirDatos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre de tu mascota?:");
        var nombreMascota = sc.nextLine();

        System.out.println("Ingresa el tipo de tu mascota:");
        var tipoMascota = sc.nextLine();

        System.out.println("¿Cual es tu nombre?:");
        var nombre = sc.nextLine();

        System.out.println("¿Cual es tu primer apellido?:");
        var apellido1 = sc.nextLine();

        System.out.println("¿Cual es tu segundo apellido?:");
        var apellido2 = sc.nextLine();

        System.out.println("¿Que edad tiene tu mascota?:");
        var edadMascota = sc.nextInt();

        var nombreCompleto = nombre + " "+ apellido1 + " " + apellido2;

        System.out.println(nombreMascota + " "+ "es un(a)" +" "+ tipoMascota + ", "+ "el cual, tiene" + " "+ edadMascota + " "+ "años y" + " "+nombreCompleto + " "+ "es actualmente su dueño(a).");

    }
}
