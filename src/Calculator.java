import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner dodawanie = new Scanner(System.in);
        System.out.println("Podaj zmienna a: 6");
        int a = dodawanie.nextInt();
        System.out.println("Podaj zmienna b: ");
        int b = dodawanie.nextInt();

        int c = a + b;

        System.out.println("Suma a i b = " + c);
    }
}
