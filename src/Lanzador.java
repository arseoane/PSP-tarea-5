import java.util.Scanner;

public class Lanzador {
    public static void main(String[] args) {

    }

    public static void factorizar(long n) {
        while (n % 2 == 0) {
            System.out.print(" 2");
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(" " + i);
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(" " + n);
        }
    }
}