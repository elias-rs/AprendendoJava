import java.util.Scanner;


public class MathFunction {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");

        a = sc.nextDouble();

        System.out.println("Digite o valor de b: ");

        b = sc.nextDouble();

        System.out.println("Digite o valor de c: ");

        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - (4*a*c) ;

        x1 = (double) (-b + (Math.sqrt(delta)))/(2.0 * a);
        x2 = (double) (-b - (Math.sqrt(delta)))/(2.0 * a);

        System.out.println("O valor de x1 é: " + x1);
        System.out.println("O valor de x2 é: " + x2);
    }
}