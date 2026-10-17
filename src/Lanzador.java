import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
    public static void factorizar(long n) {
        try{
            ProcessBuilder pb = new ProcessBuilder("factor", String.valueOf(n));

            // 2. Iniciar el proceso
            Process proceso = pb.start();

            // 3. Leer la salida estándar del proceso
            BufferedReader lector = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream())
            );

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            // 4. Esperar a que termine y obtener el código de salida
            int codigoSalida = proceso.waitFor();
            System.out.println("Proceso finalizado con código: " + codigoSalida);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}