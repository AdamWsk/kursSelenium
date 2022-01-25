import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);
        System.out.println("Podaj zmienna a: ");
        int a = Calculator.nextInt();
        System.out.println("Podaj zmienna b: ");
        int b = Calculator.nextInt();

        int dodawanie  = a + b;
        System.out.println("Suma a i b = " + dodawanie);

        int odejmowanie = a - b;
        System.out.println("Różnica a i b = " + odejmowanie);

        float mnozenie = a * b;
        System.out.println("Iloczyn a i b = " + mnozenie);

        float dzielenie = a/b;
        System.out.println("Iloraz a i b = " + dzielenie);
    }
}
