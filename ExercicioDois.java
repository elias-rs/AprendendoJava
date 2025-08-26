import java.util.Locale;
import java.util.Scanner;


public class ExercicioDois {
    public static void main(String[] args) {

       
        //Exercício 02
        Locale.setDefault(Locale.US);
        double valRaio, area;

        Scanner sc = new Scanner(System.in);
        valRaio = sc.nextDouble();

        area = Math.PI * Math.pow(valRaio, 2.0);
        System.out.printf("A = %.4f", area);



    }
}