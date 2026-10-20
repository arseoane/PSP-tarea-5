import java.io.IOException;
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
                    Lanzador.factorizar(entrada);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}