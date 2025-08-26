import java.util.Locale;
import java.util.Scanner;


public class ExercicioTres {
    public static void main(String[] args) {

        
        //Exercício 03
        int a, b, c, d, diferenca;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        

    }
}