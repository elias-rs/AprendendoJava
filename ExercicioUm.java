import java.util.Locale;
import java.util.Scanner;


public class ExercicioUm {
    public static void main(String[] args) {

        //Exercício 01
        int a, b, soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        a = sc.nextInt();

        System.out.println("Informe o segundo numero: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        
    }
}