import java.util.Locale;
import java.util.Scanner;


public class ExercicioSeis {
    public static void main(String[] args) {

        //Exercício 06

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a*c) / 2.0;
        circulo = Math.pow(c, 2.0) * Math.PI;
        trapezio = ((a + b) * c) / 2.0;
        quadrado = Math.pow(b, 2.0);
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);

    }
}