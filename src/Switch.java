import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner danie = new Scanner(System.in);
        System.out.println("Jakie danie milordzie?");

        String wybraneDanie = danie.nextLine();

        switch (wybraneDanie) {
            case "Pizza":
                System.out.println("Pizza kosztuje 22 zł.");
                break;

            case "Burger":
                System.out.println("Burger kosztuje 23 zł.");
                break;

            case "Makaron":
                System.out.println("Makaron ksoztuje 17 zł.");
                break;
            default:
                System.out.println("Brak takiego dania w menu.");
        }
    }
}
