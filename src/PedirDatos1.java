import java.util.Scanner;

//Realizar un programa el cual solicite su nombre y apellidos.

public class PedirDatos1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var nombre = sc.nextLine();

        System.out.println("Escribe tu primer apellido:");
        var apellido1 = sc.nextLine();

        System.out.println("Escribe tu segundo apellido:");
        var apellido2 = sc.nextLine();
    }
}

