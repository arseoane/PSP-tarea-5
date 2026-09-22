import java.lang.Process;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("> ");

            if (!sc.hasNextLong()) {
                System.out.println("Por favor, introduce un número entero válido.");
                return;
            }

            long numero = sc.nextLong();

            if (numero <= 1) {
                System.out.println("Introduce un número mayor que 1.");
                return;
            }

            System.out.print(numero + ":");
            Lanzador.factorizar(numero);
            System.out.println();
        }

    }
}
