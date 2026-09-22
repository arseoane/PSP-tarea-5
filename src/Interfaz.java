import java.lang.Process;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        ProcessBuilder pb = new ProcessBuilder("factor",sc.next());
    }
}
