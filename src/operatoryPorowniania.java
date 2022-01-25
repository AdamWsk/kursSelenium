import java.util.Scanner;

public class operatoryPorowniania {
    public static void main(String[] args) {
        Scanner porownanie = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = porownanie.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = porownanie.nextInt();

        boolean result =  firstNumber > secondNumber ;

        System.out.println("Czy pierwsza liczba jest wieksza od drugiej ? " + result);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);

    }
}
