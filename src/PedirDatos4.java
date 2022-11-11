import java.util.Scanner;

//Realizar un programa el cual solicite el nombre de una ciudad capital y el país.
// Al finalizar debe imprimir en pantalla el siguiente mensaje "La ciudad [Nombre de la Ciudad],
// es la capital del país [Nombre del País]

public class PedirDatos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un país:");
        var nombrePais = sc.nextLine();

        System.out.println("¿Cual es la capital del pais que ingresaste?");
        var capital = sc.nextLine();

        System.out.println("La ciudad" + " "+ capital +" "+"es la capital del país"+" "+nombrePais);
        
    }
}
