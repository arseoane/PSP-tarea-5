import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
    public static void factorizar(String n) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("factor", String.valueOf(n));

        Process proceso = null;
        proceso = pb.start();

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(proceso.getInputStream())
        );

        String linea;
        while (true) {
            try {
                if (!((linea = lector.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(linea);
        }

        int codigoSalida = 0;
        try {
            codigoSalida = proceso.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Proceso finalizado con código: " + codigoSalida);
    }
}