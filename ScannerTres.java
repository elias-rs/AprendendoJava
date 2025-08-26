import java.util.Locale;
import java.util.Scanner;


public class ScannerTres {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);

        double x;
        Scanner sc = new Scanner(System.in);


        x = sc.nextDouble();

        System.out.println("Você digitou: " + x);

        


    }
}