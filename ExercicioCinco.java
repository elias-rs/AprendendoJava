import java.util.Locale;
import java.util.Scanner;


public class ExercicioCinco {
    public static void main(String[] args) {


        //Exercício 05

        Locale.setDefault(Locale.US);

        int num1, cod1, num2, cod2;
        double val1, val2, soma;

        Scanner sc = new Scanner(System.in);

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        val1 = sc.nextDouble();
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        val2 = sc.nextDouble();

        soma = (double) ((num1 * val1) + (num2 * val2));

        System.out.printf("VALOR A PAGAR: R$ %.2f", soma);

 

    }
}