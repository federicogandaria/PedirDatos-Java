import java.util.Scanner;

//Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

public class PedirDatos2 {
    public static void main(String[] args) {
        //Entrada de datos, saluda de datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var nombre = sc.nextLine();

        System.out.println("Escribe tu  primer apellido:");
        var apellido1 = sc.nextLine();

        System.out.println("Escribe tu segundo apellido:");
        var apellido2 = sc.nextLine();

        System.out.println("Escribe tu edad:");
        var edad = sc.nextInt();

        System.out.println("Escribe tu estatura:");
        var estatura = sc.nextFloat();
    }
}
