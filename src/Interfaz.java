import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nIntroduce un número (o 'salir' para terminar):\n> ");
                String entrada = sc.next();

                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                }

                try {
                    long numero = Long.parseLong(entrada);

                    if (numero <= 1) {
                        System.out.println("Introduce un número mayor que 1.");
                        continue;
                    }

                    System.out.print(numero + ":");
                    Lanzador.factorizar(numero);
                    System.out.println();

                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número entero válido (o 'salir' para terminar).");
                }
            }
        }
    }
}