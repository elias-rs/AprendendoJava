import java.util.Locale;
import java.util.Scanner;


public class ScannerUm {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);

        x = sc.next();

        System.out.println("Você digitou "+ x);

        sc.close();

        


    }
}