import java.util.Scanner;

public class pracaDomowa18lat {
    public static void main(String[] args) {
        Scanner jakiWiek = new Scanner(System.in);

        System.out.println("Ile masz lat?");

        int wiek = jakiWiek.nextInt();

        if (wiek >= 18) {
            System.out.println("Możesz kupić alkohol.");
        } else if ( wiek < 0 ){
            System.out.println("Podaj wartość większą od 0.");
        }
        else if (wiek < 18) {
            System.out.println("Nie możesz kupić alkoholu boś gówniarz.");
        }
    }
}