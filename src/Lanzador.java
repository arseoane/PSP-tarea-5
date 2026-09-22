import java.lang.Process;
import java.util.Scanner;

public class Lanzador {
    public static void main(String[] args){
        //Declaración Scanner para poder pedirle al usuario valores
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario números
        System.out.print("> ");
        ProcessBuilder pb = new ProcessBuilder("factor",sc.next());
    }
}
