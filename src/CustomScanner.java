import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        System.out.println("Podaj imie: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!" );

        System.out.println("Podaj liczbe: ");
        Scanner scanner2 = new Scanner(System.in);
        int liczbaa = scanner.nextInt();
        int wynik = liczbaa*liczbaa;
        System.out.println("kwadrat tej liczby to " + wynik + "!" );
    }
}
