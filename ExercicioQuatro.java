import java.util.Locale;
import java.util.Scanner;


public class ExercicioQuatro {
    public static void main(String[] args) {

       
        //Exercício 04
        Locale.setDefault(Locale.US);

        int number, hour;
        double value, salary;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        hour = sc.nextInt();
        value = sc.nextDouble();
        salary = (hour * value);

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, salary);


    }
}